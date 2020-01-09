package com.wst.service.impl;

import java.util.List;

import com.wst.dao.UserDao;
import com.wst.dao.impl.UserDaoImpl;
import com.wst.service.UserService;
import com.wst.tools.Md5Util;
import com.wst.vo.User;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public int login(String username, String password) {
		User user = userDao.queryUser(username);
		if(user == null) {
			return -1;	
		}else if(!Md5Util.encode(password).equals(user.getPassword())) {
			return 0;
		}else {
			return 1;
		}
	}

	@Override
	public boolean user_create(User user) {
		return userDao.addUser(user);
	}

	@Override
	public List<User> user_list(int page, int size) {
		return userDao.getLimited(page, size);
	}

	@Override
	public List<User> getUserbyCon(String name, String sectionroom) {
		return userDao.getUserbyCon(name, sectionroom);
	}

	@Override
	public User queryUser(String username) {
		return userDao.queryUser(username);
	}

	@Override
	public boolean updateUserbyId(String id, User user) {
		return userDao.updateUserbyId(id, user);
	}

}
