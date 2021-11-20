package com.mayikt.member;


import org.springframework.web.bind.annotation.RequestMapping;

public interface MemberService {

    @RequestMapping("/getUser")
    String getUser();
}
