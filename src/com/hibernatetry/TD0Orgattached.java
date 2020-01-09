package com.hibernatetry;

/**
 * TD0Orgattached entity. @author MyEclipse Persistence Tools
 */

public class TD0Orgattached {

	// Fields

	private String id;
	private TD0Organization TD0Organization;
	private String orgName;
	private String orgNo;
	private String orgCode;
	private Float onworkerNum;
	private Float supervisorNum;
	private Float zbbNum;
	private String ifPublicmanage;
	private Float retireNum;
	private Float officeBuildarea;
	private String buildingOwnership;
	private Float officeBuildingarea;
	private Float businessDivCount;
	private Float funDivCount;
	private Float orgCount;
	private Float equ3count;
	private Float equ2count;
	private Float equ1count;
	private Float busCount;
	private Float rapidtestvehicleCount;
	private Float motorCount;
	private Float cameraCount;
	private Float videoCount;
	private Float copycatNum;
	private Float computerNum;
	private Float notepadNum;
	private Float serverCount;
	private Float pbxCount;
	private Float faxCount;
	private Float ohpCount;
	private String yearly;
	private Float vrcount;

	// Constructors

	/** default constructor */
	public TD0Orgattached() {
	}

	/** minimal constructor */
	public TD0Orgattached(String id) {
		this.id = id;
	}

