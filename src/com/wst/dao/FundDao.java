package com.wst.dao;

import java.sql.Connection;
import java.util.List;

import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;

public interface FundDao {

	//全部fund
	//根据行政类别、年份查fund
	public List<T_d0_fund> getAllFund();
	public List<T_d0_fund> getFundbyexeTypeandyearly(String exeType,String yearly);
	//获取年份
	public List<String_> getAllyearly();
	public boolean addFund(T_d0_fund fund);
}
