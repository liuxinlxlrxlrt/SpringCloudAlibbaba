package com.mayikt.service.jdkimpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理类，实现InvocationHandler接口，走invoke方法
public class JdkInvocationHandler implements InvocationHandler {
    //被代理类对象
    private Object target;
    //目标代理对象
    public JdkInvocationHandler(Object target){
        this.target=target;
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(">>>jdk打印订单日志开始"+proxy.getClass().toString());

        Object result = method.invoke(target, args);//反射机制执行目标的方法

        System.out.println(">>>jdk打印订单日志结束");
        return result;
    }

    /**
     * 使用jdk动态代理创建代理类
     * @param <T>
     */
    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
