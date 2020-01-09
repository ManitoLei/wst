package com.wst.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.wst.dao.OrgattachedDao;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;

public class OrgattachedDaoImpl extends BaseDao implements OrgattachedDao{

	@Override
	public boolean addOrg(T_d0_orgattached org,Connection conn) {
		String sql = "insert into t_d0_orgattached values(0,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		//params.add(org.getId());
		params.add(org.getOrgId());
		params.add(org.getOrgName());
		params.add(org.getOrgNo());
		params.add(org.getOrgCode());
		params.add(org.getOnworkerNum());
		params.add(org.getSupervisorNum());
		params.add(org.getZbbNum());
		params.add(org.getIfPublicmanage());
		params.add(org.getRetireNum());
		params.add(org.getOfficeBuildarea());
		params.add(org.getBuildingOwnership());
		params.add(org.getOfficeBuildingarea());
		params.add(org.getBusinessDivCount());
		params.add(org.getFunDivCount());
		params.add(org.getOrgCount());
		params.add(org.getEqu3Count());
		params.add(org.getEqu2Count());
		params.add(org.getEqu1Count());
		params.add(org.getBusCount());
		params.add(org.getRapidtestvehicleCount());
		params.add(org.getMotorCount());
		params.add(org.getCameraCount());
		params.add(org.getVideoCount());
		params.add(org.getCopycatNum());
		params.add(org.getComputerNum());
		params.add(org.getNotepadNum());
		params.add(org.getServerCount());
		params.add(org.getPbxCount());
		params.add(org.getFaxCount());
		params.add(org.getOhpCount());
		params.add(org.getYearly());
		params.add(org.getVRCOUNT());
		return operUpdate(sql, params,conn);
	}

	@Override
	public T_d0_orgattached getOrgbyorgId(int id) {
		String sql = "select * from t_d0_orgattached where orgId=?";
		List<T_d0_orgattached> list = null;
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		try {
			list = operQuery(sql,params,T_d0_orgattached.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(list!=null)
			return list.get(0);
		else
			return null;
	}

	@Override
	public boolean updateInfobyorgId(int id, T_d0_orgattached info,Connection conn) {
		if(info == null) {
			return false;
		}
		String sql="update t_d0_orgattached set orgName=?,onworkerNum=?,supervisorNum=?,zbbNum=?,ifPublicmanage=?,retireNum=?,\r\n" + 
				"		officeBuildarea=?,buildingOwnership=?,officeBuildingarea=?,businessDivCount=?,funDivCount=?,orgCount=?,\r\n" + 
				"		equ3Count=?,equ2Count=?,equ1Count=?,busCount=?,rapidtestvehicleCount=?,motorCount=?,cameraCount=?,\r\n" + 
				"				videoCount=?,copycatNum=?,computerNum=?,notepadNum=?,serverCount=?,pbxCount=?,faxCount=?,\r\n" + 
				"						ohpCount=?,VRCOUNT=? where orgId = ?";
		List<Object> params = new ArrayList<Object>();
		System.out.println("orgId::"+id);
		params.add(info.getOrgName());
		params.add(info.getOnworkerNum());
		params.add(info.getSupervisorNum());
		params.add(info.getZbbNum());
		params.add(info.getIfPublicmanage());
		params.add(info.getRetireNum());
		params.add(info.getOfficeBuildarea());
		params.add(info.getBuildingOwnership());
		params.add(info.getOfficeBuildingarea());
		params.add(info.getBusinessDivCount());
		params.add(info.getFunDivCount());
		params.add(info.getOrgCount());
		params.add(info.getEqu3Count());
		params.add(info.getEqu2Count());
		params.add(info.getEqu1Count());
		params.add(info.getBusCount());
		params.add(info.getRapidtestvehicleCount());
		params.add(info.getMotorCount());
		params.add(info.getCameraCount());
		params.add(info.getVideoCount());
		params.add(info.getCopycatNum());
		params.add(info.getComputerNum());
		params.add(info.getNotepadNum());
		params.add(info.getServerCount());
		params.add(info.getPbxCount());
		params.add(info.getFaxCount());
		params.add(info.getOhpCount());
		params.add(info.getVRCOUNT());
		params.add(id);
		return operUpdate(sql, params,conn);
	}

	@Override
	public List<T_d0_orgattached> getAllinfo() {
		String sql = "select * from t_d0_orgattached";
		List<T_d0_orgattached> list = null;
		try {
			list = operQuery(sql,null,T_d0_orgattached.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

	
}
