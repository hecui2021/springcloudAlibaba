package com.study.springcloud.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author peterche
 * @description: 全局过滤器
 * @date 2024-08-29
 */
@Component
public class LogFilter implements GlobalFilter {

    private Logger log = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("filter start req:{}", exchange.getRequest().getPath());
        return chain.filter(exchange);
    }
}
