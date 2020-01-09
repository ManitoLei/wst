package com.wst.vo;

public class OrgandInfo {

	private T_d0_organization org;
	private  T_d0_orgattached info;

	public OrgandInfo() {
		super();
	}

	public OrgandInfo(T_d0_organization org, T_d0_orgattached info) {
		super();
		this.org = org;
		this.info = info;
	}

	@Override
	public String toString() {
		return "OrgandSec [org=" + org + ", info=" + info + "]";
	}

	public T_d0_organization getOrg() {
		return org;
	}

	public void setOrg(T_d0_organization org) {
		this.org = org;
	}

	public T_d0_orgattached getInfo() {
		return info;
	}

	public void setInfo(T_d0_orgattached info) {
		this.info = info;
	}

}
