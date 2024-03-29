package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.dao.RoleDao;
import com.briup.apps.sms.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {
		
		@Resource
		private RoleDao roleDao;
		
		@Override
		public List<Role> selectAll(){
			return roleDao.selectAll();
		}
		@Override
		public void saveOrUpdate(Role role) throws Exception{
			if(role.getId()==null) {
				roleDao.insert(role);
			}
			else {
				roleDao.update(role);
				
			}
		}
			@Override
			public void deleteById(long id) throws Exception {
				roleDao.deleteById(id);
				}
		

}
