package com.mayikt.service;

import com.mayikt.ext.proxy.impl.$Proxy0;
import com.mayikt.ext.proxy.impl.MyJdkInvocationHandler;
import com.mayikt.service.impl.OrderServiceImpl;

public class Test001 {
    public static void main(String[] args) throws Throwable {
       OrderService orderService= new $Proxy0(new MyJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();
    }
}
