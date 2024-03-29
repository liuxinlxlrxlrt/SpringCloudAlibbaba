package com.mayikt.impl.member;

import com.mayikt.member.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @Value("${server.port}")
    private String serverPort;

    @Override
    public String getUser() {
        return "mayikt:"+ serverPort;
    }
}
