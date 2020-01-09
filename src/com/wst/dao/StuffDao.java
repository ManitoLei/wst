package com.wst.dao;

import java.util.List;

import com.wst.vo.T_d0_stuff;

public interface StuffDao {
	public boolean addStuff(T_d0_stuff stuff);
	public List<T_d0_stuff> getAllStuff();
	public List<T_d0_stuff> getLimited(int page, int size);
	public T_d0_stuff getStuffbyId(int id);
	public boolean updateStuffbyId(int id,T_d0_stuff stuff);
	
	//��ѯ�����ලԱ/רҵ������Ա/����������Ա��Ϣ
	public List<T_d0_stuff> getStuffbyPerType(String perType);
	//��ѯ�����ලԱ/רҵ������Ա/����������Ա������
	public int getCountbyPerType(String perType);
}
