package com.mayikt.ext.proxy.impl;

import com.mayikt.service.OrderService;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class $Proxy0 implements OrderService {

    private MyJdkInvocationHandler h;

    public $Proxy0(MyJdkInvocationHandler h){
        this.h=h;
    }
    public void order() throws Throwable {
        //如何获取到真实的目标方法呢？反射获取
        Method orderMethod = OrderService.class.getMethod("order", new Class[]{});

        this.h.invoke(this,orderMethod,null);
    }
}
