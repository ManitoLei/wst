package com.wst.service;

import java.util.List;

import com.wst.vo.User;

public interface UserService {

	public int login(String username,String password);
	public boolean user_create(User user);
	public List<User> user_list(int page, int size);
	public List<User> getUserbyCon(String name, String sectionroom);
	public User queryUser(String username);
	public boolean updateUserbyId(String id, User user);
}
