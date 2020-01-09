package com.wst.dao;

import java.sql.Connection;
import java.util.List;

import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;

public interface FundDao {

	//ȫ��fund
	//�������������ݲ�fund
	public List<T_d0_fund> getAllFund();
	public List<T_d0_fund> getFundbyexeTypeandyearly(String exeType,String yearly);
	//��ȡ���
	public List<String_> getAllyearly();
	public boolean addFund(T_d0_fund fund);
}
