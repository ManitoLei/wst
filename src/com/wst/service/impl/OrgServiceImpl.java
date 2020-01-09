package com.wst.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wst.dao.OrganizationDao;
import com.wst.dao.OrgattachedDao;
import com.wst.dao.SequenceDao;
import com.wst.dao.impl.BaseDao;
import com.wst.dao.impl.OrganizationDaoImpl;
import com.wst.dao.impl.OrgattachedDaoImpl;
import com.wst.dao.impl.SequenceDaoImpl;
import com.wst.service.OrgService;
import com.wst.vo.QueryEntity;
import com.wst.vo.String_;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;

public class OrgServiceImpl implements OrgService{

	OrganizationDao organizationDao = new OrganizationDaoImpl();
	OrgattachedDao orgattachedDao = new OrgattachedDaoImpl();
	SequenceDao sequenceDao = new SequenceDaoImpl();
	
	
	//��������
	@Override
	public boolean institution_create(T_d0_organization org0, T_d0_orgattached org1) throws SQLException {
		//��ӻ�����Ϣ
		//�������
		BaseDao baseDao = new BaseDao();
		
		//int i=1234567891;
		
		Connection conn = baseDao.getConn();
		try {
			conn.setAutoCommit(false);	//���õ����ύΪfalse :��������
			//����orgNo= ��������9+   ��ˮ3(suqence ����orgseq�Զ�����)
			long num = sequenceDao.getNextValbyName("orgseq");
			String str = String.format("%03d", num);   
			String orgNo = org0.getAreaCode()+str;
			System.out.println("orgNo::"+orgNo);
			org0.setOrgNo(orgNo);
			org1.setOrgNo(orgNo);
			int orgId = sequenceDao.getOrgidfromOrgbylastInsert();
			System.out.println("orgId::"+orgId);
			org1.setOrgId(orgId);
			organizationDao.addOrg(org0,conn);
			orgattachedDao.addOrg(org1, conn);
			conn.commit();	//�����ύ
		} catch (SQLException e) {
			
			e.printStackTrace();
			conn.rollback();		//�ع�
		} finally {
			conn.close();
		}
	
		
		return false;
	}


	@Override
	public List<T_d0_organization> institution_list(int page, int size) {
		return organizationDao.getLimited(page, size);
	}


	@Override
	public List<T_d0_organization> query_institution_list(QueryEntity qentity, int page, int size) {
		return organizationDao.getByConditions(qentity, page, size);
	}


	@Override
	public List<T_d0_organization> getAllOrgName() {
		return organizationDao.getAllOrg();
	}


	@Override
	public T_d0_organization getOrgbyId(int id) {
		return organizationDao.getOrgbyId(id);
	}


	@Override
	public Map<String, Object> getOrgandInfobyId(int id) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("org", organizationDao.getOrgbyId(id));
		map.put("info", orgattachedDao.getOrgbyorgId(id));
		return map;
	}


	@Override
	public boolean institution_update(int id,T_d0_organization org0, T_d0_orgattached org1) throws SQLException {
		//��ӻ�����Ϣ
				//�������
				BaseDao baseDao = new BaseDao();				
				Connection conn = baseDao.getConn();
				try {
					conn.setAutoCommit(false);	//���õ����ύΪfalse :��������
					organizationDao.updateOrgbyId(id, org0, conn);
					orgattachedDao.updateInfobyorgId(id, org1, conn);
					conn.commit();	//�����ύ
				} catch (SQLException e) {
					
					e.printStackTrace();
					conn.rollback();		//�ع�
				} finally {
					conn.close();
				}
			
				
				return true;
	}


	@Override
	public List<String_> getAllexeType() {
		return organizationDao.getAllexeType();
	}

}
