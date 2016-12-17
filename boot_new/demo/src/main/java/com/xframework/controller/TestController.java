package com.xframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Len on 17/12/2016.
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/hi")
	public int test(){
		return 1;
	}

}
