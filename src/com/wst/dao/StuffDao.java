package com.wst.dao;

import java.util.List;

import com.wst.vo.T_d0_stuff;

public interface StuffDao {
	public boolean addStuff(T_d0_stuff stuff);
	public List<T_d0_stuff> getAllStuff();
	public List<T_d0_stuff> getLimited(int page, int size);
	public T_d0_stuff getStuffbyId(int id);
	public boolean updateStuffbyId(int id,T_d0_stuff stuff);
	
	//查询卫生监督员/专业技术人员/行政管理人员信息
	public List<T_d0_stuff> getStuffbyPerType(String perType);
	//查询卫生监督员/专业技术人员/行政管理人员总人数
	public int getCountbyPerType(String perType);
}
