package com.wst.dao;

import java.sql.Connection;
import java.util.List;

import com.wst.vo.User;

public interface UserDao {

	public User queryUser(String username);
	public boolean addUser(User user);
	public List<User> getLimited(int page, int size);
	public List<User> getUserbyCon(String name,String sectionroom);
	public boolean updateUserbyId(String id,User user);
	
}
