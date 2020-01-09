package com.wst.service;

import java.util.List;

import com.wst.vo.T_d0_leader;
import com.wst.vo.User;


public interface LeaderService {
	public List<T_d0_leader> leader_list();
	public List<T_d0_leader> getLeaderbyCon(int id);
	public List<T_d0_leader> leader_list(int page, int size);
	public boolean leader_create(T_d0_leader leader);
	public T_d0_leader getLeaderbyId(int id);
}
