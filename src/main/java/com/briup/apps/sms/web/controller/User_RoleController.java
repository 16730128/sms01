package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.briup.apps.sms.bean.User_Role;
import com.briup.apps.sms.bean.User_RoleExtend;
import com.briup.apps.sms.service.User_RoleService;
//接受参数，返回结果
@RestController
@RequestMapping("/user_role")
public class User_RoleController {
	
	@Autowired
	private User_RoleService user_roleService;
	//http://localhost:8080/user_role/saveOrUpdate?name="兰州财经大学",description="兰州一所大学",tel="15862568459",address="兰州和平"
		@PostMapping("saveOrUpdate")
		public String saveOrUpdate(User_Role user_role) {
			try {
				user_roleService.saveOrUpdate(user_role);
				return "保存或更新成功";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return e.getMessage();
			}
		}
	
	//http://localhost:8080/user_role/selectAll
	@GetMapping("selectAll")
	public List<User_Role> selectAll(){
		return user_roleService.selectAll();
		
	}
	
	@GetMapping("selectAllWithRoleWithUser")
	public List<User_RoleExtend> selectAllWithRoleWithUser(){
		return user_roleService.selectAllWithRoleWithUser();
		
	}
	
	// http://localhost:8080/school/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			user_roleService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
	
	
		}
	}
}
