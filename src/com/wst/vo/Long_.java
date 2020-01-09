package com.wst.vo;

public class Long_ {

	private long val;
	
	public Long_() {
		
	}
	
	public Long_(long val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return "["+this.val+"]";
	}
	
	public long getVal() {
		return this.val;
	}
	
	public void setVal(long val) {
		this.val = val;
	}
}
