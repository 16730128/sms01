package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
		
		@Resource
		private SchoolDao schoolDao;
		
		@Override
		public List<School> selectAll(){
			return schoolDao.selectAll();
		}
		@Override
		public void saveOrUpdate(School school) throws Exception{
			if(school.getId()==null) {
				schoolDao.insert(school);
			}
			else {
				schoolDao.update(school);
			}
		}
		

}
