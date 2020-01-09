package com.wst.service;

import java.util.List;

import com.wst.vo.Privilege;

public interface PriService {
	public boolean addPri(Privilege pri);
	public List<Privilege> getLimited(int page, int size);
	public List<Privilege> getAllPri();
	public Privilege getPribyId(int id);
}
