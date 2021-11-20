package com.mayikt.service.staticproxy;

import com.mayikt.service.OrderService;

public class OrderServiceProxyImplements implements OrderService {

    //被代理对象
    private OrderService orderService;

    public OrderServiceProxyImplements(OrderService orderService){
        this.orderService=orderService;
    }

    public void order(){
        System.out.println(">>>打印订单日志开始");
        orderService.order();
        System.out.println(">>>打印订单日志结束");
    }

    /**
     * 实现静态代理方式
     */
}
