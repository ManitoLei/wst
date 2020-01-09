package com.wst.dao;

import java.sql.Connection;
import java.util.List;

import com.wst.vo.QueryEntity;
import com.wst.vo.String_;
import com.wst.vo.T_d0_organization;

public interface OrganizationDao {

	public boolean addOrg(T_d0_organization org,Connection conn);
	public List<T_d0_organization> getLimited(int page, int size);
	public List<T_d0_organization> getByConditions(QueryEntity qentity,int page,int size);
	public List<T_d0_organization> getAllOrg();
	public T_d0_organization getOrgbyId(int id);
	public boolean updateOrgbyId(int id,T_d0_organization org,Connection conn);
	public List<String_> getAllexeType();
}
