package com.wst.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.wst.dao.UserDao;
import com.wst.tools.Md5Util;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;
import com.wst.vo.User;

public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public User queryUser(String username) {
		String sql = "select * from user where username = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(username);
		List<User> list = null;
		try {
			list = operQuery(sql,params,User.class);			
			if(list.size() != 0){
				return list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		String sql = "insert into user values(0,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getUsername());
		String p = Md5Util.encode(user.getPassword());
		params.add(p);
		params.add(user.getName());
		params.add(user.getSectionroom());
		params.add(user.getDesc());
		return operUpdate(sql, params);
	}

	@Override
	public List<User> getLimited(int page, int size) {
		String sql = "select * from user order by id limit ?,?";
		List<User> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,User.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<User> getUserbyCon(String name, String sectionroom) {
		String sql = "select * from user where 1=1 ";
		List<User> list = null;
		List<Object> params = new ArrayList<Object>();
		if(name!=null && name.length()>0 ) {
			sql+=" and name=?";
			params.add(name);
		}
		if(sectionroom!=null && sectionroom.length()>0 && !sectionroom.equals("0")) {
			sql+=" and sectionroom=?";
			params.add(sectionroom);
		}
		System.out.println("sql::"+sql);
		try {
			list = operQuery(sql,params,User.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean updateUserbyId(String id, User user) {
		if(user == null) {
			return false;
		}
		String sql="update user set username=?,password=?,name=?,sectionroom=?  where username = ?";
		//String sql="update t_d0_organization set orgName=?,exeType=?,linkAdd=?,listingDate=?,standaloneDate=?,areaType=?,zbbdocDate=?,orgLevel=?,orgPro=?,ZIPCODE=? where id = ?";
		
		List<Object> params = new ArrayList<Object>();
		params.add(user.getUsername());
		String p = Md5Util.encode(user.getPassword());
		params.add(p);
		params.add(user.getName());
		params.add(user.getSectionroom());
		//params.add(user.getDesc());
		params.add(id);
		return operUpdate(sql, params);
	}

}
