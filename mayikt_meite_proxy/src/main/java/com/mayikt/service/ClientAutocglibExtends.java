package com.mayikt.service;

import com.mayikt.service.cglibimpl.CglibMethodInterceptor;
import com.mayikt.service.jdkimpl.JdkInvocationHandler;
import com.mayikt.service.staticimpl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;

public class ClientAutocglibExtends {
    public static void main(String[] args) {
        //把jdk动态代理生成的class文件生成到当前目标下
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        //设置代理类的父类
        enhancer.setSuperclass(OrderServiceImpl.class);
        //设置回调对象
        enhancer.setCallback(cglibMethodInterceptor);
        //创建代理对象
        OrderServiceImpl orderServiceimpl= (OrderServiceImpl) enhancer.create();
        orderServiceimpl.order();

    }
}
