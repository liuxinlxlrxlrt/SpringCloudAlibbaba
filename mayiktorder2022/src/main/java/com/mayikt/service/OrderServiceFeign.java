package com.mayikt.service;

import com.mayikt.feign.MmberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceFeign {

    @Autowired
    private MmberServiceFeign mmberServiceFeign;

    @RequestMapping("/OrderServiceFeign")
    public String OrderServiceFeign() {
        return mmberServiceFeign.getUser();
    }
}
