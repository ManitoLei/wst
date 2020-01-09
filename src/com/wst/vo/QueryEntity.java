package com.wst.vo;

public class QueryEntity {

	private String exeType;
	private String orgName;
	private String linkAdd;
	private String orgCode;
	private String areaCode;
	private String ZIPCODE;
	private String orgPro;

	public QueryEntity() {
		super();
	}

	public QueryEntity(String exeType, String orgName, String linkAdd, String orgCode, String areaCode, String zIPCODE,
			String orgPro) {
		super();
		this.exeType = exeType;
		this.orgName = orgName;
		this.linkAdd = linkAdd;
		this.orgCode = orgCode;
		this.areaCode = areaCode;
		ZIPCODE = zIPCODE;
		this.orgPro = orgPro;
	}

	@Override
	public String toString() {
		return "QueryEntity [exeType=" + exeType + ", orgName=" + orgName + ", linkAdd=" + linkAdd + ", orgCode="
				+ orgCode + ", areaCode=" + areaCode + ", ZIPCODE=" + ZIPCODE + ", orgPro=" + orgPro + "]";
	}

	public String getExeType() {
		return exeType;
	}

	public void setExeType(String exeType) {
		this.exeType = exeType;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getLinkAdd() {
		return linkAdd;
	}

	public void setLinkAdd(String linkAdd) {
		this.linkAdd = linkAdd;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}

	public String getOrgPro() {
		return orgPro;
	}

	public void setOrgPro(String orgPro) {
		this.orgPro = orgPro;
	}

}
