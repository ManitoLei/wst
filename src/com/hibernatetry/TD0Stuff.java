package com.hibernatetry;

import java.sql.Timestamp;

/**
 * TD0Stuff entity. @author MyEclipse Persistence Tools
 */

public class TD0Stuff  {

	// Fields

	private String id;
	private TD0Section TD0Section;
	private String divCode;
	private String orgId;
	private String orgNo;
	private String repManName;
	private String gender;
	private Timestamp birthDate;
	private String folk;
	private String pol;
	private String mobile;
	private String workTel;
	private String email;
	private String edu;
	private String graCollege;
	private String choiceSpe;
	private String spe;
	private String beforeSpe;
	private Timestamp beginWorkDate;
	private String manageJob;
	private String jobLevel;
	private String title;
	private Timestamp getInDate;
	private String perPro;
	private String perType;
	private String enfCardNo;
	private Timestamp getCardDate;
	private String healthPerNo;
	private Timestamp getQuaDate;
	private String healthCardNo;
	private Timestamp cardDay;
	private String ifStaffPer;
	private String perCode;

	// Constructors

	/** default constructor */
	public TD0Stuff() {
	}

	/** minimal constructor */
	public TD0Stuff(String id, Timestamp birthDate, Timestamp beginWorkDate, Timestamp getInDate, Timestamp getCardDate,
			Timestamp getQuaDate, Timestamp cardDay) {
		this.id = id;
		this.birthDate = birthDate;
		this.beginWorkDate = beginWorkDate;
		this.getInDate = getInDate;
		this.getCardDate = getCardDate;
		this.getQuaDate = getQuaDate;
		this.cardDay = cardDay;
	}

	/** full constructor */
	public TD0Stuff(String id, TD0Section TD0Section, String divCode, String orgId, String orgNo, String repManName,
			String gender, Timestamp birthDate, String folk, String pol, String mobile, String workTel, String email,
			String edu, String graCollege, String choiceSpe, String spe, String beforeSpe, Timestamp beginWorkDate,
			String manageJob, String jobLevel, String title, Timestamp getInDate, String perPro, String perType,
			String enfCardNo, Timestamp getCardDate, String healthPerNo, Timestamp getQuaDate, String healthCardNo,
			Timestamp cardDay, String ifStaffPer, String perCode) {
		this.id = id;
		this.TD0Section = TD0Section;
		this.divCode = divCode;
		this.orgId = orgId;
		this.orgNo = orgNo;
		this.repManName = repManName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.folk = folk;
		this.pol = pol;
		this.mobile = mobile;
		this.workTel = workTel;
		this.email = email;
		this.edu = edu;
		this.graCollege = graCollege;
		this.choiceSpe = choiceSpe;
		this.spe = spe;
		this.beforeSpe = beforeSpe;
		this.beginWorkDate = beginWorkDate;
		this.manageJob = manageJob;
		this.jobLevel = jobLevel;
		this.title = title;
		this.getInDate = getInDate;
		this.perPro = perPro;
		this.perType = perType;
		this.enfCardNo = enfCardNo;
		this.getCardDate = getCardDate;
		this.healthPerNo = healthPerNo;
		this.getQuaDate = getQuaDate;
		this.healthCardNo = healthCardNo;
		this.cardDay = cardDay;
		this.ifStaffPer = ifStaffPer;
		this.perCode = perCode;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TD0Section getTD0Section() {
		return this.TD0Section;
	}

	public void setTD0Section(TD0Section TD0Section) {
		this.TD0Section = TD0Section;
	}

	public String getDivCode() {
		return this.divCode;
	}

	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getRepManName() {
		return this.repManName;
	}

	public void setRepManName(String repManName) {
		this.repManName = repManName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getFolk() {
		return this.folk;
	}

	public void setFolk(String folk) {
		this.folk = folk;
	}

	public String getPol() {
		return this.pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWorkTel() {
		return this.workTel;
	}

	public void setWorkTel(String workTel) {
		this.workTel = workTel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEdu() {
		return this.edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getGraCollege() {
		return this.graCollege;
	}

	public void setGraCollege(String graCollege) {
		this.graCollege = graCollege;
	}

	public String getChoiceSpe() {
		return this.choiceSpe;
	}

	public void setChoiceSpe(String choiceSpe) {
		this.choiceSpe = choiceSpe;
	}

	public String getSpe() {
		return this.spe;
	}

	public void setSpe(String spe) {
		this.spe = spe;
	}

	public String getBeforeSpe() {
		return this.beforeSpe;
	}

	public void setBeforeSpe(String beforeSpe) {
		this.beforeSpe = beforeSpe;
	}

	public Timestamp getBeginWorkDate() {
		return this.beginWorkDate;
	}

	public void setBeginWorkDate(Timestamp beginWorkDate) {
		this.beginWorkDate = beginWorkDate;
	}

	public String getManageJob() {
		return this.manageJob;
	}

	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}

	public String getJobLevel() {
		return this.jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getGetInDate() {
		return this.getInDate;
	}

	public void setGetInDate(Timestamp getInDate) {
		this.getInDate = getInDate;
	}

	public String getPerPro() {
		return this.perPro;
	}

	public void setPerPro(String perPro) {
		this.perPro = perPro;
	}

	public String getPerType() {
		return this.perType;
	}

	public void setPerType(String perType) {
		this.perType = perType;
	}

	public String getEnfCardNo() {
		return this.enfCardNo;
	}

	public void setEnfCardNo(String enfCardNo) {
		this.enfCardNo = enfCardNo;
	}

	public Timestamp getGetCardDate() {
		return this.getCardDate;
	}

	public void setGetCardDate(Timestamp getCardDate) {
		this.getCardDate = getCardDate;
	}

	public String getHealthPerNo() {
		return this.healthPerNo;
	}

	public void setHealthPerNo(String healthPerNo) {
		this.healthPerNo = healthPerNo;
	}

	public Timestamp getGetQuaDate() {
		return this.getQuaDate;
	}

	public void setGetQuaDate(Timestamp getQuaDate) {
		this.getQuaDate = getQuaDate;
	}

	public String getHealthCardNo() {
		return this.healthCardNo;
	}

	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}

	public Timestamp getCardDay() {
		return this.cardDay;
	}

	public void setCardDay(Timestamp cardDay) {
		this.cardDay = cardDay;
	}

	public String getIfStaffPer() {
		return this.ifStaffPer;
	}

	public void setIfStaffPer(String ifStaffPer) {
		this.ifStaffPer = ifStaffPer;
	}

	public String getPerCode() {
		return this.perCode;
	}

	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}

}