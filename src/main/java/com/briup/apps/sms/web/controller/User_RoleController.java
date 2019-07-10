package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.User_Role;
import com.briup.apps.sms.service.User_RoleService;

@RestController
@RequestMapping("/user_role")
public class User_RoleController {
	
	@Autowired
	private User_RoleService user_roleService;
	
	//http://localhost:8080/user_role/selectAll
	@GetMapping("selectAll")
	public List<User_Role> selectAll(){
		return user_roleService.selectAll();
	}
	
	
	
	
	
	
	
	
	
}
