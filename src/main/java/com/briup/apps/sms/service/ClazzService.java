package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Clazz;

//业务逻辑部分  
public interface ClazzService {
	
	
	List<Clazz>  selectAll();
	
	void saveOrUpdate(Clazz clazz)  throws Exception;
	void deleteById(long id) throws Exception;
}
