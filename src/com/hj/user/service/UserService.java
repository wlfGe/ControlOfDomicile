package com.hj.user.service;

import java.util.List;

import com.hj.user.po.UserInfo;
//业务层，进行添加用户、登录验证、查询用户信息等数据操作
public interface UserService {
	public boolean addUser(UserInfo user);
	public boolean loginCheck(String userName,String userPass);
	public List<UserInfo> getUserInfo(UserInfo user);
}
