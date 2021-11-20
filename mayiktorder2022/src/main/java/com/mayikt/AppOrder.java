package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan("com.mayikt")
@EnableFeignClients
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }

//    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
