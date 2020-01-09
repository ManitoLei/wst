package com.wst.dao;

public interface SequenceDao {
	public long getNextValbyName(String name);
	public int getOrgidfromOrgbylastInsert();
}
