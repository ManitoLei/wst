package com.wst.vo;

import java.util.Date;

public class T_d0_organization {

	private int id;
	private String orgNo;
	private String orgCode;
	private String orgName;
	private String exeType;
	private String areaCode;
	private String linkAdd;
	private Date listingDate;
	private Date standaloneDate;
	private String areaType;
	private Date zbbdocDate;
	private String orgLevel;
	private String orgPro;
	private String ZIPCODE;

	public T_d0_organization() {
		super();
	}

	public T_d0_organization(int id, String orgNo, String orgCode, String orgName, String exeType, String areaCode,
			String linkAdd, Date listingDate, Date standaloneDate, String areaType, Date zbbdocDate, String orgLevel,
			String orgPro, String zIPCODE) {
		super();
		this.id = id;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.exeType = exeType;
		this.areaCode = areaCode;
		this.linkAdd = linkAdd;
		this.listingDate = listingDate;
		this.standaloneDate = standaloneDate;
		this.areaType = areaType;
		this.zbbdocDate = zbbdocDate;
		this.orgLevel = orgLevel;
		this.orgPro = orgPro;
		ZIPCODE = zIPCODE;
	}

	@Override
	public String toString() {
		return "T_d0_organization [id=" + id + ", orgNo=" + orgNo + ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", exeType=" + exeType + ", areaCode=" + areaCode + ", linkAdd=" + linkAdd + ", listingDate="
				+ listingDate + ", standaloneDate=" + standaloneDate + ", areaType=" + areaType + ", zbbdocDate="
				+ zbbdocDate + ", orgLevel=" + orgLevel + ", orgPro=" + orgPro + ", ZIPCODE=" + ZIPCODE + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getExeType() {
		return exeType;
	}

	public void setExeType(String exeType) {
		this.exeType = exeType;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getLinkAdd() {
		return linkAdd;
	}

	public void setLinkAdd(String linkAdd) {
		this.linkAdd = linkAdd;
	}

	public Date getListingDate() {
		return listingDate;
	}

	public void setListingDate(Date listingDate) {
		this.listingDate = listingDate;
	}

	public Date getStandaloneDate() {
		return standaloneDate;
	}

	public void setStandaloneDate(Date standaloneDate) {
		this.standaloneDate = standaloneDate;
	}

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public Date getZbbdocDate() {
		return zbbdocDate;
	}

	public void setZbbdocDate(Date zbbdocDate) {
		this.zbbdocDate = zbbdocDate;
	}

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getOrgPro() {
		return orgPro;
	}

	public void setOrgPro(String orgPro) {
		this.orgPro = orgPro;
	}

	public String getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}

}
