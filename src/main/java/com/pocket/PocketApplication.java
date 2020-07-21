package com.pocket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.pocket.Mapper"})
public class PocketApplication {
//测试git提交
    //new1
    public static void main(String[] args) {
        SpringApplication.run(PocketApplication.class, args);
    }

}
