package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.service.ClazzService;

//接受参数，返回结果

@RestController
@RequestMapping("/Clazz")
public class ClazzController {
	
	@Autowired
	private ClazzService clazzService;
	
	//http://localhost:8080/Clazz/selectAll
	@GetMapping("selectAll")
	
	public List<Clazz> selectAll(){
			return clazzService.selectAll();
}
}
