package com.mayikt.service.cglibimpl;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>jdk打印订单日志开始");

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println(">>>jdk打印订单日志结束");

        return result;
    }
}
