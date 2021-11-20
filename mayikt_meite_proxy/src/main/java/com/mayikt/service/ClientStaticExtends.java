package com.mayikt.service;

import com.mayikt.service.staticproxy.OrderServiceProxyExtends;

public class ClientStaticExtends {
    public static void main(String[] args) {
        OrderService orderService= new OrderServiceProxyExtends();
        orderService.order();
    }
}
