package com.example.testspringbooti18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("testController")
public class TestController {
    @Resource
    private MessageUtil messageUtil;

    @ResponseBody
    @RequestMapping("sayHello")
    public String sayHello() {
        return messageUtil.get("hello");
    }
}
