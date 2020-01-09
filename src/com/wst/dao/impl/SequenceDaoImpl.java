package com.wst.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.wst.dao.SequenceDao;
import com.wst.vo.Int;
import com.wst.vo.Long_;

public class SequenceDaoImpl extends BaseDao implements SequenceDao{

	@Override
	public long getNextValbyName(String name) {
		//errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		
		String sql = "select nextval(?) as val";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		List<Long_> list = null;
		try {
			list = operQuery(sql,params,Long_.class);			
			if(list.size() != 0){
				return list.get(0).getVal();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int getOrgidfromOrgbylastInsert() {
		
		///errorrrrrrrrrrrrrrrrrrrr
		//String sql = "select id as val from t_d0_organization order by id desc limit 0,1 ";
		
		//String sql = "select last_insert_id() as val";
		String sql = "select max(id) as val from t_d0_organization";
		
		
		//List<Object> params = new ArrayList<Object>();
		//params.add(name);
		List<Long_> list = null;
		try {
			list = operQuery(sql,null,Long_.class);			
			if(list.size() != 0){
				System.out.println("list.get(0).getVal()::"+list.get(0).getVal());
				return Integer.parseInt(list.get(0).getVal()+"")+1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	

}
