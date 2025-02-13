package com.study.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.study.es.model.AccountBasicinfo;
import com.study.es.service.EsService;
import com.study.mapper.UserMapper;
import com.study.service.DataService;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Author peterche
 * @Description
 * @Date 2023/10/17 19:26
 **/
@Service
@Slf4j
public class DataServiceImpl implements DataService {

    // 每个sheet最多写入10w数据
    private static int PER_SHEET_ROW_COUNT = 100000;

    private static int ES_LENGTH = 10000;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EsService esService;

    @Qualifier("es-thread")
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public void exportFile(String channelId,HttpServletResponse response) throws Exception{
        final long start = System.currentTimeMillis();
        log.info("exportFile start...channelId:{}",channelId);

        try {
            // 设置excel下载响应头属性
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("es列表", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        } catch (Exception e) {
            log.error("response.setHeader error",e);
        }

        List<AccountBasicinfo> basicinfoList = new ArrayList<>();

        long selectCount = 0;
        long startTime = System.currentTimeMillis();

        SearchResponse searchResponse = esService.getScrollt1("f_channel", channelId);
        selectCount += System.currentTimeMillis() - startTime;

        rspToDataList(searchResponse,basicinfoList);

        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), AccountBasicinfo.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("对账列表").build();

        log.info("write first start channelId:{}",channelId);
        excelWriter.write(basicinfoList, writeSheet);
        log.info("write first end channelId:{}",channelId);

        long total = searchResponse.getHits().getTotalHits().value;
        if (total <= ES_LENGTH) {
            esService.getScrollt3(searchResponse);
            // 关闭ExcelWriter对象，释放资源
            excelWriter.finish();
            return;
        }

        //滚动查询部分，将从第10001条数据开始取。
        SearchHit[] scrollHits = searchResponse.getHits().getHits();

        int i = 0;
        while (scrollHits.length > 0) {
            startTime = System.currentTimeMillis();
            searchResponse = esService.getScrollt2(searchResponse);
            selectCount += System.currentTimeMillis() - startTime;
            rspToDataList(searchResponse,basicinfoList);

            log.info("channelId:{} write i:{},size:{} start",channelId,i,basicinfoList.size());
            if (basicinfoList.size() > 0) {
//                writeSheet = EasyExcel.writerSheet("对账列表" + i).build();
                excelWriter.write(basicinfoList, writeSheet);
            }
            log.info("channelId:{} write i:{},size:{}  end",channelId,i,basicinfoList.size());

            scrollHits = searchResponse.getHits().getHits();
            i++;
        }
        esService.getScrollt3(searchResponse);

        // 关闭ExcelWriter对象，释放资源
        excelWriter.finish();

        log.info("exportFile channelId:{} end... selectCount:{},sum cost:{}"
            ,channelId,selectCount,(System.currentTimeMillis() - start));
    }

//    public void export() throws IOException {
//        OutputStream outputStream =null;
//        try {
//            //记录总数:实际中需要根据查询条件进行统计即可
//            Integer totalCount = empMapper.selectCount(null);
//            //每一个Sheet存放100w条数据
//            Integer sheetDataRows = PER_SHEET_ROW_COUNT;
//            //每次写入的数据量20w,每页查询20W
//            Integer writeDataRows = ExcelConstants.PER_WRITE_ROW_COUNT;
//            //计算需要的Sheet数量
//            Integer sheetNum = totalCount % sheetDataRows == 0 ? (totalCount / sheetDataRows) : (totalCount / sheetDataRows + 1);
//            //计算一般情况下每一个Sheet需要写入的次数(一般情况不包含最后一个sheet,因为最后一个sheet不确定会写入多少条数据)
//            Integer oneSheetWriteCount = sheetDataRows / writeDataRows;
//            //计算最后一个sheet需要写入的次数
//            Integer lastSheetWriteCount = totalCount % sheetDataRows == 0 ? oneSheetWriteCount : (totalCount % sheetDataRows % writeDataRows == 0 ? (totalCount / sheetDataRows / writeDataRows) : (totalCount / sheetDataRows / writeDataRows + 1));
//
//            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletResponse response = requestAttributes.getResponse();
//            outputStream = response.getOutputStream();
//            //必须放到循环外，否则会刷新流
//            ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
//
//            //开始分批查询分次写入
//            for (int i = 0; i < sheetNum; i++) {
//                //创建Sheet
//                WriteSheet sheet = new WriteSheet();
//                sheet.setSheetName("测试Sheet1"+i);
//                sheet.setSheetNo(i);
//                //循环写入次数: j的自增条件是当不是最后一个Sheet的时候写入次数为正常的每个Sheet写入的次数,如果是最后一个就需要使用计算的次数lastSheetWriteCount
//                for (int j = 0; j < (i != sheetNum - 1 ? oneSheetWriteCount : lastSheetWriteCount); j++) {
//                    //分页查询一次20w
//                    Page<Emp> page = empMapper.selectPage(new Page(j + 1 + oneSheetWriteCount * i, writeDataRows), null);
//                    List<Emp> empList = page.getRecords();
//                    List<EmpVo> empVoList = new ArrayList<>();
//                    for (Emp emp : empList) {
//                        EmpVo empVo = new EmpVo();
//                        BeanUtils.copyProperties(emp, empVo);
//                        empVoList.add(empVo);
//                    }
//                    WriteSheet writeSheet = EasyExcel.writerSheet(i, "员工信息" + (i + 1)).head(EmpVo.class)
//                        .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).build();
//                    //写数据
//                    excelWriter.write(empVoList, writeSheet);
//                }
//            }
//            // 下载EXCEL
//            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//            response.setCharacterEncoding("utf-8");
//            // 这里URLEncoder.encode可以防止浏览器端导出excel文件名中文乱码 当然和easyexcel没有关系
//            String fileName = URLEncoder.encode("员工信息", "UTF-8").replaceAll("\\+", "%20");
//            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
//            excelWriter.finish();
//            outputStream.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (BeansException e) {
//            e.printStackTrace();
//        }finally {
//            if (outputStream != null) {
//                outputStream.close();
//            }
//        }
//    }



    private void rspToDataList(SearchResponse response,List<AccountBasicinfo> basicinfoList) {
        basicinfoList.clear();
        SearchHit[] hits = response.getHits().getHits();
        for(SearchHit hit : hits){
            AccountBasicinfo basicinfo = new AccountBasicinfo();
            basicinfo.set_id(hit.getId());
            // 源文档内容
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
            basicinfo.setChannel((String) sourceAsMap.get("f_channel"));
            basicinfo.setRegist_time((Long) sourceAsMap.get("regist_time"));
            basicinfoList.add(basicinfo);
        }
    }
}
