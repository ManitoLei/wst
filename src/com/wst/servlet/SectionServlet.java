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
import com.wst.service.OrgService;
import com.wst.service.SectionService;
import com.wst.service.impl.OrgServiceImpl;
import com.wst.service.impl.SectionServiceImpl;
import com.wst.vo.OrgandSec;
import com.wst.vo.QueryEntity;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_section;

public class SectionServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public SectionServlet() {
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
		OrgService orgService = new OrgServiceImpl();
		SectionService sectionService = new SectionServiceImpl();
		
		String type = request.getParameter("type");
		switch(type) {
		case "create":
			int ORGNAME = Integer.parseInt(request.getParameter("ORGNAME"));
			String divName = request.getParameter("divName");
			System.out.println("divName::"+divName);
			String ifSub = request.getParameter("ifSub");
			String dutyTel = request.getParameter("dutyTel");
			String fax = request.getParameter("fax");
			String divRoomNo = request.getParameter("divRoomNo");
			T_d0_section t_d0_section = new T_d0_section();
			t_d0_section.setDivName(divName);
			t_d0_section.setIfSub(ifSub);
			t_d0_section.setDutyTel(dutyTel);
			t_d0_section.setFax(fax);
			t_d0_section.setDivRoomNo(divRoomNo);
			T_d0_organization t_d0_organization = new T_d0_organization();
			t_d0_organization = orgService.getOrgbyId(ORGNAME);
			t_d0_section.setOrgId(ORGNAME);
			t_d0_section.setOrgNo(t_d0_organization.getOrgNo());
			sectionService.addSection(t_d0_section);
			break;
		case "list":
			String page = request.getParameter("page");
			System.out.println("page::"+page);
			List<T_d0_section> list = sectionService.section_list(page==null?1:Integer.parseInt(page), 3);
			List<T_d0_organization> list_  = new ArrayList<T_d0_organization>(list.size());
			for (int i = 0; i < list.size(); i++) {
				list_.add(orgService.getOrgbyId(list.get(i).getOrgId()));
			}
			List<OrgandSec> list__ = new ArrayList<OrgandSec>(list.size());
			for (int i = 0; i < list.size(); i++) {
				list__.add(new OrgandSec(list_.get(i),list.get(i)));
			}
			System.out.println("list.size()"+list.size());
			System.out.println(request.getAttribute("data"));
			out.print(new Gson().toJson(list__));
			break;
		case "list1":
			String page2 = request.getParameter("page");
			System.out.println("page::"+page2);
			List<T_d0_section> list2 = sectionService.section_list(page2==null?1:Integer.parseInt(page2), 3);
			List<T_d0_organization> list2_  = new ArrayList<T_d0_organization>(list2.size());
			for (int i = 0; i < list2.size(); i++) {
				list2_.add(orgService.getOrgbyId(list2.get(i).getOrgId()));
			}
			List<OrgandSec> list2__ = new ArrayList<OrgandSec>(list2.size());
			for (int i = 0; i < list2.size(); i++) {
				list2__.add(new OrgandSec(list2_.get(i),list2.get(i)));
			}
			System.out.println("list.size()"+list2__.size());
			request.removeAttribute("data");
			request.setAttribute("data", list2__);
			request.setAttribute("page", page2==null?1:Integer.parseInt(page2));
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/office-list.jsp").forward(request, response);
			break;
		
		case "query3":
			int id = Integer.parseInt(request.getParameter("ORGNAME"));
			System.out.println("id::"+id);
			String secname = request.getParameter("secname");
			System.out.println("secname::"+secname);
			String page1 = request.getParameter("page");
			List<T_d0_section> list3 = sectionService.query_section_list(id,secname,page1==null?1:Integer.parseInt(page1), 3);
			for (int i = 0; i < list3.size(); i++) {
				System.out.println("query::"+list3.get(i).toString());
			}
			List<T_d0_organization> list3_  = new ArrayList<T_d0_organization>(list3.size());
			for (int i = 0; i < list3.size(); i++) {
				list3_.add(orgService.getOrgbyId(list3.get(i).getOrgId()));
			}
			List<OrgandSec> list3__ = new ArrayList<OrgandSec>(list3.size());
			System.out.println();
			for (int i = 0; i < list3.size(); i++) {
				list3__.add(new OrgandSec(list3_.get(i),list3.get(i)));
			}
			list3__.add(new OrgandSec());
			
			out.print(new Gson().toJson(list3__));
			break;
		case "query":
			int id4 = Integer.parseInt(request.getParameter("ORGNAME"));
			System.out.println("id::"+id4);
			String secname4 = request.getParameter("secname");
			System.out.println("secname::"+secname4);
			String page4 = request.getParameter("page");
			List<T_d0_section> list4 = sectionService.query_section_list(id4,secname4,page4==null?1:Integer.parseInt(page4), 3);
			for (int i = 0; i < list4.size(); i++) {
				System.out.println("query::"+list4.get(i).toString());
			}
			List<T_d0_organization> list4_  = new ArrayList<T_d0_organization>(list4.size());
			for (int i = 0; i < list4.size(); i++) {
				list4_.add(orgService.getOrgbyId(list4.get(i).getOrgId()));
			}
			List<OrgandSec> list4__ = new ArrayList<OrgandSec>(list4.size());
			System.out.println();
			for (int i = 0; i < list4.size(); i++) {
				list4__.add(new OrgandSec(list4_.get(i),list4.get(i)));
			}
			//list4__.add(new OrgandSec());
			request.setAttribute("data", list4__);
			request.setAttribute("page", page4==null?1:Integer.parseInt(page4));
			request.getRequestDispatcher("/jsp/office-list.jsp").forward(request, response);
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
