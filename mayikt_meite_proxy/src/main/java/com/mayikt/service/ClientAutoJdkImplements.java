package com.mayikt.service;

import com.mayikt.service.jdkimpl.JdkInvocationHandler;
import com.mayikt.service.staticimpl.OrderServiceImpl;

public class ClientAutoJdkImplements {
    public static void main(String[] args) {
        //把jdk动态代理生成的class文件生成到当前目标下
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        OrderService orderService = new JdkInvocationHandler(new OrderServiceImpl()).getProxy();
        orderService.order();
    }
}
