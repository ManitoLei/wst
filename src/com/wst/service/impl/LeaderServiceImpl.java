package com.wst.service.impl;

import java.util.List;

import com.wst.dao.LeaderDao;
import com.wst.dao.impl.LeaderDaoImpl;
import com.wst.service.LeaderService;
import com.wst.vo.T_d0_leader;

public class LeaderServiceImpl implements LeaderService{
	
	LeaderDao leaderDao = new LeaderDaoImpl();

	@Override
	public List<T_d0_leader> leader_list() {
		return leaderDao.getAllleader();
	}

	@Override
	public List<T_d0_leader> getLeaderbyCon(int id) {
		return leaderDao.getByConditions(id);
	}

	@Override
	public List<T_d0_leader> leader_list(int page, int size) {
		return leaderDao.getLimited(page, size);
	}

	@Override
	public boolean leader_create(T_d0_leader leader) {
		return leaderDao.addLeader(leader);
	}

	@Override
	public T_d0_leader getLeaderbyId(int id) {
		return leaderDao.getLeaderbyId(id);
	}
	
	
}
