package com.hibernatetry;

/**
 * TD0Fund entity. @author MyEclipse Persistence Tools
 */

public class TD0Fund  {

	// Fields

	private String id;
	private TD0Organization TD0Organization;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String yearly;
	private Float preFund;
	private Float businessFund;
	private Float dutyFund;
	private Float buildFund;

	// Constructors

	/** default constructor */
	public TD0Fund() {
	}

	/** minimal constructor */
	public TD0Fund(String id) {
		this.id = id;
	}

	/** full constructor */
	public TD0Fund(String id, TD0Organization TD0Organization, String orgName, String orgNo, String orgCode,
			String yearly, Float preFund, Float businessFund, Float dutyFund, Float buildFund) {
		this.id = id;
		this.TD0Organization = TD0Organization;
		this.orgName = orgName;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.yearly = yearly;
		this.preFund = preFund;
		this.businessFund = businessFund;
		this.dutyFund = dutyFund;
		this.buildFund = buildFund;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TD0Organization getTD0Organization() {
		return this.TD0Organization;
	}

	public void setTD0Organization(TD0Organization TD0Organization) {
		this.TD0Organization = TD0Organization;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getYearly() {
		return this.yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

	public Float getPreFund() {
		return this.preFund;
	}

	public void setPreFund(Float preFund) {
		this.preFund = preFund;
	}

	public Float getBusinessFund() {
		return this.businessFund;
	}

	public void setBusinessFund(Float businessFund) {
		this.businessFund = businessFund;
	}

	public Float getDutyFund() {
		return this.dutyFund;
	}

	public void setDutyFund(Float dutyFund) {
		this.dutyFund = dutyFund;
	}

	public Float getBuildFund() {
		return this.buildFund;
	}

	public void setBuildFund(Float buildFund) {
		this.buildFund = buildFund;
	}

}