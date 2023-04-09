package com.kang.seckillmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kang.seckillmall.mapper")
public class SecKillMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecKillMallApplication.class, args);
    }

}
