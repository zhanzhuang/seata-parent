package com.jensen.seatabank1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jensen.seatabank1.mapper")
public class SeataBank1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataBank1Application.class, args);
    }

}
