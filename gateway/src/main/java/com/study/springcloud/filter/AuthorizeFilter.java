package com.study.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author peterche
 * @description: 鉴权过滤器，对请求参数进行鉴权
 * @date 2025-06-16
 */
@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthorizeFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取请求参数
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();

        String auth = queryParams.getFirst("authorization");
        if ("admin".equals(auth)) {
            // 放行
            return chain.filter(exchange);
        }

        // 拦截
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        // 拦截请求
        return exchange.getResponse().setComplete();
    }

    /**
     * 过滤器在过滤器链中的执行顺序，值越小越先执行(与@Order注解值作用一样)
     * @return
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
