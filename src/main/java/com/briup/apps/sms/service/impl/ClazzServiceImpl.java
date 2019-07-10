package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.dao.ClazzDao;
import com.briup.apps.sms.service.ClazzService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class ClazzServiceImpl implements ClazzService {
		// 依赖注入，实例化ClazzDao并且赋值给ClazzDao这个变量
		@Resource
		private ClazzDao clazzDao;
		
		@Override
		public List<Clazz> selectAll(){
			return clazzDao.selectAll();
		}
		@Override
		public void saveOrUpdate(Clazz clazz) throws Exception{
			if(clazz.getId()==null) {
				clazzDao.insert(clazz);
			}
			else {
				clazzDao.update(clazz);
			}
			
		}
		

}
