package com.wst.service;

import java.sql.SQLException;
import java.util.List;

import com.wst.vo.T_d0_stuff;

public interface StuffService {
	public boolean stuff_create(T_d0_stuff stuff);
	public List<T_d0_stuff> stuff_list(int page, int size);
	public T_d0_stuff getStuffbyId(int id);
	public boolean stuff_update(int id,T_d0_stuff stuff) ;
	//��ѯ�����ලԱ/רҵ������Ա/����������Ա��Ϣ
	public List<T_d0_stuff> getStuffbyPerType(String perType);
	//��ѯ�����ලԱ/רҵ������Ա/����������Ա������
	public int getCountbyPerType(String perType);
}
