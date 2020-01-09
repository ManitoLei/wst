package com.wst.dao;

import java.util.List;

import com.wst.vo.Privilege;
import com.wst.vo.T_d0_stuff;

public interface PriDao {

	public boolean addPri(Privilege pri);
	public List<Privilege> getLimited(int page, int size);
	public List<Privilege> getAllPri();
	public Privilege getPribyId(int id);
}
