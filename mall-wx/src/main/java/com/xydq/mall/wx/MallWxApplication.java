package com.xydq.mall.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xydq.mall"})
@MapperScan({"com.xydq.mall.user.dao.mapper"})
public class MallWxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWxApplication.class, args);
    }

}
