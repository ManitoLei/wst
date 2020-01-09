package com.wst.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.wst.dao.LeaderDao;
import com.wst.tools.Md5Util;
import com.wst.vo.Privilege;
import com.wst.vo.T_d0_leader;
import com.wst.vo.User;

public class LeaderDaoImpl extends BaseDao implements LeaderDao{

	@Override
	public List<T_d0_leader> getAllleader() {
		String sql = "select * from t_d0_leader";
		List<T_d0_leader> list = null;
		try {
			list = operQuery(sql,null,T_d0_leader.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public T_d0_leader getLeaderbyId(int id) {
		String sql = "select * from t_d0_leader where id=?";
		List<T_d0_leader> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		try {
			list = operQuery(sql,params,T_d0_leader.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list!=null) {
			
			return list.get(0);
		}
			
		else
			return null;
	}

	@Override
	public List<T_d0_leader> getByConditions(int id) {
		String sql = "select * from t_d0_leader where 1=1 ";
		List<T_d0_leader> list = null;
		List<Object> params = new ArrayList<Object>();
		if(id!=0) {
			sql+=" and orgId=?";
			params.add(id);
		System.out.println("sql::"+sql);
		}
		try {
			list = operQuery(sql,params,T_d0_leader.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	
	}

	@Override
	public List<T_d0_leader> getLimited(int page, int size) {
		String sql = "select * from t_d0_leader order by id limit ?,?";
		List<T_d0_leader> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,T_d0_leader.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addLeader(T_d0_leader leader) {
		String sql = "insert into t_d0_leader values(0,null,null,null,null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(leader.getFormFillingMan());
		//String p = Md5Util.encode(user.getPassword());
		params.add(leader.getLinkTel());
		params.add(leader.getLeaderName());
		params.add(leader.getGender());
		params.add(leader.getFolk());
		params.add(leader.getBirthDate());
		params.add(leader.getPol());
		params.add(leader.getEdu());
		params.add(leader.getDegree());
		params.add(leader.getManageJob());
		params.add(leader.getTitle());
		params.add(leader.getMemo());
		params.add(leader.getSerDate());
		params.add(leader.getLeaveDate());
		params.add(leader.getYearly());
		
		return operUpdate(sql, params);
	}
		
}
