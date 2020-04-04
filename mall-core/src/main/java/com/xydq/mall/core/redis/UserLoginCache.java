package com.xydq.mall.core.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Component
public class UserLoginCache {

    private static final Long EXPIRE_TIME = 60 * 30L;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    public void setCache(String token, Integer userId) {
        redisTemplate.opsForValue().set(token, userId, EXPIRE_TIME, TimeUnit.SECONDS);
    }

    public Integer getCacheValue(String token) {
        return (Integer) redisTemplate.opsForValue().get(token);
    }
}
