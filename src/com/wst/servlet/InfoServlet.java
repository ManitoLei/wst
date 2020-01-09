package com.wst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.wst.service.InfoService;
import com.wst.service.OrgService;
import com.wst.service.impl.InfoServiceImpl;
import com.wst.service.impl.OrgServiceImpl;
import com.wst.vo.OrgandInfo;
import com.wst.vo.OrgandSec;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_orgattached;
import com.wst.vo.T_d0_section;

public class InfoServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public InfoServlet() {
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

	doPost(request, response);
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

		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		InfoService infoService = new InfoServiceImpl();
		OrgService orgService = new OrgServiceImpl();
		String type = request.getParameter("type");
		switch (type) {
		case "list":
			List<T_d0_orgattached> list1 = infoService.getAllinfo();
			request.setAttribute("data", list1);
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/institution-equipmentInfo.jsp").forward(request, response);
			break;
		case "ready":
			List<T_d0_organization> list2 = orgService.getAllOrgName();
			out.print(new Gson().toJson(list2));
			break;
		case "query":
			int id = Integer.parseInt(request.getParameter("orgname"));
			T_d0_orgattached gatt = infoService.getInfobyOrgid(id);
			//System.out.println("list2.size::"+list2.size());
			//out.print(new Gson().toJson(list2));
			List<T_d0_orgattached> list3 = new ArrayList<T_d0_orgattached>();
			list3.add(gatt);
			request.setAttribute("data", list3);
			request.getRequestDispatcher("/jsp/institution-equipmentInfo.jsp").forward(request, response);
			break;
		case "oversightbodylist":
			List<T_d0_organization> list = orgService.getAllOrgName();
			List<T_d0_orgattached> list_  = new ArrayList<T_d0_orgattached>(list.size());
			for (int i = 0; i < list.size(); i++) {
				list_.add(infoService.getInfobyOrgid(list.get(i).getId()));
			}
			List<OrgandInfo> list__ = new ArrayList<OrgandInfo>(list.size());
			for (int i = 0; i < list.size(); i++) {
				list__.add(new OrgandInfo(list.get(i),list_.get(i)));
			}
			System.out.println("list.size()"+list.size());
			out.print(new Gson().toJson(list__));
			break;
		case "oversightbodylist1":
			List<T_d0_organization> list4 = orgService.getAllOrgName();
			List<T_d0_orgattached> list4_  = new ArrayList<T_d0_orgattached>(list4.size());
			for (int i = 0; i < list4.size(); i++) {
				list4_.add(infoService.getInfobyOrgid(list4.get(i).getId()));
			}
			List<OrgandInfo> list4__ = new ArrayList<OrgandInfo>(list4.size());
			for (int i = 0; i < list4.size(); i++) {
				list4__.add(new OrgandInfo(list4.get(i),list4_.get(i)));
			}
			request.setAttribute("data", list4__);
			request.getRequestDispatcher("/jsp/institution-oversightBodies.jsp").forward(request, response);
			
			break;
		case "query1":
			
			int id_ = Integer.parseInt(request.getParameter("orgname"));
			
			T_d0_organization orgorg = orgService.getOrgbyId(id_);
			T_d0_orgattached infoinfo  = infoService.getInfobyOrgid(orgorg.getId());
			List<OrgandInfo> list5__ = new ArrayList<OrgandInfo>();
			list5__.add(new OrgandInfo(orgorg,infoinfo));
			request.setAttribute("data", list5__);
			request.getRequestDispatcher("/jsp/institution-oversightBodies.jsp").forward(request, response);
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
