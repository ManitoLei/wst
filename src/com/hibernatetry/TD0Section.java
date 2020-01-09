package com.hibernatetry;

import java.util.HashSet;
import java.util.Set;

/**
 * TD0Section entity. @author MyEclipse Persistence Tools
 */

public class TD0Section {

	// Fields

	private String id;
	private TD0Organization TD0Organization;
	private String orgNo;
	private String divCode;
	private String divNameCode;
	private String divName;
	private String ifSub;
	private String dutyTel;
	private String fax;
	private String divRoomNo;
	private String exetype;
	private Set TD0Stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TD0Section() {
	}

	/** minimal constructor */
	public TD0Section(String id) {
		this.id = id;
	}

	/** full constructor */
	public TD0Section(String id, TD0Organization TD0Organization, String orgNo, String divCode, String divNameCode,
			String divName, String ifSub, String dutyTel, String fax, String divRoomNo, String exetype, Set TD0Stuffs) {
		this.id = id;
		this.TD0Organization = TD0Organization;
		this.orgNo = orgNo;
		this.divCode = divCode;
		this.divNameCode = divNameCode;
		this.divName = divName;
		this.ifSub = ifSub;
		this.dutyTel = dutyTel;
		this.fax = fax;
		this.divRoomNo = divRoomNo;
		this.exetype = exetype;
		this.TD0Stuffs = TD0Stuffs;
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

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getDivCode() {
		return this.divCode;
	}

	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}

	public String getDivNameCode() {
		return this.divNameCode;
	}

	public void setDivNameCode(String divNameCode) {
		this.divNameCode = divNameCode;
	}

	public String getDivName() {
		return this.divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	public String getIfSub() {
		return this.ifSub;
	}

	public void setIfSub(String ifSub) {
		this.ifSub = ifSub;
	}

	public String getDutyTel() {
		return this.dutyTel;
	}

	public void setDutyTel(String dutyTel) {
		this.dutyTel = dutyTel;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDivRoomNo() {
		return this.divRoomNo;
	}

	public void setDivRoomNo(String divRoomNo) {
		this.divRoomNo = divRoomNo;
	}

	public String getExetype() {
		return this.exetype;
	}

	public void setExetype(String exetype) {
		this.exetype = exetype;
	}

	public Set getTD0Stuffs() {
		return this.TD0Stuffs;
	}

	public void setTD0Stuffs(Set TD0Stuffs) {
		this.TD0Stuffs = TD0Stuffs;
	}

}