	/** full constructor */
	public TD0Orgattached(String id, TD0Organization TD0Organization, String orgName, String orgNo, String orgCode,
			Float onworkerNum, Float supervisorNum, Float zbbNum, String ifPublicmanage, Float retireNum,
			Float officeBuildarea, String buildingOwnership, Float officeBuildingarea, Float businessDivCount,
			Float funDivCount, Float orgCount, Float equ3count, Float equ2count, Float equ1count, Float busCount,
			Float rapidtestvehicleCount, Float motorCount, Float cameraCount, Float videoCount, Float copycatNum,
			Float computerNum, Float notepadNum, Float serverCount, Float pbxCount, Float faxCount, Float ohpCount,
			String yearly, Float vrcount) {
		this.id = id;
		this.TD0Organization = TD0Organization;
		this.orgName = orgName;
		this.orgNo = orgNo;
		this.orgCode = orgCode;
		this.onworkerNum = onworkerNum;
		this.supervisorNum = supervisorNum;
		this.zbbNum = zbbNum;
		this.ifPublicmanage = ifPublicmanage;
		this.retireNum = retireNum;
		this.officeBuildarea = officeBuildarea;
		this.buildingOwnership = buildingOwnership;
		this.officeBuildingarea = officeBuildingarea;
		this.businessDivCount = businessDivCount;
		this.funDivCount = funDivCount;
		this.orgCount = orgCount;
		this.equ3count = equ3count;
		this.equ2count = equ2count;
		this.equ1count = equ1count;
		this.busCount = busCount;
		this.rapidtestvehicleCount = rapidtestvehicleCount;
		this.motorCount = motorCount;
		this.cameraCount = cameraCount;
		this.videoCount = videoCount;
		this.copycatNum = copycatNum;
		this.computerNum = computerNum;
		this.notepadNum = notepadNum;
		this.serverCount = serverCount;
		this.pbxCount = pbxCount;
		this.faxCount = faxCount;
		this.ohpCount = ohpCount;
		this.yearly = yearly;
		this.vrcount = vrcount;
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

	public Float getOnworkerNum() {
		return this.onworkerNum;
	}

	public void setOnworkerNum(Float onworkerNum) {
		this.onworkerNum = onworkerNum;
	}

	public Float getSupervisorNum() {
		return this.supervisorNum;
	}

	public void setSupervisorNum(Float supervisorNum) {
		this.supervisorNum = supervisorNum;
	}

	public Float getZbbNum() {
		return this.zbbNum;
	}

	public void setZbbNum(Float zbbNum) {
		this.zbbNum = zbbNum;
	}

	public String getIfPublicmanage() {
		return this.ifPublicmanage;
	}

	public void setIfPublicmanage(String ifPublicmanage) {
		this.ifPublicmanage = ifPublicmanage;
	}

	public Float getRetireNum() {
		return this.retireNum;
	}

	public void setRetireNum(Float retireNum) {
		this.retireNum = retireNum;
	}

	public Float getOfficeBuildarea() {
		return this.officeBuildarea;
	}

	public void setOfficeBuildarea(Float officeBuildarea) {
		this.officeBuildarea = officeBuildarea;
	}

	public String getBuildingOwnership() {
		return this.buildingOwnership;
	}

	public void setBuildingOwnership(String buildingOwnership) {
		this.buildingOwnership = buildingOwnership;
	}

	public Float getOfficeBuildingarea() {
		return this.officeBuildingarea;
	}

	public void setOfficeBuildingarea(Float officeBuildingarea) {
		this.officeBuildingarea = officeBuildingarea;
	}

	public Float getBusinessDivCount() {
		return this.businessDivCount;
	}

	public void setBusinessDivCount(Float businessDivCount) {
		this.businessDivCount = businessDivCount;
	}

	public Float getFunDivCount() {
		return this.funDivCount;
	}

	public void setFunDivCount(Float funDivCount) {
		this.funDivCount = funDivCount;
	}

	public Float getOrgCount() {
		return this.orgCount;
	}

	public void setOrgCount(Float orgCount) {
		this.orgCount = orgCount;
	}

	public Float getEqu3count() {
		return this.equ3count;
	}

	public void setEqu3count(Float equ3count) {
		this.equ3count = equ3count;
	}

	public Float getEqu2count() {
		return this.equ2count;
	}

	public void setEqu2count(Float equ2count) {
		this.equ2count = equ2count;
	}

	public Float getEqu1count() {
		return this.equ1count;
	}

	public void setEqu1count(Float equ1count) {
		this.equ1count = equ1count;
	}

	public Float getBusCount() {
		return this.busCount;
	}

	public void setBusCount(Float busCount) {
		this.busCount = busCount;
	}

	public Float getRapidtestvehicleCount() {
		return this.rapidtestvehicleCount;
	}

	public void setRapidtestvehicleCount(Float rapidtestvehicleCount) {
		this.rapidtestvehicleCount = rapidtestvehicleCount;
	}

	public Float getMotorCount() {
		return this.motorCount;
	}

	public void setMotorCount(Float motorCount) {
		this.motorCount = motorCount;
	}

	public Float getCameraCount() {
		return this.cameraCount;
	}

	public void setCameraCount(Float cameraCount) {
		this.cameraCount = cameraCount;
	}

	public Float getVideoCount() {
		return this.videoCount;
	}

	public void setVideoCount(Float videoCount) {
		this.videoCount = videoCount;
	}

	public Float getCopycatNum() {
		return this.copycatNum;
	}

	public void setCopycatNum(Float copycatNum) {
		this.copycatNum = copycatNum;
	}

	public Float getComputerNum() {
		return this.computerNum;
	}

	public void setComputerNum(Float computerNum) {
		this.computerNum = computerNum;
	}

	public Float getNotepadNum() {
		return this.notepadNum;
	}

	public void setNotepadNum(Float notepadNum) {
		this.notepadNum = notepadNum;
	}

	public Float getServerCount() {
		return this.serverCount;
	}

	public void setServerCount(Float serverCount) {
		this.serverCount = serverCount;
	}

	public Float getPbxCount() {
		return this.pbxCount;
	}

	public void setPbxCount(Float pbxCount) {
		this.pbxCount = pbxCount;
	}

	public Float getFaxCount() {
		return this.faxCount;
	}

	public void setFaxCount(Float faxCount) {
		this.faxCount = faxCount;
	}

	public Float getOhpCount() {
		return this.ohpCount;
	}

	public void setOhpCount(Float ohpCount) {
		this.ohpCount = ohpCount;
	}

	public String getYearly() {
		return this.yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

	public Float getVrcount() {
		return this.vrcount;
	}

	public void setVrcount(Float vrcount) {
		this.vrcount = vrcount;
	}

}