package com.study.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.study.pojo.ObsData;
import com.study.service.ObsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author peterche
 * @description:
 * @date 2025-04-24
 */
@Service
@Slf4j
public class ObsServiceImpl implements ObsService {

    @Value("${dewf.ffrwfcw}")
    private String ffrwfcw;

    @Override
    public String uploadFile(String logId, MultipartFile file) {
        log.info("ffrwfcw:{}", ffrwfcw);
        try {
            List<ObsData> obsDataList = EasyExcel.read(file.getInputStream())
                    .excelType(ExcelTypeEnum.CSV)
                    .head(ObsData.class)
                    .sheet()
                    .doReadSync();


            BigDecimal sum = BigDecimal.ZERO;
            for (ObsData obsData : obsDataList) {
                if (obsData.getInstanceId().equals(logId)) {
                    String lastMoney = obsData.getLastMoney();
                    BigDecimal money = new BigDecimal(lastMoney);
                    sum = sum.add(money);
                }
            }
            log.info("uploadFile logId:{}, sum:{}", logId, sum);

            return sum.toString();
        } catch (Exception e) {
            log.error("uploadFile error",e);
        }
        return null;
    }

    @Override
    public String uploadFile2(MultipartFile file) {
        try {
            List<ObsData> obsDataList = EasyExcel.read(file.getInputStream())
                    .excelType(ExcelTypeEnum.CSV)
                    .head(ObsData.class)
                    .sheet()
                    .doReadSync();


            BigDecimal sum = BigDecimal.ZERO;
            Map<String, BigDecimal> map = new HashMap<>();
            for (ObsData obsData : obsDataList) {
                if (obsData.getProductIdV1().equals("p_cls")) {
                    String instanceId = obsData.getInstanceId();
                    String lastMoney = obsData.getLastMoney();
                    BigDecimal money = new BigDecimal(lastMoney);

                    BigDecimal bigDecimal = map.get(instanceId);
                    if (bigDecimal == null) {
                        bigDecimal = new BigDecimal(lastMoney);
                    } else {
                        bigDecimal = bigDecimal.add(money);
                    }
                    map.put(instanceId, bigDecimal);
                }
            }

            // map按照value降序排序
            Map<String, BigDecimal> sortedMap = map.entrySet().stream()
                    .sorted(Map.Entry.<String, BigDecimal>comparingByValue().reversed())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (oldVal, newVal) -> oldVal,
                            LinkedHashMap::new
                    ));

            log.info("sortedMap:{}", sortedMap);


            return sum.toString();
        } catch (Exception e) {
            log.error("uploadFile error",e);
        }
        return null;
    }
}
