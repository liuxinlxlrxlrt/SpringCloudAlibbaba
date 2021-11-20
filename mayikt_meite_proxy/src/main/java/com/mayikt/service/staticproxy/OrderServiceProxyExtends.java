package com.mayikt.service.staticproxy;

import com.mayikt.service.staticimpl.OrderServiceImpl;

public class OrderServiceProxyExtends extends OrderServiceImpl {


    public void order(){
        System.out.println(">>>打印订单日志开始");
        super.order();//继承父类的order方法OrderServiceImpl
        System.out.println(">>>打印订单日志结束");
    }

    /**
     * 实现静态代理方式
     */
}
