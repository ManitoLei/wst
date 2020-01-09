package com.wst.service.impl;

import java.util.List;

import com.wst.dao.OrgattachedDao;
import com.wst.dao.impl.OrgattachedDaoImpl;
import com.wst.service.InfoService;
import com.wst.vo.T_d0_orgattached;

public class InfoServiceImpl implements InfoService{

	OrgattachedDao orgattachedDao = new OrgattachedDaoImpl();

	@Override
	public List<T_d0_orgattached> getAllinfo() {
		return orgattachedDao.getAllinfo();
	}

	@Override
	public T_d0_orgattached getInfobyOrgid(int id) {
		return orgattachedDao.getOrgbyorgId(id);
	}
	
}
