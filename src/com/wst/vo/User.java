package com.wst.vo;

public class User {

	private int id;
	private String username;
	private String password;
	private String name;
	private String sectionroom;
	private String desc;

	public User() {
		super();
	}

	public User(int id, String username, String password, String name, String sectionroom, String desc) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sectionroom = sectionroom;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", sectionroom=" + sectionroom + ", desc=" + desc + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSectionroom() {
		return sectionroom;
	}

	public void setSectionroom(String sectionroom) {
		this.sectionroom = sectionroom;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
