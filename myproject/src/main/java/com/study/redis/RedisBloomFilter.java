package com.study.redis;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author peterche
 * @description: 布隆过滤器，解决缓存穿透问题
 * @date 2025-06-10
 */
@Service
public class RedisBloomFilter {

    private RBloomFilter<String> bloomFilter;

    @Autowired(required = false)
    private RedissonClient redissonClient;

    @PostConstruct
    public void RedisBloomFilter() {
        bloomFilter =  redissonClient.getBloomFilter("bloomFilter");
        // 初始化布隆过滤器:预计元素为1000000L，误判率为1%
        bloomFilter.tryInit(1000000L, 0.01);
    }

    public void add(String value) {
        bloomFilter.add(value);
    }

    /**
     * false:肯定不存在 true:1%的概率不存在
     * @param value
     * @return
     */
    public boolean contains(String value) {
        return bloomFilter.contains(value);
    }
}
