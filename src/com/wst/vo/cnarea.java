package com.wst.vo;

public class cnarea {
	private int id;
	private short level;
	private long parent_code;
	private long area_code;
	private char city_code;
	private String name;
	private String short_name;
	private String merger_name;
	private String icode;

	public cnarea() {
		super();
	}

	public cnarea(int id, short level, long parent_code, long area_code, char city_code, String name, String short_name,
			String merger_name, String icode) {
		super();
		this.id = id;
		this.level = level;
		this.parent_code = parent_code;
		this.area_code = area_code;
		this.city_code = city_code;
		this.name = name;
		this.short_name = short_name;
		this.merger_name = merger_name;
		this.icode = icode;
	}

	@Override
	public String toString() {
		return "cnarea [id=" + id + ", level=" + level + ", parent_code=" + parent_code + ", area_code=" + area_code
				+ ", city_code=" + city_code + ", name=" + name + ", short_name=" + short_name + ", merger_name="
				+ merger_name + ", icode=" + icode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public long getParent_code() {
		return parent_code;
	}

	public void setParent_code(long parent_code) {
		this.parent_code = parent_code;
	}

	public long getArea_code() {
		return area_code;
	}

	public void setArea_code(long area_code) {
		this.area_code = area_code;
	}

	public char getCity_code() {
		return city_code;
	}

	public void setCity_code(char city_code) {
		this.city_code = city_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getMerger_name() {
		return merger_name;
	}

	public void setMerger_name(String merger_name) {
		this.merger_name = merger_name;
	}

	public String getIcode() {
		return icode;
	}

	public void setIcode(String icode) {
		this.icode = icode;
	}

}
