package com.wst.service.impl;

import java.util.List;

import com.wst.dao.FundDao;
import com.wst.dao.impl.FundDaoImpl;
import com.wst.service.FundService;
import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;

public class FundServiceImpl implements FundService{
	
	FundDao fundDao = new FundDaoImpl();
	
	@Override
	public List<T_d0_fund> getAllFund() {
		return fundDao.getAllFund();
	}

	@Override
	public List<T_d0_fund> getFundbyexeTypeandyearly(String exexType, String yearly) {
		return fundDao.getFundbyexeTypeandyearly(exexType, yearly);
	}

	@Override
	public List<String_> getAllyearly() {
		return fundDao.getAllyearly();
	}

	@Override
	public boolean fund_create(T_d0_fund fund) {
		return fundDao.addFund(fund);
	}

}
