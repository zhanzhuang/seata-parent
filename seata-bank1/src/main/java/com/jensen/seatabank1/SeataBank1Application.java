package com.jensen.seatabank1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //
@MapperScan //
public class SeataBank1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataBank1Application.class, args);
    }

}
