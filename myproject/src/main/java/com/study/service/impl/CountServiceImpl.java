package com.study.service.impl;

import com.study.service.CountService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RRateLimiter;
import org.redisson.api.RateIntervalUnit;
import org.redisson.api.RateType;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CountServiceImpl implements CountService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

//    @Autowired
    private RedissonClient redissonClient;

    @Override
    public String count() {
        Long increment = stringRedisTemplate.opsForValue().increment("count-people");
        return "有[" + increment + "]人访问了这个页面";
    }

    @Override
    public String getRateLimiter() {
        RRateLimiter rateLimiter = redissonClient.getRateLimiter("myRateLimiter");

        // 初始化限流器，每秒最多允许2个请求
        rateLimiter.trySetRate(RateType.OVERALL, 2, 1, RateIntervalUnit.SECONDS);

        // 模拟请求
        for (int i = 1; i <= 100; i++) {
            // 尝试获取许可
            if (rateLimiter.tryAcquire()) {
                // 获得许可，执行请求处理逻辑
                log.info("处理请求 " + i);
                continue;
            }

            try {
                Thread.sleep(100); // 模拟请求间隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
