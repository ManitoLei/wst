package com.wst.vo;

import java.util.Date;

public class T_d0_leader {

	private int id;
	private int orgId;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String formFillingMan;
	private String linkTel;
	private String leaderName;
	private String gender;
	private String folk;
	private Date birthDate;
	private String pol;
	private String edu;
	private String degree;
	private String manageJob;
	private String title;
	private String memo;
	private Date serDate;
	private Date leaveDate;
	private String yearly;

	public T_d0_leader() {
		super();
	}

	public T_d0_leader(int id, int orgId, String orgName, String orgNo, String orgCode, String formFillingMan,
			String linkTel, String leaderName, String gender, String folk, Date birthDate, String pol, String edu,
			String degree, String manageJob, String title, String memo, Date serDate, Date leaveDate,
			String yearly) {
		super();
		this.id = id;
		this.orgId = orgId;
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

	@Override
	public String toString() {
		return "T_d0_leader [id=" + id + ", orgId=" + orgId + ", orgName=" + orgName + ", orgNo=" + orgNo + ", orgCode="
				+ orgCode + ", formFillingMan=" + formFillingMan + ", linkTel=" + linkTel + ", leaderName=" + leaderName
				+ ", gender=" + gender + ", folk=" + folk + ", birthDate=" + birthDate + ", pol=" + pol + ", edu=" + edu
				+ ", degree=" + degree + ", manageJob=" + manageJob + ", title=" + title + ", memo=" + memo
				+ ", serDate=" + serDate + ", leaveDate=" + leaveDate + ", yearly=" + yearly + "]";
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

	public String getFormFillingMan() {
		return formFillingMan;
	}

	public void setFormFillingMan(String formFillingMan) {
		this.formFillingMan = formFillingMan;
	}

	public String getLinkTel() {
		return linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFolk() {
		return folk;
	}

	public void setFolk(String folk) {
		this.folk = folk;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getManageJob() {
		return manageJob;
	}

	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getSerDate() {
		return serDate;
	}

	public void setSerDate(Date serDate) {
		this.serDate = serDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getYearly() {
		return yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

}
