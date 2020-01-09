package com.wst.dao;

import java.util.List;

import com.wst.vo.Privilege;
import com.wst.vo.T_d0_leader;


public interface LeaderDao {

	public List<T_d0_leader> getAllleader();
	public T_d0_leader getLeaderbyId(int id);
	public List<T_d0_leader> getByConditions(int id);
	public List<T_d0_leader> getLimited(int page, int size);
	public boolean addLeader(T_d0_leader leader);
}
