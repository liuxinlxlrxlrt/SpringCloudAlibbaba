package com.mayikt.balancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class RotationLoadBalancer implements LoadBalancer {
    //AtomicInteger保证线程安全问题
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private Random random = new Random();

    @Override
    public ServiceInstance getStringAddres(List<ServiceInstance> serviceInstances) {

        /**
         * 集合[192、193]
         * 第一次访问：1%2 1
         * 第二次访问：2%2 0
         * 第三次访问：3%2 1
         * 第四次访问：4%2 0
         */
        //1、随机算法
//        int count = atomicInteger.incrementAndGet();
//        int index = count%serviceInstances.size();
//        return serviceInstances.get(index);

        //2、随机算法，最小值是0，最大值是serviceInstances.size()
        return serviceInstances.get(random.nextInt(serviceInstances.size()));

    }
}
