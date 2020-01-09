package com.wst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.wst.service.UserService;
import com.wst.service.impl.UserServiceImpl;
import com.wst.vo.QueryEntity;
import com.wst.vo.T_d0_organization;
import com.wst.vo.User;

public class UserServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public UserServlet() {
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
		
		String type = request.getParameter("type");
		UserService userService = new UserServiceImpl();
		//login
		switch (type) {
		case "login":
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			int judge = userService.login(username, password);
			if(judge==-1) {
				//ÓÃ»§Ãû´íÎó
				request.setAttribute("namemsg","ÓÃ»§Ãû´íÎó");
				request.setAttribute("name", username);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else if(judge==0){
				//ÃÜÂë´íÎó
				request.setAttribute("pwdmsg","ÃÜÂë´íÎó");
				request.setAttribute("name", username);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else if(judge==1) {
				//³É¹¦µÇÂ¼
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("index.jsp");
			}
			break;
		case "create":
			String username1 = request.getParameter("username");
			String password1 = request.getParameter("password");
			String name = request.getParameter("name");
			String sectionroom = request.getParameter("sectionroom");
			String desc = request.getParameter("desc");
			User user = new User(0,username1,password1,name,sectionroom,desc);
			userService.user_create(user);
			response.sendRedirect("userservlet?type=list1&page=1");	
			break;
		case "list1":
			String page2 = request.getParameter("page");
			System.out.println("page::"+page2);
			List<User> list2 = userService.user_list(page2==null?1:Integer.parseInt(page2), 3);
			System.out.println("list.size()"+list2.size());
			//System.out.println(list.get(0));
			request.removeAttribute("data");
			request.setAttribute("data", list2);
			request.setAttribute("page", page2==null?1:Integer.parseInt(page2));
			System.out.println(request.getAttribute("data"));
			//out.print(new Gson().toJson(list));
			request.getRequestDispatcher("/jsp/userid-list.jsp").forward(request, response);
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		
		case "list":
			String page3 = request.getParameter("page");
			System.out.println("page::"+page3);
			List<User> list3 = userService.user_list(page3==null?1:Integer.parseInt(page3), 3);
			System.out.println("list.size()"+list3.size());
			//System.out.println(list.get(0));
	
			//out.print(new Gson().toJson(list));
			out.print(new Gson().toJson(list3));
			//System.out.println(request.getAttribute("data"));
			//System.out.println("dispat");
			break;
		case "query":
			//String  
		    String name1 = request.getParameter("name");
			String sectionroom1 = request.getParameter("sectionroom");
			List<User> list1 = userService.getUserbyCon(name1, sectionroom1);
			request.setAttribute("data", list1);
//			request.setAttribute("page", page1==null?1:Integer.parseInt(page1));
			request.getRequestDispatcher("/jsp/userid-list.jsp").forward(request, response);
			break;
		case "create1":
			String username2 = request.getParameter("username");
			String password2 = request.getParameter("password");
			String name2 = request.getParameter("name");
			String sectionroom2 = request.getParameter("sectionroom");
			String desc2 = request.getParameter("desc");
			User user2 = new User(0,username2,password2,name2,sectionroom2,desc2);
			userService.user_create(user2);
			response.sendRedirect("userservlet?type=list1&page=1");	
			break;
		case "update":
			String username3 = request.getParameter("username");
			User user3 = userService.queryUser(username3);
			request.setAttribute("user", user3);
			request.getRequestDispatcher("jsp/userid-update.jsp?username="+username3).forward(request, response);
			break;
		case "update1":
			String username4_ = request.getParameter("username_");
			System.out.println("username4_");
			String username4 = request.getParameter("username");
			String password4 = request.getParameter("password");
			String name4 = request.getParameter("name");
			String sectionroom4 = request.getParameter("sectionroom");
			String desc4 = request.getParameter("desc");
			User user4 = new User(0,username4,password4,name4,sectionroom4,desc4);
			userService.updateUserbyId(username4_, user4);
			response.sendRedirect("userservlet?type=list1&page=1");	
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
