package com.mnz.wechatappserverdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.mnz.wechatappserverdemo")
@SpringBootApplication
public class WeChatAppServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeChatAppServerDemoApplication.class, args);
    }

}
