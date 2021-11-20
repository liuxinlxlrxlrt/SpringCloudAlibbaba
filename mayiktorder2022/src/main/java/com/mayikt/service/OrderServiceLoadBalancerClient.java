package com.mayikt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceLoadBalancerClient {
    //LoadBalancerClient方式
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/loadBalancerClient")
    public Object loadBalancerClient() {
        return loadBalancerClient.choose("mayikt-member");
    }
}
