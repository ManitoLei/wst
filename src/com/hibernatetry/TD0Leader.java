package com.hibernatetry;

import java.sql.Timestamp;

/**
 * TD0Leader entity. @author MyEclipse Persistence Tools
 */

public class TD0Leader{

	// Fields

	private String id;
	private TD0Organization TD0Organization;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String formFillingMan;
	private String linkTel;
	private String leaderName;
	private String gender;
	private String folk;
	private Timestamp birthDate;
	private String pol;
	private String edu;
	private String degree;
	private String manageJob;
	private String title;
	private String memo;
	private Timestamp serDate;
	private Timestamp leaveDate;
	private String yearly;

	// Constructors

	/** default constructor */
	public TD0Leader() {
	}

	/** minimal constructor */
	public TD0Leader(String id, Timestamp birthDate, Timestamp serDate, Timestamp leaveDate) {
		this.id = id;
		this.birthDate = birthDate;
		this.serDate = serDate;
		this.leaveDate = leaveDate;
	}

	/** full constructor */
	public TD0Leader(String id, TD0Organization TD0Organization, String orgName, String orgNo, String orgCode,
			String formFillingMan, String linkTel, String leaderName, String gender, String folk, Timestamp birthDate,
			String pol, String edu, String degree, String manageJob, String title, String memo, Timestamp serDate,
			Timestamp leaveDate, String yearly) {
		this.id = id;
		this.TD0Organization = TD0Organization;
		this.orgName = orgName;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.formFillingMan = formFillingMan;
		this.linkTel = linkTel;
		this.leaderName = leaderName;
		this.gender = gender;
		this.folk = folk;
		this.birthDate = birthDate;
		this.pol = pol;
		this.edu = edu;
		this.degree = degree;
		this.manageJob = manageJob;
		this.title = title;
		this.memo = memo;
		this.serDate = serDate;
		this.leaveDate = leaveDate;
		this.yearly = yearly;
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

	public String getFormFillingMan() {
		return this.formFillingMan;
	}

	public void setFormFillingMan(String formFillingMan) {
		this.formFillingMan = formFillingMan;
	}

	public String getLinkTel() {
		return this.linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public String getLeaderName() {
		return this.leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFolk() {
		return this.folk;
	}

	public void setFolk(String folk) {
		this.folk = folk;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getPol() {
		return this.pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getEdu() {
		return this.edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getManageJob() {
		return this.manageJob;
	}

	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Timestamp getSerDate() {
		return this.serDate;
	}

	public void setSerDate(Timestamp serDate) {
		this.serDate = serDate;
	}

	public Timestamp getLeaveDate() {
		return this.leaveDate;
	}

	public void setLeaveDate(Timestamp leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getYearly() {
		return this.yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

}