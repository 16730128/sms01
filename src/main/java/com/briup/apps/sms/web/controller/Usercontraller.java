package com.briup.apps.sms.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontraller {
	@GetMapping("findAll")
	public String findAll() {
		return "hello world";
	}
}