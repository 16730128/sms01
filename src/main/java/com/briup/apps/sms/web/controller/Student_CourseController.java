package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.Student_CourseService;

//接受参数，返回结果

@RestController
@RequestMapping("/Student_Course")
public class Student_CourseController {
	
	@Autowired
	private Student_CourseService scService;
	
	//http://localhost:8080/Student_Course/selectAll
	@GetMapping("selectAll")
	
	public List<Student_Course> selectAll(){
			return scService.selectAll();
}
}