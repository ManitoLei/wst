package com.hibernatetry;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TD0Organization entity. @author MyEclipse Persistence Tools
 */

public class TD0Organization {

	// Fields

	private String id;
	private String orgNo;
	private String orgCode;
	private String orgName;
	private String exeType;
	private String areaCode;
	private String linkAdd;
	private Timestamp listingDate;
	private Timestamp standaloneDate;
	private String areaType;
	private Timestamp zbbdocDate;
	private String orgLevel;
	private String orgPro;
	private String zipcode;
	private Set TD0Sections = new HashSet(0);
	private Set TD0Funds = new HashSet(0);
	private Set TD0Leaders = new HashSet(0);
	private Set TD0Orgattacheds = new HashSet(0);

	// Constructors

	/** default constructor */
	public TD0Organization() {
	}

	/** minimal constructor */
	public TD0Organization(String id, Timestamp listingDate, Timestamp standaloneDate, Timestamp zbbdocDate) {
		this.id = id;
		this.listingDate = listingDate;
		this.standaloneDate = standaloneDate;
		this.zbbdocDate = zbbdocDate;
	}

	/** full constructor */
	public TD0Organization(String id, String orgNo, String orgCode, String orgName, String exeType, String areaCode,
			String linkAdd, Timestamp listingDate, Timestamp standaloneDate, String areaType, Timestamp zbbdocDate,
			String orgLevel, String orgPro, String zipcode, Set TD0Sections, Set TD0Funds, Set TD0Leaders,
			Set TD0Orgattacheds) {
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
		this.zipcode = zipcode;
		this.TD0Sections = TD0Sections;
		this.TD0Funds = TD0Funds;
		this.TD0Leaders = TD0Leaders;
		this.TD0Orgattacheds = TD0Orgattacheds;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getExeType() {
		return this.exeType;
	}

	public void setExeType(String exeType) {
		this.exeType = exeType;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getLinkAdd() {
		return this.linkAdd;
	}

	public void setLinkAdd(String linkAdd) {
		this.linkAdd = linkAdd;
	}

	public Timestamp getListingDate() {
		return this.listingDate;
	}

	public void setListingDate(Timestamp listingDate) {
		this.listingDate = listingDate;
	}

	public Timestamp getStandaloneDate() {
		return this.standaloneDate;
	}

	public void setStandaloneDate(Timestamp standaloneDate) {
		this.standaloneDate = standaloneDate;
	}

	public String getAreaType() {
		return this.areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public Timestamp getZbbdocDate() {
		return this.zbbdocDate;
	}

	public void setZbbdocDate(Timestamp zbbdocDate) {
		this.zbbdocDate = zbbdocDate;
	}

	public String getOrgLevel() {
		return this.orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getOrgPro() {
		return this.orgPro;
	}

	public void setOrgPro(String orgPro) {
		this.orgPro = orgPro;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Set getTD0Sections() {
		return this.TD0Sections;
	}

	public void setTD0Sections(Set TD0Sections) {
		this.TD0Sections = TD0Sections;
	}

	public Set getTD0Funds() {
		return this.TD0Funds;
	}

	public void setTD0Funds(Set TD0Funds) {
		this.TD0Funds = TD0Funds;
	}

	public Set getTD0Leaders() {
		return this.TD0Leaders;
	}

	public void setTD0Leaders(Set TD0Leaders) {
		this.TD0Leaders = TD0Leaders;
	}

	public Set getTD0Orgattacheds() {
		return this.TD0Orgattacheds;
	}

	public void setTD0Orgattacheds(Set TD0Orgattacheds) {
		this.TD0Orgattacheds = TD0Orgattacheds;
	}

}