package com.wst.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.wst.dao.PriDao;
import com.wst.tools.Md5Util;
import com.wst.vo.Privilege;
import com.wst.vo.T_d0_stuff;
import com.wst.vo.User;

public class PriDaoImpl extends BaseDao implements PriDao{

	@Override
	public boolean addPri(Privilege pri) {
		String sql = "insert into privilege values(0,?,now(),?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(pri.getName());
		//params.add(pri.getStarttime());
		params.add(pri.getEndtime());
		params.add(pri.getDesc());
		return operUpdate(sql, params);
	}

	@Override
	public List<Privilege> getLimited(int page, int size) {
		String sql = "select * from privilege order by id limit ?,?";
		List<Privilege> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,Privilege.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Privilege> getAllPri() {
		String sql = "select * from privilege";
		List<Privilege> list = null;
		try {
			list = operQuery(sql,null,Privilege.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Privilege getPribyId(int id) {
		String sql = "select * from privilege where id=?";
		List<Privilege> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		try {
			list = operQuery(sql,params,Privilege.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list!=null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				list.get(0).setEndtime(format.parse(list.get(0).getEndtime().toString()));
				list.get(0).setStarttime(format.parse(list.get(0).getStarttime().toString()));
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list.get(0);
		}
			
		else
			return null;
	}

}
