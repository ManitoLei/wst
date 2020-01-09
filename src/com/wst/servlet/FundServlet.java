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
import com.wst.service.FundService;
import com.wst.service.OrgService;
import com.wst.service.impl.FundServiceImpl;
import com.wst.service.impl.OrgServiceImpl;
import com.wst.vo.OrgandSec;
import com.wst.vo.String_;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_section;

public class FundServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public FundServlet() {
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
		FundService fundService = new FundServiceImpl();
		OrgService orgService = new OrgServiceImpl();
		PrintWriter out = response.getWriter();
		String type = request.getParameter("type");
		switch (type) {
		case "list1":
			List<T_d0_fund> list1 = fundService.getAllFund();
			request.setAttribute("data", list1);
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/institution-financialReport.jsp").forward(request, response);
			break;
		case "query":
			String exeType = request.getParameter("exeType");
			String yearly = request.getParameter("yearly");
			System.out.println("exeType::"+exeType);
			System.out.println("yearly::"+yearly);
			List<T_d0_fund> list2 = fundService.getFundbyexeTypeandyearly(exeType, yearly);
			System.out.println("list2.size::"+list2.size());
			//out.print(new Gson().toJson(list2));
			request.setAttribute("data", list2);
			request.getRequestDispatcher("/jsp/institution-financialReport.jsp").forward(request, response);
			break;
		case "ready":
			List<String_> list3 = fundService.getAllyearly();
			out.print(new Gson().toJson(list3));
			break;
		case "ready2":
			List<String_> list4 = orgService.getAllexeType();
			System.out.println(list4);
			out.print(new Gson().toJson(list4));
			break;
		case "create":
			int id = Integer.parseInt(request.getParameter("orgid"));
			String orgname = request.getParameter("orgname");
			String orgno = request.getParameter("orgno");
			String orgcode = request.getParameter("orgcode");
			String yearly1 = request.getParameter("yearly");
			float preFund = Float.parseFloat(request.getParameter("preFund"));
			float businessFund = Float.parseFloat(request.getParameter("businessFund"));
			float dutyFund = Float.parseFloat(request.getParameter("dutyFund"));
			float buildFund = Float.parseFloat(request.getParameter("buildFund"));
			T_d0_fund fund = new T_d0_fund(0,id,orgname,orgno,orgcode,yearly1,preFund,businessFund,dutyFund,buildFund);
			fundService.fund_create(fund);
			response.sendRedirect("fundservlet?type=list1&page=1");	
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
