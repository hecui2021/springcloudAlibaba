package com.study.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.study.es.model.AccountBasicinfo;
import com.study.mapper.TcAgentQueryMapper;
import com.study.pojo.TcAgentQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2024-12-12
 */
@RestController
@RequestMapping("/openapi")
@Slf4j
public class OpenapiController {

    private static final RestTemplate REST_TEMPLATE = new RestTemplateBuilder()
            .setConnectTimeout(Duration.of(300, ChronoUnit.SECONDS))
            .setReadTimeout(Duration.of(300, ChronoUnit.SECONDS))
            .build();

    @Data
    @AllArgsConstructor
    class Messages {
        private String role;
        private String content;
    }

    @PostMapping("/app_create")
    public String appCreate(@RequestBody Map<String, Object> map) throws Exception {
        String url = "http://stream-server-online-openapi.turbotke.production.polaris:8080/openapi/app_platform/app_create";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer 7auGXNATFSKl7dF");

        HttpEntity<Object> param = new HttpEntity<>(map, headers);

        log.info("req:{}", JSONObject.toJSONString(param));

        // 发送POST请求并接收流式响应
        ResponseEntity<Resource> responseEntity = REST_TEMPLATE.exchange(
                url,
                HttpMethod.POST,
                param, // 请求体，如果不需要可以传null
                Resource.class // 响应体的类型
        );

        // 获取输入流
        InputStream inputStream = responseEntity.getBody().getInputStream();

        String result = getContentFromStream(new InputStreamReader(inputStream, "utf-8"));


//        log.info("response:{}", JSONObject.toJSONString(response));
        log.info("end");

        return null;
    }

