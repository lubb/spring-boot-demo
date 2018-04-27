package com.lbb.controller;

import com.lbb.pojo.LbbJSONResult;
import com.lbb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        User u = new User();
        u.setName("lbb");
        u.setAge(12);
        u.setBirthday(new Date());
        u.setPassword("lbb");
        u.setDesc("desc");
        return u;
    }

    @RequestMapping("/getUserJson")
	@ResponseBody
    public LbbJSONResult getUserJson() {
        User u = new User();
        u.setName("lbb");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc~~hello imooc~~");
        return LbbJSONResult.ok(u);
    }
}
