package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.service.CollegeService;
//接受参数，返回结果
@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	//http://localhost:8080/school/saveOrUpdate?name="兰州财经大学",description="兰州一所大学",tel="15862568459",address="兰州和平"
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(College college) {
		try {
			collegeService.saveOrUpdate(college);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	
	//http://localhost:8080/college/selectAll
	@GetMapping("selectAll")
	public List<College> selectAll(){
		return collegeService.selectAll();
	}
	
	
	//http://localhost:8080/college/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			collegeService.deleteById(id);
			return "删除成功";
		}
		catch(Exception e) {
			//打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
		
		
	}
	
}