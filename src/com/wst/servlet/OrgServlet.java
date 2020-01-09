package com.wst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.wst.service.OrgService;
import com.wst.service.impl.OrgServiceImpl;
import com.wst.vo.QueryEntity;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;

public class OrgServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public OrgServlet() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inininin");
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		OrgService orgService = new OrgServiceImpl();
		String type = request.getParameter("type");
		switch (type) {
		case "create":
			//机构创建
			T_d0_organization d0_organization = new T_d0_organization();
			T_d0_orgattached d0_orgattached = new T_d0_orgattached();
			//String orgNo = request.getParameter("orgNo");
			String orgCode = request.getParameter("orgCode");;
			String orgName = request.getParameter("orgName");;
			String exeType = request.getParameter("exeType");;
			String linkAdd = request.getParameter("linkAdd");
			String ZIPCODE = request.getParameter("ZIPCODE");
			String areaCode = request.getParameter("areaCode");
			String listingDate = request.getParameter("listingDate");
			String standaloneDate = request.getParameter("standaloneDate");
			String areaType = request.getParameter("areaType");
			String orgLevel = request.getParameter("orgLevel");
			String orgPro = request.getParameter("orgPro");
			String zbbdocDate = request.getParameter("zbbdocDate");
			//d0_organization.setOrgNo(orgNo);
			d0_organization.setOrgCode(orgCode);
			d0_organization.setOrgName(orgName);d0_organization.setExeType(exeType);
			d0_organization.setLinkAdd(linkAdd);d0_organization.setZIPCODE(ZIPCODE);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			d0_organization.setAreaCode(areaCode);
			try {
				d0_organization.setListingDate(listingDate==""?null:sdf.parse(listingDate));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				d0_organization.setStandaloneDate(standaloneDate==""?null:sdf.parse(standaloneDate));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			d0_organization.setAreaType(areaType);
			d0_organization.setOrgLevel(orgLevel);d0_organization.setOrgPro(orgPro);
			try {
				d0_organization.setZbbdocDate(zbbdocDate==""?null:sdf.parse(zbbdocDate));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int onworkerNum = Integer.parseInt(request.getParameter("onworkerNum")==""?"0":request.getParameter("onworkerNum"));
			int supervisorNum = Integer.parseInt(request.getParameter("supervisorNum")==""?"0":request.getParameter("supervisorNum"));
			int zbbNum = Integer.parseInt(request.getParameter("zbbNum"));
			String ifPublicmanage = request.getParameter("ifPublicmanage");
			int retireNum = Integer.parseInt(request.getParameter("retireNum"));
			float officeBuildarea = Float.parseFloat(request.getParameter("officeBuildarea"));
			String buildingOwnership = request.getParameter("buildingOwnership");
			float officeBuildingarea = Float.parseFloat(request.getParameter("officeBuildingarea")==""?"0":request.getParameter("officeBuildingarea"));
			int businessDivCount = Integer.parseInt(request.getParameter("businessDivCount"));
			int funDivCount = Integer.parseInt(request.getParameter("funDivCount"));
			int orgCount = Integer.parseInt(request.getParameter("orgCount"));
			int equ3Count = Integer.parseInt(request.getParameter("equ3Count"));
			int equ2Count = Integer.parseInt(request.getParameter("equ2Count"));
			int equ1Count = Integer.parseInt(request.getParameter("equ1Count"));
			int busCount = Integer.parseInt(request.getParameter("busCount"));
			int rapidtestvehicleCount = Integer.parseInt(request.getParameter("rapidtestvehicleCount"));
			int motorCount = Integer.parseInt(request.getParameter("motorCount"));
			int cameraCount = Integer.parseInt(request.getParameter("cameraCount"));
			int videoCount = Integer.parseInt(request.getParameter("videoCount"));
			int copycatNum = Integer.parseInt(request.getParameter("copycatNum"));
			int computerNum = Integer.parseInt(request.getParameter("computerNum"));
			int notepadNum = Integer.parseInt(request.getParameter("notepadNum"));
			int serverCount = Integer.parseInt(request.getParameter("serverCount"));
			int pbxCount = Integer.parseInt(request.getParameter("pbxCount"));
			int faxCount = Integer.parseInt(request.getParameter("faxCount"));
			int ohpCount = Integer.parseInt(request.getParameter("ohpCount"));
			int VRCOUNT = Integer.parseInt(request.getParameter("VRCOUNT"));
			d0_orgattached.setOrgName(orgName);//d0_orgattached.setOrgNo(orgNo);
			d0_orgattached.setOrgCode(orgCode);d0_orgattached.setOnworkerNum(onworkerNum);
			d0_orgattached.setSupervisorNum(supervisorNum);d0_orgattached.setZbbNum(zbbNum);
			d0_orgattached.setIfPublicmanage(ifPublicmanage);d0_orgattached.setRetireNum(retireNum);
			d0_orgattached.setOfficeBuildarea(officeBuildarea);d0_orgattached.setBuildingOwnership(buildingOwnership);
			d0_orgattached.setOfficeBuildingarea(officeBuildingarea);d0_orgattached.setBusinessDivCount(businessDivCount);
			d0_orgattached.setFunDivCount(funDivCount);d0_orgattached.setOrgCount(orgCount);
			d0_orgattached.setEqu3Count(equ3Count);d0_orgattached.setEqu2Count(equ2Count);d0_orgattached.setEqu1Count(equ1Count);
			d0_orgattached.setBusCount(busCount);d0_orgattached.setRapidtestvehicleCount(rapidtestvehicleCount);
			d0_orgattached.setMotorCount(motorCount);d0_orgattached.setCameraCount(cameraCount);
			d0_orgattached.setVideoCount(videoCount);d0_orgattached.setCopycatNum(copycatNum);
			d0_orgattached.setComputerNum(computerNum);d0_orgattached.setNotepadNum(notepadNum);
			d0_orgattached.setServerCount(serverCount);d0_orgattached.setPbxCount(pbxCount);
			d0_orgattached.setFaxCount(faxCount);d0_orgattached.setOhpCount(ohpCount);
			d0_orgattached.setVRCOUNT(VRCOUNT);
			try {
				orgService.institution_create(d0_organization, d0_orgattached);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("orgservlet?type=list1&page=1");	
//			日期：date>String
//
//			Date date = new Date();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			System.out.println(sdf.format(date));
//
//			日期：String>date
//
//			String string ="2016-10-24 21:59:06";
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			System.out.println(sdf.parse(string));
			break;
		case "list":
			String page = request.getParameter("page");
			System.out.println("page::"+page);
			List<T_d0_organization> list = orgService.institution_list(page==null?1:Integer.parseInt(page), 3);
			System.out.println("list.size()"+list.size());
			//System.out.println(list.get(0));
			//request.removeAttribute("data");
			//request.setAttribute("data", list);
			//request.setAttribute("page", page==null?1:Integer.parseInt(page));
			System.out.println(request.getAttribute("data"));
			out.print(new Gson().toJson(list));
			//request.getRequestDispatcher("/jsp/institution-list.jsp").forward(request, response);
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		case "list1":
			String page2 = request.getParameter("page");
			System.out.println("page::"+page2);
			List<T_d0_organization> list2 = orgService.institution_list(page2==null?1:Integer.parseInt(page2), 3);
			System.out.println("list.size()"+list2.size());
			//System.out.println(list.get(0));
			request.removeAttribute("data");
			request.setAttribute("data", list2);
			request.setAttribute("page", page2==null?1:Integer.parseInt(page2));
			System.out.println(request.getAttribute("data"));
			//out.print(new Gson().toJson(list));
			request.getRequestDispatcher("/jsp/institution-list.jsp").forward(request, response);
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		case "query":
			//String  
		    String exeType1 = request.getParameter("exeType");
			String orgName1 = request.getParameter("orgName");
			String linkAdd1 = request.getParameter("linkAdd");
			String orgCode1 = request.getParameter("orgCode");
			String areaCode1 = request.getParameter("areaCode");
			String ZIPCODE1 = request.getParameter("ZIPCODE");
			String orgPro1 = request.getParameter("orgPro");
			QueryEntity queryEntity = new QueryEntity();
			queryEntity.setExeType(exeType1);queryEntity.setOrgName(orgName1);
			queryEntity.setLinkAdd(linkAdd1);queryEntity.setOrgCode(orgCode1);
			queryEntity.setAreaCode(areaCode1);queryEntity.setZIPCODE(ZIPCODE1);
			queryEntity.setOrgPro(orgPro1);
			String page1 = request.getParameter("page");
			List<T_d0_organization> list1 = orgService.query_institution_list(queryEntity, page1==null?1:Integer.parseInt(page1), 3);
			request.setAttribute("data", list1);
			request.setAttribute("page", page1==null?1:Integer.parseInt(page1));
			request.getRequestDispatcher("/jsp/institution-list.jsp").forward(request, response);
			break;
		case "allorgname":
			List<T_d0_organization> data = orgService.getAllOrgName();
			System.out.println("data.size()::"+data.size());
			//for (int i = 0; i < list3.size(); i++) {
				//out.println("<option value="+list3.get(i).getId()+">"+list3.get(i).getOrgName()+"</option>");
			//}
			out.print(new Gson().toJson(data));
			/*
			 * int flag=1; out.print(new Gson().toJson(flag));
			 */
			break;
		case "update":
			int id = Integer.parseInt(request.getParameter("id"));
			Map<String, Object> map = orgService.getOrgandInfobyId(id);
			request.setAttribute("org", map.get("org"));
			request.setAttribute("info", map.get("info"));
			request.getRequestDispatcher("jsp/institution-update.jsp").forward(request, response);
			break;
		case "query2":
			int ididid = Integer.parseInt(request.getParameter("id"));
			Map<String, Object> mapmap = orgService.getOrgandInfobyId(ididid);
			request.setAttribute("org", mapmap.get("org"));
			request.setAttribute("info", mapmap.get("info"));
			request.getRequestDispatcher("jsp/institution-view.jsp").forward(request, response);
			break;
		case "postupdate":
			T_d0_organization d0_organization1 = new T_d0_organization();
			T_d0_orgattached d0_orgattached1 = new T_d0_orgattached();
			//String orgNo = request.getParameter("orgNo");
			int idid = Integer.parseInt(request.getParameter("id"));
			String orgCode2 = request.getParameter("orgCode");;
			String orgName2 = request.getParameter("orgName");;
			String exeType2 = request.getParameter("exeType");;
			String linkAdd2 = request.getParameter("linkAdd");
			String ZIPCODE2 = request.getParameter("ZIPCODE");
			String areaCode2 = request.getParameter("areaCode");
			String listingDate2 = request.getParameter("listingDate");
			String standaloneDate2 = request.getParameter("standaloneDate");
			String areaType2 = request.getParameter("areaType");
			String orgLevel2 = request.getParameter("orgLevel");
			String orgPro2 = request.getParameter("orgPro");
			String zbbdocDate2 = request.getParameter("zbbdocDate");
			//d0_organization.setOrgNo(orgNo);
			d0_organization1.setOrgCode(orgCode2);
			d0_organization1.setOrgName(orgName2);d0_organization1.setExeType(exeType2);
			d0_organization1.setLinkAdd(linkAdd2);d0_organization1.setZIPCODE(ZIPCODE2);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			d0_organization1.setAreaCode(areaCode2);
			try {
				d0_organization1.setListingDate(listingDate2==""?null:sdf1.parse(listingDate2));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				d0_organization1.setStandaloneDate(standaloneDate2==""?null:sdf1.parse(standaloneDate2));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			d0_organization1.setAreaType(areaType2);
			d0_organization1.setOrgLevel(orgLevel2);d0_organization1.setOrgPro(orgPro2);
			try {
				d0_organization1.setZbbdocDate(zbbdocDate2==""?null:sdf1.parse(zbbdocDate2));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int onworkerNum1 = Integer.parseInt(request.getParameter("onworkerNum")==""?"0":request.getParameter("onworkerNum"));
			int supervisorNum1 = Integer.parseInt(request.getParameter("supervisorNum")==""?"0":request.getParameter("supervisorNum"));
			int zbbNum1 = Integer.parseInt(request.getParameter("zbbNum"));
			String ifPublicmanage1 = request.getParameter("ifPublicmanage");
			int retireNum1 = Integer.parseInt(request.getParameter("retireNum"));
			float officeBuildarea1 = Float.parseFloat(request.getParameter("officeBuildarea"));
			String buildingOwnership1 = request.getParameter("buildingOwnership");
			float officeBuildingarea1 = Float.parseFloat(request.getParameter("officeBuildingarea")==""?"0":request.getParameter("officeBuildingarea"));
			int businessDivCount1 = Integer.parseInt(request.getParameter("businessDivCount"));
			int funDivCount1 = Integer.parseInt(request.getParameter("funDivCount"));
			int orgCount1 = Integer.parseInt(request.getParameter("orgCount"));
			int equ3Count1 = Integer.parseInt(request.getParameter("equ3Count"));
			int equ2Count1 = Integer.parseInt(request.getParameter("equ2Count"));
			int equ1Count1 = Integer.parseInt(request.getParameter("equ1Count"));
			int busCount1 = Integer.parseInt(request.getParameter("busCount"));
			int rapidtestvehicleCount1 = Integer.parseInt(request.getParameter("rapidtestvehicleCount"));
			int motorCount1 = Integer.parseInt(request.getParameter("motorCount"));
			int cameraCount1 = Integer.parseInt(request.getParameter("cameraCount"));
			int videoCount1 = Integer.parseInt(request.getParameter("videoCount"));
			int copycatNum1 = Integer.parseInt(request.getParameter("copycatNum"));
			int computerNum1 = Integer.parseInt(request.getParameter("computerNum"));
			int notepadNum1 = Integer.parseInt(request.getParameter("notepadNum"));
			int serverCount1 = Integer.parseInt(request.getParameter("serverCount"));
			int pbxCount1 = Integer.parseInt(request.getParameter("pbxCount"));
			int faxCount1 = Integer.parseInt(request.getParameter("faxCount"));
			int ohpCount1 = Integer.parseInt(request.getParameter("ohpCount"));
			int VRCOUNT1 = Integer.parseInt(request.getParameter("VRCOUNT"));
			d0_orgattached1.setOrgName(orgName2);//d0_orgattached.setOrgNo(orgNo);
			d0_orgattached1.setOrgCode(orgCode2);d0_orgattached1.setOnworkerNum(onworkerNum1);
			d0_orgattached1.setSupervisorNum(supervisorNum1);d0_orgattached1.setZbbNum(zbbNum1);
			d0_orgattached1.setIfPublicmanage(ifPublicmanage1);d0_orgattached1.setRetireNum(retireNum1);
			d0_orgattached1.setOfficeBuildarea(officeBuildarea1);d0_orgattached1.setBuildingOwnership(buildingOwnership1);
			d0_orgattached1.setOfficeBuildingarea(officeBuildingarea1);d0_orgattached1.setBusinessDivCount(businessDivCount1);
			d0_orgattached1.setFunDivCount(funDivCount1);d0_orgattached1.setOrgCount(orgCount1);
			d0_orgattached1.setEqu3Count(equ3Count1);d0_orgattached1.setEqu2Count(equ2Count1);d0_orgattached1.setEqu1Count(equ1Count1);
			d0_orgattached1.setBusCount(busCount1);d0_orgattached1.setRapidtestvehicleCount(rapidtestvehicleCount1);
			d0_orgattached1.setMotorCount(motorCount1);d0_orgattached1.setCameraCount(cameraCount1);
			d0_orgattached1.setVideoCount(videoCount1);d0_orgattached1.setCopycatNum(copycatNum1);
			d0_orgattached1.setComputerNum(computerNum1);d0_orgattached1.setNotepadNum(notepadNum1);
			d0_orgattached1.setServerCount(serverCount1);d0_orgattached1.setPbxCount(pbxCount1);
			d0_orgattached1.setFaxCount(faxCount1);d0_orgattached1.setOhpCount(ohpCount1);
			d0_orgattached1.setVRCOUNT(VRCOUNT1);
			System.out.println("idid::"+idid);
			try {
				System.out.println("boolean::"+orgService.institution_update(idid,d0_organization1 , d0_orgattached1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("orgservlet?type=list1&page=1");	
			break;
		default:
			break;
		}
		
		
		
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
