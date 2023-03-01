package com.zqungui.write.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sap")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "HelloFresh";
    }

    @RequestMapping( value = "/addUser")
    public String user (@RequestParam String userName) {
        System.out.println("userName is :" + userName);
//        System.out.println("password is :" + entity.getPassword());
        return userName;
    }
}

