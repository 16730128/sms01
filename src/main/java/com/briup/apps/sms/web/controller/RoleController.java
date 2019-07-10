package com.briup.apps.sms.web.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.RoleService;
import com.briup.apps.sms.service.Student_CourseService;

	//接受参数，返回结果

	@RestController
	@RequestMapping("/Role")
	public class RoleController {
		
		@Autowired
		private RoleService roleService;
		
		//http://localhost:8080/Role/selectAll
		@GetMapping("selectAll")
		
		public List<Role> selectAll(){
				return roleService.selectAll();
				
	}
	}


