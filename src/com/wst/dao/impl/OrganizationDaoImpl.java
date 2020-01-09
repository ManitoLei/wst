package com.wst.dao.impl;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wst.dao.OrganizationDao;
import com.wst.vo.QueryEntity;
import com.wst.vo.String_;
import com.wst.vo.T_d0_organization;

public class OrganizationDaoImpl extends BaseDao implements OrganizationDao{

	@Override
	public boolean addOrg(T_d0_organization org,Connection conn) {
		String sql = "insert into t_d0_organization values(0,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		//params.add(org.getId());
		params.add(org.getOrgNo());
		params.add(org.getOrgCode());
		params.add(org.getOrgName());
		params.add(org.getExeType());
		params.add(org.getAreaCode());
		params.add(org.getLinkAdd());
		params.add(org.getListingDate());
		params.add(org.getStandaloneDate());
		params.add(org.getAreaType());
		params.add(org.getZbbdocDate());
		params.add(org.getOrgLevel());
		params.add(org.getOrgPro());
		params.add(org.getZIPCODE());
		return operUpdate(sql, params,conn);
	}
	
	public List<T_d0_organization> getLimited(int page, int size){
		String sql = "select * from t_d0_organization order by id limit ?,?";
		List<T_d0_organization> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,T_d0_organization.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_organization> getByConditions(QueryEntity qentity,int page,int size) {
		String sql = "select * from t_d0_organization where exeType=?";
		List<T_d0_organization> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(qentity.getExeType());
		System.out.println("qentity.getExeType()::"+qentity.getExeType());
		if(qentity.getOrgName()!=null && qentity.getOrgName().length()>0) {
			sql+=" and orgName=?";
			params.add(qentity.getOrgName());
			System.out.println("qentity.getOrgName()::"+qentity.getOrgName());
		}
		if(qentity.getLinkAdd()!=null && qentity.getLinkAdd().length()>0) {
			sql+=" and linkAdd like '%"+qentity.getLinkAdd()+"%'";
			//params.add(qentity.getLinkAdd());
			System.out.println("qentity.getLinkAdd()::"+qentity.getLinkAdd());
		}
		if(qentity.getOrgCode()!=null && qentity.getOrgCode().length()>0) {
			sql+=" and orgCode=?";
			params.add(qentity.getOrgCode());
			System.out.println("qentity.getOrgCode()::"+qentity.getOrgCode());
		}
		if(qentity.getAreaCode()!=null && qentity.getAreaCode().length()>0) {
			sql+=" and areaCode=?";
			params.add(qentity.getAreaCode());
			System.out.println("qentity.getAreaCode()::"+qentity.getAreaCode());
		}
		if(qentity.getZIPCODE()!=null && qentity.getZIPCODE().length()>0) {
			sql+=" and ZIPCODE=?";
			params.add(qentity.getZIPCODE());
			System.out.println("qentity.getZIPCODE()::"+qentity.getZIPCODE());
		}
		if(qentity.getOrgPro()!=null && qentity.getOrgPro().length()>0 && !qentity.getOrgPro().equals("0")) {
			sql+=" and orgPro=?";
			params.add(qentity.getOrgPro());
			System.out.println("qentity.getOrgPro()::"+qentity.getOrgPro());
		}
		sql+=" order by id limit ?,?";
		params.add((page-1)*size);
		params.add(size);
		System.out.println("sql::"+sql);
		try {
			list = operQuery(sql,params,T_d0_organization.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_organization> getAllOrg() {
		String sql = "select * from t_d0_organization";
		List<T_d0_organization> list = null;
		try {
			list = operQuery(sql,null,T_d0_organization.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public T_d0_organization getOrgbyId(int id) {
		String sql = "select * from t_d0_organization where id=?";
		List<T_d0_organization> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		try {
			list = operQuery(sql,params,T_d0_organization.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list!=null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				list.get(0).setListingDate(format.parse(list.get(0).getListingDate().toString()));
				list.get(0).setStandaloneDate(format.parse(list.get(0).getStandaloneDate().toString()));
				list.get(0).setZbbdocDate(format.parse(list.get(0).getZbbdocDate().toString()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list.get(0);
		}
			
		else
			return null;
	}

	@Override
	public boolean updateOrgbyId(int id, T_d0_organization org,Connection conn) {
		if(org == null) {
			return false;
		}
		String sql="update t_d0_organization set orgName=?,exeType=?,linkAdd=?,listingDate=?,standaloneDate=?,areaType=?,zbbdocDate=?,orgLevel=?,orgPro=?,ZIPCODE=? where id = ?";
		List<Object> params = new ArrayList<Object>();
		//params.add(org.getOrgNo());
		params.add(org.getOrgName());
		params.add(org.getExeType());
		params.add(org.getLinkAdd());
		params.add(org.getListingDate());
		params.add(org.getStandaloneDate());
		params.add(org.getAreaType());
		params.add(org.getZbbdocDate());
		params.add(org.getOrgLevel());
		params.add(org.getOrgPro());
		params.add(org.getZIPCODE());
		params.add(id);
		return operUpdate(sql, params,conn);
	}

	@Override
	public List<String_> getAllexeType() {
		String sql = "select distinct trim(exeType) as val from t_d0_organization";
		//String sql = "select max(id) as val from t_d0_organization";
		//System.out.println("sql::"+sql);
		List<String_> list = null;
		try {
			list = operQuery(sql,null,String_.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

}
