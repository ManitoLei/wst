package com.wst.vo;

public class T_d0_fund {

	private int id;
	private int orgId;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String yearly;
	private float preFund;
	private float businessFund;
	private float dutyFund;
	private float buildFund;

	public T_d0_fund() {
		super();
	}

	public T_d0_fund(int id, int orgId, String orgName, String orgNo, String orgCode, String yearly, float preFund,
			float businessFund, float dutyFund, float buildFund) {
		super();
		this.id = id;
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.yearly = yearly;
		this.preFund = preFund;
		this.businessFund = businessFund;
		this.dutyFund = dutyFund;
		this.buildFund = buildFund;
	}

	@Override
	public String toString() {
		return "T_d0_fund [id=" + id + ", orgId=" + orgId + ", orgName=" + orgName + ", orgNo=" + orgNo + ", orgCode="
				+ orgCode + ", yearly=" + yearly + ", preFund=" + preFund + ", businessFund=" + businessFund
				+ ", dutyFund=" + dutyFund + ", buildFund=" + buildFund + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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

	public String getYearly() {
		return yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

	public float getPreFund() {
		return preFund;
	}

	public void setPreFund(float preFund) {
		this.preFund = preFund;
	}

	public float getBusinessFund() {
		return businessFund;
	}

	public void setBusinessFund(float businessFund) {
		this.businessFund = businessFund;
	}

	public float getDutyFund() {
		return dutyFund;
	}

	public void setDutyFund(float dutyFund) {
		this.dutyFund = dutyFund;
	}

	public float getBuildFund() {
		return buildFund;
	}

	public void setBuildFund(float buildFund) {
		this.buildFund = buildFund;
	}

}
