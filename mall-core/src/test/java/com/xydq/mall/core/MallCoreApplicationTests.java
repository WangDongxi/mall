package com.xydq.mall.core;

import com.xydq.mall.core.biz.MallUserBizService;
import com.xydq.mall.core.redis.UserLoginCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class MallCoreApplicationTests {

    @Autowired
    private MallUserBizService mallUserBizService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private UserLoginCache userLoginCache;

    @Test
    void contextLoads() {
        mallUserBizService.register("15868802662", "123456");
    }


    @Test
    void testLogin() {
//        String token = mallUserBizService.login("15868802662", "123456");
//        System.out.println(token);
        System.out.println(userLoginCache.getCacheValue("ypxrye8bh6f35i1956an700nvec0uje9"));
    }


    @Test
    void testRedis() throws InterruptedException {
        redisTemplate.opsForValue().set("a", "1", 5, TimeUnit.SECONDS);
        System.out.println(redisTemplate.opsForValue().get("a"));
        Thread.sleep(10000);
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

}
