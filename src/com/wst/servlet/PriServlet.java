package com.wst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.wst.service.LeaderService;
import com.wst.service.PriService;
import com.wst.service.impl.LeaderServiceImpl;
import com.wst.service.impl.PriServiceImpl;
import com.wst.vo.Privilege;
import com.wst.vo.T_d0_leader;
import com.wst.vo.T_d0_stuff;

public class PriServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public PriServlet() {
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

		PrintWriter out = response.getWriter();
		PriService priService = new PriServiceImpl();
		String type = request.getParameter("type");
		switch (type) {
		case "list":
			List<Privilege> list = priService.getAllPri();
			request.setAttribute("data", list);
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/staff-entrust2.jsp").forward(request, response);
			break;
		case "list2":
			String page2 = request.getParameter("page");
			System.out.println("page::"+page2);
			List<Privilege> list2 = priService.getLimited(page2==null?1:Integer.parseInt(page2), 3);
			System.out.println("list.size()"+list2.size());
			request.removeAttribute("data");
			request.setAttribute("data", list2);
			request.setAttribute("page", page2==null?1:Integer.parseInt(page2));
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/staff-entrust.jsp").forward(request, response);
			break;
		case "list3":
			String page3 = request.getParameter("page");
			System.out.println("page::"+page3);
			List<Privilege> list3 = priService.getLimited(page3==null?1:Integer.parseInt(page3), 3);
			System.out.println("list.size()"+list3.size());
			//System.out.println(list.get(0));
			//out.print(new Gson().toJson(list));
			out.print(new Gson().toJson(list3));
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		case "create":
			String name = request.getParameter("name");
			String endtime = request.getParameter("endtime");
			String desc = request.getParameter("desc");
			Privilege pri = new Privilege();
			pri.setName(name);pri.setDesc(desc);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				pri.setEndtime(endtime==""?null:sdf.parse(endtime));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			priService.addPri(pri);
			response.sendRedirect("priservlet?type=list2");	
			break;
		case "query":
			int id = Integer.parseInt(request.getParameter("id"));
			Privilege pri1 = priService.getPribyId(id);
			request.setAttribute("pri", pri1);
			request.getRequestDispatcher("jsp/staff-entrust-view.jsp").forward(request, response);
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
