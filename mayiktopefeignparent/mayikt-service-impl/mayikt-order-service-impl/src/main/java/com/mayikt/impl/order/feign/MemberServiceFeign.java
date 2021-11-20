package com.mayikt.impl.order.feign;


import com.mayikt.member.MemberService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "mayikt-member")
public interface MemberServiceFeign extends MemberService {

}
