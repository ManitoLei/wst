package com.wst.dao;

import java.sql.Connection;
import java.util.List;

import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;

public interface OrgattachedDao {

	public boolean addOrg(T_d0_orgattached org,Connection conn);
	public T_d0_orgattached getOrgbyorgId(int id);
	public boolean updateInfobyorgId(int id,T_d0_orgattached info,Connection conn);
	public List<T_d0_orgattached> getAllinfo();
}
