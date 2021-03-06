package com.jensen.seatabank2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.jensen.seatabank2.mapper")
@EnableFeignClients(basePackages = "com.jensen.seatabank2.feign")
public class SeataBank2Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataBank2Application.class, args);
    }

}
