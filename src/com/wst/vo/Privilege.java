package com.wst.vo;

import java.util.Date;

public class Privilege {

	private int id;
	private String name;
	private Date starttime;
	private Date endtime;
	private String desc;

	public Privilege() {
		super();
	}

	public Privilege(int id, String name, Date starttime, Date endtime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", desc=" + desc + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
