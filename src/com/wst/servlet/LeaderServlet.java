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
import com.wst.service.impl.LeaderServiceImpl;
import com.wst.vo.Privilege;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_leader;
import com.wst.vo.User;

public class LeaderServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public LeaderServlet() {
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
		LeaderService leaderService = new LeaderServiceImpl();
		String type = request.getParameter("type");
		switch (type) {
		case "list":
			List<T_d0_leader> list = leaderService.leader_list();
			request.setAttribute("data", list);
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/leadership-tatisticsReport.jsp").forward(request, response);
			break;
		case "query":	//¼ìË÷
			int id1 = Integer.parseInt(request.getParameter("orgName"));
			List<T_d0_leader> list1 = leaderService.getLeaderbyCon(id1);
			request.setAttribute("data", list1);
			request.getRequestDispatcher("/jsp/leadership-tatisticsReport.jsp").forward(request, response);
			break;
		case "list2":
			String page2 = request.getParameter("page");
			System.out.println("page::"+page2);
			List<T_d0_leader> list2 = leaderService.leader_list(page2==null?1:Integer.parseInt(page2), 3);
			System.out.println("list.size()"+list2.size());
			request.removeAttribute("data");
			request.setAttribute("data", list2);
			request.setAttribute("page", page2==null?1:Integer.parseInt(page2));
			System.out.println(request.getAttribute("data"));
			request.getRequestDispatcher("/jsp/leadership-list.jsp").forward(request, response);
			break;
		case "list3":
			String page3 = request.getParameter("page");
			System.out.println("page::"+page3);
			List<T_d0_leader> list3 = leaderService.leader_list(page3==null?1:Integer.parseInt(page3), 3);
			System.out.println("list.size()"+list3.size());
			//System.out.println(list.get(0));
			//out.print(new Gson().toJson(list));
			out.print(new Gson().toJson(list3));
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		case "create":
			String formFillingMan = request.getParameter("formFillingMan");
			String linkTel = request.getParameter("linkTel");
			String leaderName = request.getParameter("leaderName");
			String gender = request.getParameter("gender");
			String folk = request.getParameter("folk");
			String birthDate = request.getParameter("birthDate");
			String pol = request.getParameter("pol");
			String edu = request.getParameter("edu");
			String degree = request.getParameter("degree");
			String manageJob = request.getParameter("manageJob");
			String title = request.getParameter("title");
			String memo = request.getParameter("memo");
			String serDate = request.getParameter("serDate");
			String leaveDate = request.getParameter("leaveDate");
			String yearly = request.getParameter("yearly");
			T_d0_leader leader = new T_d0_leader();
			leader.setFormFillingMan(formFillingMan);leader.setLinkTel(linkTel);
			leader.setLeaderName(leaderName);leader.setGender(gender);
			leader.setFolk(folk);leader.setPol(pol);leader.setEdu(edu);
			leader.setDegree(degree);leader.setManageJob(manageJob);
			leader.setTitle(title);leader.setMemo(memo);leader.setYearly(yearly);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				leader.setBirthDate(birthDate==""?null:sdf.parse(birthDate));
				leader.setSerDate(serDate==""?null:sdf.parse(serDate));
				leader.setLeaveDate(leaveDate==""?null:sdf.parse(leaveDate));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			leaderService.leader_create(leader);
			response.sendRedirect("leaderservlet?type=list2&page=1");	
			break;
		case "query2":
			int id = Integer.parseInt(request.getParameter("id"));
			T_d0_leader leader2 = leaderService.getLeaderbyId(id);
			request.setAttribute("leader", leader2);
			request.getRequestDispatcher("jsp/leadership-view.jsp").forward(request, response);
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
