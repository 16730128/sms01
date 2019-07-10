package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Student_Course;

//数据部分
public interface Student_CourseDao {
//查询所有
	List<Student_Course>  selectAll();
	
//select插入
	void insert(Student_Course sc);
	
//update更新
	void update(Student_Course sc);
	
	
}
