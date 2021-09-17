package com.cmdi.fanuc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cmdi.fanuc.mapper")
public class FanucApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanucApplication.class, args);
    }

}
