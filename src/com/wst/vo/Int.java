package com.wst.vo;

public class Int {

	private int val;
	
	public Int() {
		
	}
	
	public Int(int val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return "["+this.val+"]";
	}
	
	public int getVal() {
		return this.val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
}
