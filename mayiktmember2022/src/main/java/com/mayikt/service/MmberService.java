package com.mayikt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MmberService {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getUser")
    public String getUser(){
        return "mayikt"+ serverPort;
    }
}
