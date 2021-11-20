package com.mayikt.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class UserService {

    @WebMethod
    public  String getUser(long userId){
        return "123"+userId;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.1.101:8080/service/UserService",new UserService());
        System.out.println("服务发布成功");
    }
}
