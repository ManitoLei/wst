package com.wst.service;

import java.util.List;

import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;

public interface FundService {
	public List<T_d0_fund> getAllFund();
	public List<T_d0_fund> getFundbyexeTypeandyearly(String exeType,String yearly);
	public List<String_> getAllyearly();
	public boolean fund_create(T_d0_fund fund);
}
