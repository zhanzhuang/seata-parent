package com.jensen.seatabank1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jensen.seatabank1.mapper")
@EnableFeignClients(basePackages = "com.jensen.seatabank1.feign")
public class SeataBank1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataBank1Application.class, args);
    }

}
