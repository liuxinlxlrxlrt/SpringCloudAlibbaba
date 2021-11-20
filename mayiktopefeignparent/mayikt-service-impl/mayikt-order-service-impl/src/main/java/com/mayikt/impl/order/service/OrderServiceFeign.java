package com.mayikt.impl.order.service;
import com.mayikt.impl.order.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceFeign {

    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/OrderServiceFeign")
    public String OrderServiceFeign() {
        return memberServiceFeign.getUser();
    }
}
