package com.webappx.controller;

/**
 * Created by WY on 2015/10/16.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HiController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/hh")
    public String hi1(Map<String, Object> model) {
        System.out.println("=====dd=hello==-nnn--ffff-===nnnn=");
        model.put("time", new Date());
        model.put("message", this.message + "_AAAAA");
        return "hi";
    }

}