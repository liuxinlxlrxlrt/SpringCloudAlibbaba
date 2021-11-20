package com.mayikt.service;

import com.mayikt.balancer.RotationLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
//第一种方式，手写调用member服务方式
@RestController
public class OrderService {

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private RotationLoadBalancer rotationLoadBalancer;
//
//    @RequestMapping("/getOrderToMember")
//    public String getOrderToMember() {
//        //1、根据服务名称，从服务注册中心获取，调用接口地址集群列表
//        List<ServiceInstance> instances = discoveryClient.getInstances("mayikt-member");
//
//        //2、使用本地负载均衡器，选择一个地址调用
//        //负载本地负载均衡算法实现，取一个地址---轮询算法
//        ServiceInstance stringAddres = rotationLoadBalancer.getStringAddres(instances);
//
//        URI uri = stringAddres.getUri();//ip和端口号
//
//
//        // 3、使用本地rest形式实现rpc调用
//        String result = restTemplate.getForObject(uri + "/getUser", String.class);
//
//        return "订单调用会员获取结果:" + result;

//    }

    /**
     * 负载均衡算法：
     * 1、轮询策略
     * 2、权重
     * 3、hash一致性策论
     * 4、固定ip
     * 5.随机算法
     */


}
