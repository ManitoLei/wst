package com.wst.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.wst.dao.SectionDao;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_section;

public class SectionDaoImpl extends BaseDao implements SectionDao{

	@Override
	public boolean addSection(T_d0_section section) {
		String sql = "insert into t_d0_section values(0,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		//params.add(org.getId());
		params.add(section.getOrgId());
		params.add(section.getOrgNo());
		params.add(section.getDivCode());
		params.add(section.getDivNameCode());
		params.add(section.getDivName());
		params.add(section.getIfSub());
		params.add(section.getDutyTel());
		params.add(section.getFax());
		params.add(section.getDivRoomNo());
		params.add(section.getEXETYPE());
		return operUpdate(sql, params);
	}

	@Override
	public List<T_d0_section> getAllSec() {
		String sql = "select * from t_d0_section";
		List<T_d0_section> list = null;
		try {
			list = operQuery(sql,null,T_d0_section.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_section> getLimited(int page, int size) {
		String sql = "select * from t_d0_section order by id limit ?,?";
		List<T_d0_section> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,T_d0_section.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_section> getByConditions(int id, String secname, int page, int size) {
		System.out.println("section_daoimpl");
		String sql = "select * from t_d0_section where orgId=? ";
		System.out.println("sql id::"+id);
		System.out.println("sql secname::"+secname);
		List<T_d0_section> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		//System.out.println("qentity.getExeType()::"+qentity.getExeType());
		if(secname!=null && secname.length()>0) {
			sql+=" and divName=?";
			params.add(secname);
			//System.out.println("qentity.getOrgName()::"+qentity.getOrgName());
		}
		sql+=" order by id limit ?,?";
		params.add((page-1)*size);
		params.add(size);
		System.out.println("sql::"+sql);
		try {
			list = operQuery(sql,params,T_d0_section.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
