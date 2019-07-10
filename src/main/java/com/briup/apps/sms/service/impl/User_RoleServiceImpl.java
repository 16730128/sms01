package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User_Role;
import com.briup.apps.sms.dao.User_RoleDao;
import com.briup.apps.sms.service.User_RoleService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class User_RoleServiceImpl implements User_RoleService {
		// 依赖注入，实例化user_role并且赋值给schoolDao这个变量
		@Resource
		private User_RoleDao user_roleDao;
		
		@Override
		public List<User_Role> selectAll(){
			return user_roleDao.selectAll();
		}
		@Override
		public void saveOrUpdate(User_Role user_role) throws Exception{
			if(user_role.getId()==null) {
				user_roleDao.insert(user_role);
			}
			else {
				user_roleDao.update(user_role);
			}
			
		}
		

}
