package com.mayikt.impl.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
@ComponentScan("com.mayikt.impl.order")
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
