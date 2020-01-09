package com.wst.service;

import java.util.List;

import com.wst.vo.QueryEntity;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_section;

public interface SectionService {
	public boolean addSection(T_d0_section section);
	public List<T_d0_section> section_list(int page, int size);
	public List<T_d0_section> query_section_list(int id,String secname,int page, int size);
}
