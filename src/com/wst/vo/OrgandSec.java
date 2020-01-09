package com.wst.vo;

public class OrgandSec {

	private T_d0_organization org;
	private T_d0_section sec;

	public OrgandSec() {
		super();
	}

	public OrgandSec(T_d0_organization org, T_d0_section sec) {
		super();
		this.org = org;
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "OrgandSec [org=" + org + ", sec=" + sec + "]";
	}

	public T_d0_organization getOrg() {
		return org;
	}

	public void setOrg(T_d0_organization org) {
		this.org = org;
	}

	public T_d0_section getSec() {
		return sec;
	}

	public void setSec(T_d0_section sec) {
		this.sec = sec;
	}

}
