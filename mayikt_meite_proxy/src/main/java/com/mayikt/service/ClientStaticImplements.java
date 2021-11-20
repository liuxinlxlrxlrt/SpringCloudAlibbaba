package com.mayikt.service;

import com.mayikt.service.staticimpl.OrderServiceImpl;
import com.mayikt.service.staticproxy.OrderServiceProxyImplements;

public class ClientStaticImplements {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxyImplements(new OrderServiceImpl());
        orderService.order();
    }
}
