package com.xframework.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Len on 17/12/2016.
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@GetMapping(value = "/hi")
	public String hi(){
		return "hello world";
	}

}
