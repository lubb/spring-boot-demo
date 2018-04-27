package com.lbb.controller;

import com.lbb.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(resource.getName()+"->"+resource.getLanguage()+"->"+resource.getWebsite());
        return "hello spring boot";
    }
}
