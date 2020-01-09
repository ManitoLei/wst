package com.wst.service.impl;

import java.util.List;

import com.wst.dao.PriDao;
import com.wst.dao.impl.PriDaoImpl;
import com.wst.service.PriService;
import com.wst.vo.Privilege;

public class PriServiceImpl implements PriService{
	PriDao priDao = new PriDaoImpl();

	@Override
	public boolean addPri(Privilege pri) {
		return priDao.addPri(pri);
	}

	@Override
	public List<Privilege> getLimited(int page, int size) {
		return priDao.getLimited(page, size);
	}

	@Override
	public List<Privilege> getAllPri() {
		return priDao.getAllPri();
	}

	@Override
	public Privilege getPribyId(int id) {
		return priDao.getPribyId(id);
	}

}
