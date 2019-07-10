package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.bean.Student_Course;

public interface RoleService {

	List<Role> selectAll();
	void saveOrUpdate(Role role) throws Exception;

}
