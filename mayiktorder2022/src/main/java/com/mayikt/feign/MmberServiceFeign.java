package com.mayikt.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "mayikt-member")
public interface MmberServiceFeign {

    @RequestMapping("/getUser")
    String getUser();
}
