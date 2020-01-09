package com.wst.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.wst.vo.QueryEntity;
import com.wst.vo.String_;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;

public interface OrgService {

	public boolean institution_create(T_d0_organization org0,T_d0_orgattached org1) throws SQLException;
	public List<T_d0_organization> institution_list(int page, int size);
	public List<T_d0_organization> query_institution_list(QueryEntity qentity,int page, int size);
	public List<T_d0_organization> getAllOrgName();
	public T_d0_organization getOrgbyId(int id);
	public Map<String,Object> getOrgandInfobyId(int id);
	public boolean institution_update(int id,T_d0_organization org0,T_d0_orgattached org1) throws SQLException;
	public List<String_> getAllexeType();
}
