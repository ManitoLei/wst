package com.wst.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wst.dao.StuffDao;
import com.wst.vo.Int;
import com.wst.vo.Long_;
import com.wst.vo.T_d0_stuff;

public class StuffDaoImpl  extends BaseDao implements StuffDao{

	@Override
	public boolean addStuff(T_d0_stuff stuff) {
		String sql = "insert into t_d0_stuff values(0,?,?,null,null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(stuff.getSectionId());
		params.add(stuff.getDivCode());
	//	params.add(stuff.getOrgId());
	//	params.add(stuff.getOrgNo());
		params.add(stuff.getRepManName());
		params.add(stuff.getGender());
		params.add(stuff.getBirthDate());
		params.add(stuff.getFolk());
		params.add(stuff.getPol());
		params.add(stuff.getMobile());
		params.add(stuff.getWorkTel());
		params.add(stuff.getEmail());
		params.add(stuff.getEdu());
		params.add(stuff.getGraCollege());
		params.add(stuff.getChoiceSpe());
		params.add(stuff.getSpe());
		params.add(stuff.getBeforeSpe());
		params.add(stuff.getBeginWorkDate());
		params.add(stuff.getManageJob());
		params.add(stuff.getJobLevel());
		params.add(stuff.getTitle());
		params.add(stuff.getGetInDate());
		params.add(stuff.getPerPro());
		params.add(stuff.getPerType());
		params.add(stuff.getEnfCardNo());
		params.add(stuff.getGetCardDate());
		params.add(stuff.getHealthPerNo());
		params.add(stuff.getGetQuaDate());
		params.add(stuff.getHealthCardNo());
		params.add(stuff.getCardDay());
		params.add(stuff.getIfStaffPer());
		params.add(stuff.getPerCode());
		return operUpdate(sql, params);
	}

	@Override
	public List<T_d0_stuff> getAllStuff() {
		String sql = "select * from t_d0_stuff";
		List<T_d0_stuff> list = null;
		try {
			list = operQuery(sql,null,T_d0_stuff.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_stuff> getLimited(int page, int size) {
		String sql = "select * from t_d0_stuff order by id limit ?,?";
		List<T_d0_stuff> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add((page-1)*size);
		params.add(size);
		try {
			list = operQuery(sql,params,T_d0_stuff.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public T_d0_stuff getStuffbyId(int id) {
		String sql = "select * from t_d0_stuff where id=?";
		List<T_d0_stuff> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		try {
			list = operQuery(sql,params,T_d0_stuff.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list!=null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				list.get(0).setBirthDate(format.parse(list.get(0).getBirthDate().toString()));
				list.get(0).setBeginWorkDate(format.parse(list.get(0).getBeginWorkDate().toString()));
				list.get(0).setGetInDate(format.parse(list.get(0).getGetInDate().toString()));
				list.get(0).setGetCardDate(format.parse(list.get(0).getGetCardDate().toString()));
				list.get(0).setGetQuaDate(format.parse(list.get(0).getGetQuaDate().toString()));
				list.get(0).setCardDay(format.parse(list.get(0).getCardDay().toString()));
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
	public boolean updateStuffbyId(int id, T_d0_stuff stuff) {
		if(stuff == null) {
			return false;
		}
		String sql="update t_d0_stuff set sectionId=?,repManName=?,gender=?,birthDate=?,folk=?,pol=?,mobile=?,workTel=?,email=?,edu=?,"+
		"graCollege=?,choiceSpe=?,spe=?,beforeSpe=?,beginWorkDate=?,manageJob=?,jobLevel=?,title=?,getInDate=?,"+
		"perPro=?,perType=?,enfCardNo=?,getCardDate=?,getQuaDate=?,healthCardNo=?,cardDay=?,ifStaffPer=?,perCode=?"
				+ " where id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(stuff.getSectionId());
		params.add(stuff.getRepManName());
		params.add(stuff.getGender());
		params.add(stuff.getBirthDate());
		if("0".equals(stuff.getFolk()))
			params.add(null);
		else
			params.add(stuff.getFolk());
		params.add(stuff.getPol());
		params.add(stuff.getMobile());
		params.add(stuff.getWorkTel());
		params.add(stuff.getEmail());
		params.add(stuff.getEdu());
		params.add(stuff.getGraCollege());
		params.add(stuff.getChoiceSpe());
		if("0".equals(stuff.getSpe()))
			params.add(null);
		else
			params.add(stuff.getSpe());
		params.add(stuff.getBeforeSpe());
		params.add(stuff.getBeginWorkDate());
		params.add(stuff.getManageJob());
		params.add(stuff.getJobLevel());
		params.add(stuff.getTitle());
		params.add(stuff.getGetInDate());
		params.add(stuff.getPerPro());
		params.add(stuff.getPerType());
		params.add(stuff.getEnfCardNo());
		params.add(stuff.getGetCardDate());
		params.add(stuff.getGetQuaDate());
		params.add(stuff.getHealthCardNo());
		params.add(stuff.getCardDay());
		params.add(stuff.getIfStaffPer());
		params.add(stuff.getPerCode());
		params.add(id);
		return operUpdate(sql, params);

	}

	@Override
	public List<T_d0_stuff> getStuffbyPerType(String perType) {
		String sql = "select * from t_d0_stuff where perType=?";
		List<T_d0_stuff> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(perType);
		try {
			list = operQuery(sql,params,T_d0_stuff.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getCountbyPerType(String perType) {
		String sql = "select count(*) as val from t_d0_stuff  where perType=?";

		List<Int> list = null;
		try {
			list = operQuery(sql,null,Int.class);			
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
