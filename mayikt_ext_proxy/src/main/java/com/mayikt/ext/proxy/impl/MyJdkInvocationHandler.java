package com.mayikt.ext.proxy.impl;

import com.mayikt.ext.proxy.MyExtJdkInvocationHandler;

import java.lang.reflect.Method;

public class MyJdkInvocationHandler implements MyExtJdkInvocationHandler {

    private Object target;

    public MyJdkInvocationHandler(Object target){
        this.target=target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("纯手写jdk动态代理开始");
        Object result = method.invoke(target, args);
        System.out.println("纯手写jdk动态代理结束");
        return result;
    }
}
