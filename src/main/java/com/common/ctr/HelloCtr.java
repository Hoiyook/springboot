package com.common.ctr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtr {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
