package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.User_Role;
import com.briup.apps.sms.bean.User_RoleExtend;

//业务逻辑部分
public interface User_RoleService {
	
	
	List<User_Role>  selectAll();
	
	List<User_RoleExtend> selectAllWithRoleWithUser();
	
	void saveOrUpdate(User_Role user_role)  throws Exception;
	void deleteById(long id) throws Exception;
}

