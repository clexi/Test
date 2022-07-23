package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chen le xi
 * @date:
 */
@RestController
public class TestController {
	
	@GetMapping("test")
	public String test(){
		return "test success";
	}
}
