package com.study.es.config;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2023/9/24 14:06
 */
@Configuration
public class ElasticsearchClientConfig {
    @Value("${elasticsearch.schema:http}")
    private String schema;

    @Value("${elasticsearch.address}")
    private String address;

    @Value("${elasticsearch.username:elastic}")
    private String username;

    @Value("${elasticsearch.password:elastic}")
    private String password;

    @Value("${elasticsearch.connectTimeout:5000}")
    private int connectTimeout;

    @Value("${elasticsearch.socketTimeout:10000}")
    private int socketTimeout;

    @Value("${elasticsearch.connectionRequestTimeout:5000}")
    private int connectionRequestTimeout;

    @Value("${elasticsearch.maxConnectNum:100}")
    private int maxConnectNum;

    @Value("${elasticsearch.maxConnectPerRoute:100}")
    private int maxConnectPerRoute;

    @Bean
    public RestHighLevelClient restHighLevelClient() {

        String host = address.split(":")[0];
        String port = address.split(":")[1];
        HttpHost httpHost = new HttpHost(host, Integer.parseInt(port), schema);

        // 读取用户名与密码
        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username,
            password));

        // 构建连接对象
        RestClientBuilder builder = RestClient.builder(httpHost);

        builder.setRequestConfigCallback(requestConfigBuilder -> {
            // 异步连接延时配置
            requestConfigBuilder.setConnectTimeout(connectTimeout);
            requestConfigBuilder.setSocketTimeout(socketTimeout);
            requestConfigBuilder.setConnectionRequestTimeout(connectionRequestTimeout);
            return requestConfigBuilder;
        });

        builder.setHttpClientConfigCallback(httpClientBuilder -> {
            // 访问权限设置
            httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
            // 异步连接数配置
            httpClientBuilder.setMaxConnTotal(maxConnectNum);
            httpClientBuilder.setMaxConnPerRoute(maxConnectPerRoute);
            return httpClientBuilder;
        });
        return new RestHighLevelClient(builder);
    }
}
