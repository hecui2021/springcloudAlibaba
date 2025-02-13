package com.study.util;

import java.nio.charset.Charset;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author peterche
 * @description:
 * @date 2024-12-13
 */
public final class RestUtils {

    /**
     * 请求代理
     */
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";
    /**
     * 请求工厂
     */
    private static SimpleClientHttpRequestFactory requestFactory = null;

    static {
        requestFactory = new SimpleClientHttpRequestFactory();
        //可配置化
        requestFactory.setConnectTimeout(1000000);
        //可配置化
        requestFactory.setReadTimeout(1000000);
    }

    /**
     * 默认构造函数
     */
    private RestUtils() {
    }

    /**
     * http请求头
     *
     * @return 请求头
     */
    public static HttpHeaders getHttpHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", USER_AGENT);
        headers.add("Content-Type", "application/json;charset=UTF-8");
        headers.add("Accept", "*/*");
        headers.add("Connection", "keep-alive");
        return headers;
    }

    /**
     * get 请求
     * @param url   请求地址
     * @param clazz 结果类
     * @param <T>   结果对象
     * @return 结果对象
     */
    public static <T> T doGet(String url,HttpEntity<String> entity, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate.exchange(url, HttpMethod.GET, entity, clazz).getBody();
    }

    /**
     * post 请求
     * @param url    请求地址
     * @param clazz  结果类
     * @param params post参数
     * @param <T>    返回值
     * @return 结果对象
     */
    public static <T> T doPost(String url, Class<T> clazz, JSONObject params) {
        HttpHeaders httpHeader = getHttpHeader();
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(params, httpHeader);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, clazz).getBody();
    }

    /**
     * post 请求
     * @param url    请求地址
     * @param param post参数
     * @return 结果对象
     */
    public static ResponseEntity<Resource> doPostStream(String url, HttpEntity<Map<String, Object>> param) {
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate.postForEntity(url, param, Resource.class);
    }

    /**
     * 处理Get请求，响应的是流的形式
     * @param url
     * @param Authorization
     * @return
     */
    public static ResponseEntity<Resource> doGetStream(String url, String Authorization) {
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", Authorization);
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate.exchange(url, HttpMethod.GET, entity, Resource.class);
    }

}
