package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.User_Role;

//业务逻辑部分
public interface User_RoleService {
	
	
	List<User_Role>  selectAll();
	
	void saveOrUpdate(User_Role user_role)  throws Exception;
}

