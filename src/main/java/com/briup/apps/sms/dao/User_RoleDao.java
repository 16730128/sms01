package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User_Role;
import com.briup.apps.sms.bean.User_RoleExtend;

public interface User_RoleDao {
	
	//查询所有
	List<User_Role>selectAll();
	
	
	List<User_RoleExtend>selectAllWithRoleWithUser();
	//插入
	void insert(User_Role user_role);
	//更新
	void update(User_Role user_role);

	// 通过ID删除
	void deleteById(long id);


}
