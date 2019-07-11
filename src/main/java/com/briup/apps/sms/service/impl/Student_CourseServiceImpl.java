package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.Student_Course;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.dao.Student_CourseDao;
import com.briup.apps.sms.service.SchoolService;
import com.briup.apps.sms.service.Student_CourseService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class Student_CourseServiceImpl implements Student_CourseService {
		// 依赖注入，实例化student_CourseDao并且赋值给student_CourseDao这个变量
		@Resource
		private Student_CourseDao student_CourseDao;
		
		public List<Student_Course> selectAll(){
			return student_CourseDao.selectAll();
		}
		//保存或更新
		public void saveOrUpdate(Student_Course student_Course) throws Exception{
			if(student_Course.getId()==null) {
				student_CourseDao.insert(student_Course);
			}
			else {
				student_CourseDao.update(student_Course);
			}	
		}
		//删除
		@Override
		public void deleteById(long id) throws Exception {
			// TODO Auto-generated method stub
			student_CourseDao.deleteById(id);
		}
		

}
