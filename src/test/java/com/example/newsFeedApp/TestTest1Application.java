package com.example.newsFeedApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTest1Application {

    public static void main(String[] args) {
        SpringApplication.from(NewsApplication::main).with(TestTest1Application.class).run(args);
    }

}
