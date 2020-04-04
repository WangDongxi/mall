package com.xydq.mall.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xydq.mall"})
@MapperScan({"com.xydq.mall.user.dao.mapper", "com.xydq.mall.goods.dao.mapper", "com.xydq.mall.ad.dao.mapper"})
public class MallCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCoreApplication.class, args);
    }

}
