package com.webappx.controller;

/**
 * Created by WY on 2015/10/16.
 */
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String hi(Map<String, Object> model) {
        System.out.println("======hi======");
        model.put("time", new Date() + "---abc");
        model.put("message", this.message);
        return "hi";
    }


    @RequestMapping("/hello")
    public String welcome(Map<String, Object> model) {
        System.out.println("======hello======");
        model.put("time", new Date());
        model.put("message", this.message);
        return "hi";
    }

}