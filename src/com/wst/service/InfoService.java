package com.wst.service;

import java.util.List;

import com.wst.vo.T_d0_orgattached;

public interface InfoService {
	
	public List<T_d0_orgattached> getAllinfo();
	public T_d0_orgattached getInfobyOrgid(int id);
}
