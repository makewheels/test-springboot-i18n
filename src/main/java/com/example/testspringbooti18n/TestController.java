package com.example.testspringbooti18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("testController")
public class TestController {
    @Resource
    private MessagesUtil messagesUtil;

    @ResponseBody
    @RequestMapping("sayHello")
    public String sayHello() {
        return messagesUtil.get("hello");
    }
}
