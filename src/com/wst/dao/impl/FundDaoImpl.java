package com.wst.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.wst.dao.FundDao;
import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;

public class FundDaoImpl extends BaseDao implements FundDao{

	@Override
	public List<T_d0_fund> getAllFund() {
		String sql = "select * from t_d0_fund";
		List<T_d0_fund> list = null;
		try {
			list = operQuery(sql,null,T_d0_fund.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<T_d0_fund> getFundbyexeTypeandyearly(String exeType, String yearly) {
		String sql = "select t_d0_fund.* from t_d0_fund,t_d0_organization where t_d0_fund.orgId=t_d0_organization.id and 1=1 ";
		List<T_d0_fund> list = null;
		List<Object> params = new ArrayList<Object>();
		if(exeType!=null && exeType.length()>0 && !exeType.equals("0")) {
			sql+=" and t_d0_organization.exeType=?";
			params.add(exeType);
		}
		if(yearly!=null && yearly.length()>0 && !yearly.equals("0")) {
			sql+=" and t_d0_fund.yearly=?";
			params.add(yearly);
		}
		System.out.println("exetype and year sql::"+sql);
		try {
			list = operQuery(sql,params,T_d0_fund.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<String_> getAllyearly() {
		String sql = "select distinct trim(yearly) as val from t_d0_fund";
		List<String_> list = null;
		try {
			list = operQuery(sql,null,String_.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addFund(T_d0_fund fund) {
		String sql = "insert into t_d0_fund values(0,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		//params.add(org.getId());
		params.add(fund.getOrgId());
		params.add(fund.getOrgName());
		params.add(fund.getOrgNo());
		params.add(fund.getOrgCode());
		params.add(fund.getYearly());
		params.add(fund.getPreFund());
		params.add(fund.getBusinessFund());
		params.add(fund.getDutyFund());
		params.add(fund.getBuildFund());
		return operUpdate(sql, params);
	}

	
}
