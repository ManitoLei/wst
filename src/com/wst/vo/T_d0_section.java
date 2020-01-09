package com.wst.vo;

public class T_d0_section {

	private int id;
	private int orgId;
	private String orgNo;
	private String divCode;
	private String divNameCode;
	private String divName;
	private String ifSub;
	private String dutyTel;
	private String fax;
	private String divRoomNo;
	private String EXETYPE;
	public T_d0_section() {
		super();
	}
	public T_d0_section(int id, int orgId, String orgNo, String divCode, String divNameCode, String divName,
			String ifSub, String dutyTel, String fax, String divRoomNo, String eXETYPE) {
		super();
		this.id = id;
		this.orgId = orgId;
		this.orgNo = orgNo;
		this.divCode = divCode;
		this.divNameCode = divNameCode;
		this.divName = divName;
		this.ifSub = ifSub;
		this.dutyTel = dutyTel;
		this.fax = fax;
		this.divRoomNo = divRoomNo;
		EXETYPE = eXETYPE;
	}
	@Override
	public String toString() {
		return "T_d0_section [id=" + id + ", orgId=" + orgId + ", orgNo=" + orgNo + ", divCode=" + divCode
				+ ", divNameCode=" + divNameCode + ", divName=" + divName + ", ifSub=" + ifSub + ", dutyTel=" + dutyTel
				+ ", fax=" + fax + ", divRoomNo=" + divRoomNo + ", EXETYPE=" + EXETYPE + "]";
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
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getDivCode() {
		return divCode;
	}
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	public String getDivNameCode() {
		return divNameCode;
	}
	public void setDivNameCode(String divNameCode) {
		this.divNameCode = divNameCode;
	}
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public String getIfSub() {
		return ifSub;
	}
	public void setIfSub(String ifSub) {
		this.ifSub = ifSub;
	}
	public String getDutyTel() {
		return dutyTel;
	}
	public void setDutyTel(String dutyTel) {
		this.dutyTel = dutyTel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getDivRoomNo() {
		return divRoomNo;
	}
	public void setDivRoomNo(String divRoomNo) {
		this.divRoomNo = divRoomNo;
	}
	public String getEXETYPE() {
		return EXETYPE;
	}
	public void setEXETYPE(String eXETYPE) {
		EXETYPE = eXETYPE;
	}
	
	
	
}
