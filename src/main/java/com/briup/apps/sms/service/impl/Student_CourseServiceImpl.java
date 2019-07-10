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

@Service
public class Student_CourseServiceImpl implements Student_CourseService {
		
		@Resource
		private Student_CourseDao scDao;
		
		@Override
		public List<Student_Course> selectAll(){
			return scDao.selectAll();
		}
		@Override
		public void saveOrUpdate(Student_Course sc) throws Exception{
			if(sc.getId()==null) {
				scDao.insert(sc);
			}
			else {
				scDao.update(sc);
			}
		}
		

}
