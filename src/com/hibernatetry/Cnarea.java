package com.hibernatetry;

/**
 * Cnarea entity. @author MyEclipse Persistence Tools
 */

public class Cnarea {

	// Fields

	private Integer id;
	private Boolean level;
	private Long parentCode;
	private Long areaCode;
	private String cityCode;
	private String name;
	private String shortName;
	private String mergerName;
	private String icode;

	// Constructors

	/** default constructor */
	public Cnarea() {
	}

	/** full constructor */
	public Cnarea(Boolean level, Long parentCode, Long areaCode, String cityCode, String name, String shortName,
			String mergerName, String icode) {
		this.level = level;
		this.parentCode = parentCode;
		this.areaCode = areaCode;
		this.cityCode = cityCode;
		this.name = name;
		this.shortName = shortName;
		this.mergerName = mergerName;
		this.icode = icode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getLevel() {
		return this.level;
	}

	public void setLevel(Boolean level) {
		this.level = level;
	}

	public Long getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(Long parentCode) {
		this.parentCode = parentCode;
	}

	public Long getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMergerName() {
		return this.mergerName;
	}

	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
	}

	public String getIcode() {
		return this.icode;
	}

	public void setIcode(String icode) {
		this.icode = icode;
	}

}