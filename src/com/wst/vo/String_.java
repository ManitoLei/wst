package com.wst.vo;

public class String_ {

	private String val;
	
	public String_() {
		
	}
	
	public String_(String val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return "["+this.val+"]";
	}
	
	public String getVal() {
		return this.val;
	}
	
	public void setVal(String val) {
		this.val = val;
	}
}
