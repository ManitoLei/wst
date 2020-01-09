package com.wst.dao;

import java.util.List;

import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_section;

public interface SectionDao {
	public boolean addSection(T_d0_section section);
	public List<T_d0_section> getAllSec();
	public List<T_d0_section> getLimited(int page, int size);
	public List<T_d0_section> getByConditions(int id,String secname,int page,int size);

}
