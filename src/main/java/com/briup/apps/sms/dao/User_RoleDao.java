package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User_Role;

public interface User_RoleDao {
   //查询所有信息
   List<User_Role> selectAll();
   void insert(User_Role user_role);
   //插入
   void update(User_Role user_role);
   //更新
   
}
