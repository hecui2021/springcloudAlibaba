package com.study.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.study.dto.IASDto;
import com.study.vo.BaseListVO;
import com.study.vo.IASDomainExportVO;
import com.study.vo.IASDomainVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @author peterche
 * @description:
 * @date 2024-12-24
 */
@Slf4j
@Service
public class IASMangageService {

    private static final RestTemplate REST_TEMPLATE = new RestTemplateBuilder()
            .setConnectTimeout(Duration.of(10, ChronoUnit.SECONDS))
            .setReadTimeout(Duration.of(10, ChronoUnit.SECONDS))
            .build();

    @Value("${ias.ak:48b96ed1-6919-49ca-a22c-63965b4b8469}")
    private String ak;

    @Value("${ias.sk:ZmZhYzA0NGItZDA4NS00YTM0LTgzOWEtMTgwYjViMzg5MDc3YjZiZjV4dDM=}")
    private String sk;

    @Qualifier("ias-thread")
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public void exportFile(HttpServletResponse response) throws Exception {
        try {
            // 设置excel下载响应头属性
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("域名列表", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        } catch (Exception e) {
            log.error("response.setHeader error",e);
        }

        BaseListVO<IASDomainVO> baseListVO = listDomain();
        List<IASDomainVO> iasDomainVOList = baseListVO.getList();

        CountDownLatch countDownLatch = new CountDownLatch(iasDomainVOList.size());

        List<IASDomainExportVO> publicCertificationDomainList = new CopyOnWriteArrayList<>();
        List<IASDomainExportVO> privateCertificationDomainList = new CopyOnWriteArrayList<>();

        for (IASDomainVO iasDomainVO : iasDomainVOList) {
            threadPoolTaskExecutor.execute(() -> {
                JSONObject data = getDomain(iasDomainVO.getId());
                IASDomainVO domain = JSONObject.toJavaObject(data, IASDomainVO.class);

                IASDomainExportVO iasDomainExportVO = new IASDomainExportVO();
                iasDomainExportVO.setDomain(iasDomainVO.getDomain());
                iasDomainExportVO.setDomain_net_type(domain.getDomain_net_type() == 1 ? "内网" : "公网");
                iasDomainExportVO.setEnable_auto_cert(iasDomainVO.isEnable_auto_cert() ? "是" : "否");
                IASDomainVO.Certification certification = domain.getCertification();
                IASDomainVO.Business domainBusiness = domain.getBusiness();
                if (domainBusiness != null) {
                    iasDomainExportVO.setPrincipal(domainBusiness.getPrincipal());
                    String linkBusiness = domainBusiness.getPms_dept_name() + "-" +
                            domainBusiness.getPms_biz_set_name() + "-" + domainBusiness.getPms_biz_name() + "-" + domainBusiness.getPms_module_name() + "("
                            + domainBusiness.getName() + ")";
                    iasDomainExportVO.setLinkBusiness(linkBusiness);
                }
                if (certification != null) {
                    iasDomainExportVO.setAlias_name(certification.getAlias_name());
                    iasDomainExportVO.setStart_time(dateTo(certification.getStart_time()));
                    iasDomainExportVO.setEnd_time(dateTo(certification.getEnd_time()));
                }
                if (domain.getDomain_net_type() == 1) {
                    privateCertificationDomainList.add(iasDomainExportVO);
                } else {
                    publicCertificationDomainList.add(iasDomainExportVO);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();

        Collections.sort(publicCertificationDomainList, Comparator.comparing(IASDomainExportVO::getEnd_time));

        publicCertificationDomainList.addAll(privateCertificationDomainList);

        log.info("exportFile iasDomainExportVOList:{}", JSONObject.toJSONString(publicCertificationDomainList));

        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), IASDomainExportVO.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("域名列表").build();

        excelWriter.write(publicCertificationDomainList, writeSheet);

        // 关闭ExcelWriter对象，释放资源
        excelWriter.finish();

    }

    public BaseListVO<IASDomainVO> listDomain() {

        String url = "http://api.apigw.oa.com/IAS/l7/ListDomain";

        IASDto.IASRequest iasRequest = new IASDto.IASRequest(null, false, 1, 200);

        JSONObject responseBody = invoke(url, iasRequest);

        String total = responseBody.getString("total");
        JSONArray list = responseBody.getJSONArray("list");
        List<IASDomainVO> domainVOList = list.toJavaList(IASDomainVO.class);
        BaseListVO<IASDomainVO> baseListVO = new BaseListVO<>(Integer.parseInt(total), domainVOList);

        return baseListVO;
    }

    private String dateTo(String timeStr) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            Date date = inputFormat.parse(timeStr);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            outputFormat.setTimeZone(TimeZone.getDefault()); // 设置输出时区为本地时区
            String formattedTime = outputFormat.format(date);

            return formattedTime;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public JSONObject getDomain(String id) {
        String url = "http://api.apigw.oa.com/IAS/l7/GetDomain";


        IASDto.IASRequest iasRequest = new IASDto.IASRequest();
        iasRequest.setId(id);

        JSONObject responseBody = invoke(url, iasRequest);


        JSONObject data = responseBody.getJSONObject("data");

        return data;
    }

    public Set<String> listDomainVip(String id) {
        Set<String> set = new HashSet<>();

        String url = "http://api.apigw.oa.com/IAS/l7/ListDomainVip";

        IASDto.IASRequest iasRequest = new IASDto.IASRequest();
        iasRequest.setId(id);

        JSONObject responseBody = invoke(url, iasRequest);
        JSONArray vipJSONArray = responseBody.getJSONArray("vip");
        for (int i = 0; i < vipJSONArray.size(); i++) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) vipJSONArray.get(i);
            String vip = (String) linkedHashMap.get("vip");
            if (StringUtils.isNotBlank(vip)) {
                set.add(vip);
            }
        }
        return set;
    }

    private JSONObject invoke(String url, IASDto.IASRequest iasRequest) {
        long startTime = System.currentTimeMillis();
        HashMap valueMap = new HashMap<String, Object>();

        String user = "peterche";
        String requestId = UUID.randomUUID().toString();

        IASDto.IASBase iasBase = new IASDto.IASBase(requestId, user, getToken(requestId, user));

        valueMap.put("base", iasBase);
        valueMap.put("request", iasRequest);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Gateway-Stage", "RELEASE");

        // post 带请求头
        HttpEntity<HashMap<String, Object>> requestEntity = new HttpEntity<>(valueMap, headers);

        ResponseEntity<JSONObject> response = REST_TEMPLATE.postForEntity(url, requestEntity, JSONObject.class);
        log.info("url:{},cost:{},requestEntity:{},responseEntity:{}", url, (System.currentTimeMillis() - startTime),
                JSONObject.toJSONString(requestEntity), JSONObject.toJSONString(response));

        JSONObject responseBody = response.getBody().getJSONObject("response");
        JSONObject baseBody = response.getBody().getJSONObject("base");
        if (!baseBody.getBooleanValue("ok")) {
            log.error("listDomain error base:{}", JSONObject.toJSONString(baseBody));
            throw new RuntimeException("listDomain error");
        }
        return responseBody;
    }

    private String getToken(String uuid, String user) {
        long timestamp = System.currentTimeMillis() / 10000;
        String sha256Str = getSha256String(sk + "-" + timestamp + "-" + uuid + "-" + user);
        String skAndSha256Str = ak + ":" + sha256Str;
        String base64Str = Base64.getEncoder().encodeToString(skAndSha256Str.getBytes());
//        log.info("getToken uuid:{},skAndSha256Str:{},token:{}", uuid, skAndSha256Str, base64Str);
        return base64Str;
    }

    public static String getSha256String(String str) {
        try {
            // 创建SHA-256哈希算法实例
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 计算输入数据的哈希值
            byte[] hashBytes = digest.digest(str.getBytes(StandardCharsets.UTF_8));

            // 将哈希值转换为十六进制字符串
            String hash = bytesToHex(hashBytes);

            // 打印哈希值
            return hash;
        } catch (NoSuchAlgorithmException e) {
            log.error("getSha256String",e);
            return null;
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
