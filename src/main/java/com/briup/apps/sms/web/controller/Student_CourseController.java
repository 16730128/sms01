package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.SchoolService;
import com.briup.apps.sms.service.Student_CourseService;

@RestController
@RequestMapping("/student_course")
public class Student_CourseController {
	
	@Autowired
	private Student_CourseService student_CourseService;
	
	//http://localhost:8080/student_course/selectAll
	@GetMapping("selectAll")
	public List<Student_Course> selectAll(){
		return student_CourseService.selectAll();
	}
	
	
	
	
	
	
	
	
	
}
