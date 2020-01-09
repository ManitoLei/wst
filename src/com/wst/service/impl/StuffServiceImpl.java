package com.wst.service.impl;

import java.util.List;

import com.wst.dao.StuffDao;
import com.wst.dao.impl.StuffDaoImpl;
import com.wst.service.StuffService;
import com.wst.vo.T_d0_stuff;

public class StuffServiceImpl implements StuffService{

	StuffDao stuffDao = new StuffDaoImpl();
	
	@Override
	public boolean stuff_create(T_d0_stuff stuff) {
		return stuffDao.addStuff(stuff);
	}

	@Override
	public List<T_d0_stuff> stuff_list(int page, int size) {
		return stuffDao.getLimited(page, size);
	}

	@Override
	public T_d0_stuff getStuffbyId(int id) {
		return stuffDao.getStuffbyId(id);
	}

	@Override
	public boolean stuff_update(int id, T_d0_stuff stuff) {
		return stuffDao.updateStuffbyId(id, stuff);
	}

	@Override
	public List<T_d0_stuff> getStuffbyPerType(String perType) {
		return stuffDao.getStuffbyPerType(perType);
	}

	@Override
	public int getCountbyPerType(String perType) {
		return stuffDao.getCountbyPerType(perType);
	}

}
