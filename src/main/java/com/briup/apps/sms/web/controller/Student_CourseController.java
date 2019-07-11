package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.service.SchoolService;
import com.briup.apps.sms.service.Student_CourseService;
//接受参数，返回结果
@RestController
@RequestMapping("/student_course")
public class Student_CourseController {
	
	@Autowired
	private Student_CourseService student_CourseService;
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Student_Course  student_Course) {
		try {
			student_CourseService.saveOrUpdate(student_Course);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}	
	}
	//http://localhost:8080/student_course/selectAll
	@GetMapping("selectAll")
	public List<Student_Course> selectAll(){
		return student_CourseService.selectAll();
	}
	
	@GetMapping("deleteById")
	//http://localhost:8080/student_course/deleteById?id=3
	public String deleteById(long id) {
		try {
			student_CourseService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			//打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}	
}