    @GetMapping ("/openChatCompletions")
    public JSONObject openChatCompletions(@RequestParam("text") String text) {
        try {
            log.info("openChatCompletions text:{}", text);


            String url = "http://hunyuanapi.woa.com/openapi/v1/chat/completions";

            String authorization = "Bearer ub6I0oyhX1inW8ezaCazj030r11IveOA";

            String model = "hunyuan-funcall";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", authorization);

            JSONObject jsonObject = new JSONObject();

            String toolContent = new String(Files.readAllBytes(Paths.get("/Users/peterche/local/code/myself/myproject/doc/tools/confirm_intention3.json")));

            JSONArray toolsArray = JSONArray.parseArray(toolContent);

            JSONArray messageArray = new JSONArray();
            JSONObject messageObject = new JSONObject();
            messageObject.put("role", "user");
            messageObject.put("content", text);
            messageArray.add(messageObject);

            jsonObject.put("model", model);
            jsonObject.put("messages", messageArray);
            jsonObject.put("tools", toolsArray);
            jsonObject.put("temperature", 0l);
            jsonObject.put("tool_choice", "auto");


            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity<Object> param = new HttpEntity<>(jsonObject, headers);

            log.info("req:{}", JSONObject.toJSONString(param));

            ResponseEntity<String> response = REST_TEMPLATE.postForEntity(url, param, String.class);
            log.info("rsp:{}", JSONObject.toJSONString(response));

            log.info("body:{}", response.getBody());

            JSONObject rspObject = JSONObject.parseObject(response.getBody());

//        if (true) {
//            return rspObject;
//        }

            JSONObject choice = (JSONObject) rspObject.getJSONArray("choices").get(0);
            JSONObject message = choice.getJSONObject("message");
            String content = message.getString("content");

            String finishReason = choice.getString("finish_reason");
            if ("stop".equals(finishReason)) {
                // 正常结束,没有走函数调用，此时使用拒识
                log.info("不走函数拒识");
                JSONObject result = new JSONObject();
                result.put("type", "unknown");
                result.put("app", "拒绝识别");
                result.put("function", "拒绝识别页面");
                result.put("content", content);
                return result;
            }

            JSONObject toolCall = (JSONObject) message.getJSONArray("tool_calls").get(0);
            JSONObject function = toolCall.getJSONObject("function");

            String app = function.getString("name");
            String arguments = function.getString("arguments");

            JSONObject argumentsObj = JSONObject.parseObject(arguments);
            String title = argumentsObj.getString("title");
            if (StringUtils.isBlank(title)) {
                if ("百度网盘".equals(app)) {
                    title = "网盘文件";
                } else if ("拒绝识别".equals(app)) {
                    title = "拒绝识别页面";
                } else if ("每日英语听力".equals(app) || "哔哩哔哩".equals(app)) {
                    title = "首页";
                } else {
                    title = "首页";
                }
            }

            String type ;
            if ("瑞幸".equals(app) && "点单".equals(title)) {
                type = "agent";
            } else if ("拒绝识别".equals(app)) {
                type = "unknown";
            } else {
                type = "page_direct";
            }

            JSONObject result = new JSONObject();
            result.put("type", type);
            result.put("app", app);
            result.put("function", title);
            result.put("content", content);

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/chatCompletions")
    public JSONObject chatCompletions(@RequestParam String query) throws Exception {
//        String prefex = "已知有" +
//                "小程序app：星巴克，腾讯视频，猫眼电影。" +
//                "功能function: 星巴克有（美式咖啡、拿铁、抹茶拿铁、焦糖玛奇朵、红颜草莓芝士星冰乐、抹茶星冰乐、点单页、我的订单、会员码、会员中心），" +
//                "腾讯视频（首页推荐、藏海花、宿敌、黑白森林、短剧、片库、观看历史、我的在追），" +
//                "猫眼电影（热映、首页推荐、演出、演唱会、音乐会、音乐节、脱口秀、KTV、魅KTV、误判）" +
//                "请根据以下用户话的内容选择合适的小程序，输出小程序app加功能function。" +
//                "输出格式为json内容：{'app': 'xxx', 'function': 'xxx'}，app内容为上方提供的小程序app，function内容为上方提供的功能function" +
//                "用户需求：";

        log.info("query:{}", query);

        String toolContent = new String(Files.readAllBytes(Paths.get("/Users/peterche/local/code/myself/myproject/doc/tools/test.json")));
        String prompt = "已知函数：" + toolContent +
                ",其中app为小程序列表，appName为各个小程序的名称，function为小程序对应的各种功能及页面，intent为意图类型列表，intentName为意图类型名称。" +
                "，用户提问语：" + query +
                "。请根据以上用户提问语的内容人性化的选择合适的小程序、function、意图类型名称，输出内容需要满足以下所有规则：" +
                "1.对于用户提问语当前所有的小程序都无法满足时使用拒识。" +
                "2.intent为'unknown'时，app必须为'拒识'，function必须为'拒绝识别页面'。" +
                "3.app为'瑞幸'同时function为'点单'时，intent固定为'agent'。" +
                "4.输出小程序app（必须为上面函数中appName）、功能function（必须为上面函数中name）、意图类型intent（必须为上面函数中intentName）。" +
                "5.输出内容必须为json格式，不附加其他内容：{'app': 'xxx', 'function': 'xxx', 'intent': 'xxx'}";


//        String prefex = "已知有" +
//                "小程序app：瑞幸，腾讯视频，猫眼电影。" +
//                "功能function: 瑞幸有（首页、点单、我的订单、咖啡钱包、账户余额、优惠卷），" +
//                "腾讯视频（首页推荐、藏海花、宿敌、黑白森林、短剧、片库、观看历史、我的在追），" +
//                "猫眼电影（热映、首页推荐、演出、演唱会、音乐会、音乐节、脱口秀、KTV、魅KTV、误判）" +
//                "请输出哪些提问语可以命中每个function，每个function对应的提问语数量返回100个" +
//                "输出格式为json内容：[{'app': 'xxx', 'function': 'xxx', 'query': ['xxx']}]，app内容为上方提供的小程序app，function内容为上方提供的功能function,query为每个function对应的提问语" +
//                "";



        String url = "http://stream-server-online-openapi.turbotke.production.polaris:8080/openapi/chat/completions";

        String authorization = "ffb46e49-1b31-443c-9833-e80598e7b180";
        String wsid ="10697";
//        String wsid ="10144";
//        String model = "7B-Dense-SFT-32K";
        String model = "7B-Dense-SFT-256K";
//        String model = "7B-MoE-SFT-256K-V2";
//        String model = "7B-Dense-SFT-FunctionCall-32k";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", authorization);
        headers.set("Wsid", wsid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("model", model);
        jsonObject.put("query_id", UUID.randomUUID().toString());
        List<Messages> messages = new ArrayList<>();
        messages.add(new Messages("system", "你现在的功能是：根据一个用户的话，分析出这句话具体是什么小程序[app]和操作行为[function]和意图类型[intent]."));
        messages.add(new Messages("user", prompt));
        jsonObject.put("messages", messages);

        jsonObject.put("temperature", 0);
        jsonObject.put("top_p", 1);
        jsonObject.put("top_k", 40);
        jsonObject.put("repetition_penalty", 1);
        jsonObject.put("output_seq_len", 2048);
        jsonObject.put("max_input_seq_len", 4000);
        jsonObject.put("random_seed", 12345);
        jsonObject.put("stream", true);
        // 是否开启功能增强（比如搜索），默认 true；当传入false时，将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延，尤力明显），但在少数场景里，回复效果可能会下降。安全审核
        jsonObject.put("enable enhancement", false);

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> param = new HttpEntity<>(jsonObject, headers);

        log.info("req:{}", JSONObject.toJSONString(param));

        // 发送POST请求并接收流式响应
        ResponseEntity<Resource> responseEntity = REST_TEMPLATE.exchange(
                url,
                HttpMethod.POST,
                param, // 请求体，如果不需要可以传null
                Resource.class // 响应体的类型
        );

        // 获取输入流
        InputStream inputStream = responseEntity.getBody().getInputStream();

        String result = getContentFromStream(new InputStreamReader(inputStream, "utf-8"));

        JSONObject resultObj = JSONObject.parseObject(result);
        String app = resultObj.getString("app");
        String function = resultObj.getString("function");
        String intent = resultObj.getString("intent");
        if ("agent".equals(intent)) {
            if (!"瑞幸".equals(app) || !"点单".equals(function)) {
                intent = "page_direct";
                resultObj.put("intent", intent);
            }
        }
        return resultObj;
    }


    private Map<String, List<String>> map = new LinkedHashMap<>();

    @Autowired
    private TcAgentQueryMapper tcAgentQueryMapper;

    @GetMapping("/getAllQuery")
    public List<TcAgentQuery> getAllQuery(@RequestParam(required = false, value = "result") Integer result) {
        List<TcAgentQuery> queryList = tcAgentQueryMapper.selectAll();
        Iterator<TcAgentQuery> iterator = queryList.iterator();
        while (iterator.hasNext()) {
            TcAgentQuery agentQuery = iterator.next();
            if (result != null) {
                if (result != agentQuery.getResult()) {
                    iterator.remove();
                }
            }
        }
        return queryList;
    }

    @GetMapping("/getAndSaveAllQuery")
    public String getAndSaveAllQuery() throws Exception {
        String toolContent = new String(Files.readAllBytes(Paths.get("/Users/peterche/local/code/myself/myproject/doc/tools/confirm_intention3.json")));

        JSONArray toolsArray = JSONArray.parseArray(toolContent);

        for (int i = 0; i < toolsArray.size(); i++) {
            JSONObject appObject = (JSONObject) toolsArray.get(i);
            JSONObject functionObject = appObject.getJSONObject("function");
            String app = functionObject.getString("name");

            JSONArray enumArray = functionObject.getJSONObject("parameters").getJSONObject("properties").getJSONObject("title").getJSONArray("enum");
            String function = "";
            for (int j = 0; j < enumArray.size(); j++) {
                if (j == 0) {
                    function += enumArray.getString(j);
                } else {
                    function += "，" + enumArray.getString(j);
                }
            }
            log.info("app:{},function:{}", app, function);

            String result = getResultByQuery(app, function);

            JSONArray resultArray = JSONArray.parseArray(result);
            for (int k = 0; k < resultArray.size(); k++) {
                JSONObject resultObject = (JSONObject) resultArray.get(k);

                String resultFunction = resultObject.getString("function");
                JSONArray queryArray = resultObject.getJSONArray("query");
                List<String> queryList = queryArray.toJavaList(String.class);
                map.put(app + "-" + resultFunction, queryList);

                for (String query : queryList) {
                    tcAgentQueryMapper.insert(new TcAgentQuery(app, resultFunction, query));
                }

            }
        }
        return null;

    }

    @GetMapping("/exportFile")
    public void exportFile(HttpServletResponse response) throws Exception{
        final long start = System.currentTimeMillis();
        log.info("exportFile start...");

        try {
            // 设置excel下载响应头属性
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("query列表", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        } catch (Exception e) {
            log.error("response.setHeader error",e);
        }

        List<TcAgentQuery> queryList = tcAgentQueryMapper.selectAll();

        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), TcAgentQuery.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("query列表").build();

        excelWriter.write(queryList, writeSheet);

        excelWriter.finish();
    }

    @GetMapping("/checkQuery")
    public String checkQuery() {

        List<TcAgentQuery> queryList = tcAgentQueryMapper.selectAll();
        for (TcAgentQuery query : queryList) {
//            if (query.getResult() != 2) {
//                continue;
//            }

            try {
                JSONObject jsonObject = openChatCompletions(query.getQuery());
                String resultApp = jsonObject.getString("app");
                String resultFunction = jsonObject.getString("function");

                if (query.getApp().equals(resultApp) && query.getType().equals(resultFunction)) {
                    query.setResult(1);
                } else {
                    query.setResult(2);
                    query.setResultApp(resultApp);
                    query.setResultType(resultFunction);
                }
                tcAgentQueryMapper.updateResult(query);
            } catch (Exception e) {
                log.info("checkQuery error app:{},function:{},query:{}", query.getApp(), query.getType(), query.getQuery());
            }

        }

        return null;
    }


    private String getResultByQuery(String app, String function) throws Exception {
        String template = "已知有" +
                "小程序app：%s。" +
                "功能function: %s。" +
                "请输出哪些提问语可以精准命中每个function，每个function对应提问语的数量输出20个，提问语需要偏真实人性化。" +
                "输出格式为json内容：[{'function': 'xxx', 'query': ['xxx']}]，function内容为上方提供的功能function,query为每个function对应的提问语" +
                "";
        String query = String.format(template, app, function);

        String url = "http://stream-server-online-openapi.turbotke.production.polaris:8080/openapi/chat/completions";

        String authorization = "ffb46e49-1b31-443c-9833-e80598e7b180";
        String wsid ="10697";
//        String wsid ="10144";
//        String model = "7B-Dense-SFT-32K";
        String model = "7B-Dense-SFT-256K";
//        String model = "7B-MoE-SFT-256K-V2";
//        String model = "7B-Dense-SFT-FunctionCall-32k";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", authorization);
        headers.set("Wsid", wsid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("model", model);
        jsonObject.put("query_id", UUID.randomUUID().toString());
        List<Messages> messages = new ArrayList<>();
        messages.add(new Messages("system", "你现在的功能是：分析哪些提问语可以命中小程序[app]和操作行为[function]."));
        messages.add(new Messages("user", query));
        jsonObject.put("messages", messages);

        jsonObject.put("temperature", 0);
        jsonObject.put("top_p", 1);
        jsonObject.put("top_k", 40);
        jsonObject.put("repetition_penalty", 1);
        jsonObject.put("output_seq_len", 40960);
        jsonObject.put("max_input_seq_len", 4000);
        jsonObject.put("random_seed", 12345);
        jsonObject.put("stream", true);
        // 是否开启功能增强（比如搜索），默认 true；当传入false时，将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延，尤力明显），但在少数场景里，回复效果可能会下降。安全审核
        jsonObject.put("enable enhancement", false);

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> param = new HttpEntity<>(jsonObject, headers);

        log.info("req:{}", JSONObject.toJSONString(param));

        // 发送POST请求并接收流式响应
        ResponseEntity<Resource> responseEntity = REST_TEMPLATE.exchange(
                url,
                HttpMethod.POST,
                param, // 请求体，如果不需要可以传null
                Resource.class // 响应体的类型
        );

        // 获取输入流
        InputStream inputStream = responseEntity.getBody().getInputStream();

        String result = getContentFromStream(new InputStreamReader(inputStream, "utf-8"));

        return result;
    }


    private String getContentFromStream(InputStreamReader inputStreamReader) throws Exception {
        int data;
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        while ((data = inputStreamReader.read()) != -1) {
//            System.out.print((char) data);
            sb.append((char) data);
            if (sb.toString().contains("\n\n\n")) {
                String substring = sb.toString().substring(5, sb.toString().length() - 3);
//                log.info("substring:{}", substring);
                JSONObject midStr = JSONObject.parseObject(substring);
                JSONObject error = midStr.getJSONObject("error");
                if (error != null) {
                    String message = error.getString("message");
                    if (StringUtils.isNotBlank(message)) {
                        log.error("getContentFromStream error:{}", JSONObject.toJSONString(midStr));
                        throw new Exception(message);
                    }
                }

//                log.info("midStr:{}", midStr.toString());
                if (midStr.get("choices") != null) {
                    JSONArray choices = midStr.getJSONArray("choices");
                    choices.getJSONObject(0);
                    if (choices.getJSONObject(0) != null && choices.getJSONObject(0).getJSONObject("delta") != null) {
                        JSONObject delta = choices.getJSONObject(0).getJSONObject("delta");
                        if (delta.getString("content") != null) {
                            String content = delta.getString("content");
                            if (StringUtils.isNotBlank(content)) {
                                result.append(content);
                            }
                        }
                    }
                }
                sb = new StringBuffer();
            }
        }
        log.info("result:{}", result);
        return result.toString();
    }

}
