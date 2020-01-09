package com.wst.service.impl;

import java.util.List;

import com.wst.dao.SectionDao;
import com.wst.dao.impl.SectionDaoImpl;
import com.wst.service.SectionService;
import com.wst.vo.T_d0_section;

public class SectionServiceImpl implements SectionService{

	SectionDao sectionDao = new SectionDaoImpl();
	
	
	@Override
	public boolean addSection(T_d0_section section) {
		return sectionDao.addSection(section);
	}


	@Override
	public List<T_d0_section> section_list(int page, int size) {
		return sectionDao.getLimited(page, size);
	}


	@Override
	public List<T_d0_section> query_section_list(int id, String secname, int page, int size) {
		System.out.println("sectionserviceimpl");
		return sectionDao.getByConditions(id, secname, page, size);
	}
	

}
