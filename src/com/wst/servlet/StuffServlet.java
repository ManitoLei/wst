package com.wst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.wst.service.StuffService;
import com.wst.service.impl.StuffServiceImpl;
import com.wst.vo.T_d0_fund;
import com.wst.vo.T_d0_organization;
import com.wst.vo.T_d0_stuff;

public class StuffServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public StuffServlet() {
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
		String type = request.getParameter("type");
		StuffService stuffService = new StuffServiceImpl();
		switch (type) {
		case "create":
			String sectionId = request.getParameter("sectionId"); 
			String repManName = request.getParameter("repManName"); 
			String gender = request.getParameter("gender"); 
			String birthDate = request.getParameter("birthDate"); 
			String folk = request.getParameter("folk"); 
			String pol = request.getParameter("pol"); 
			String mobile = request.getParameter("mobile"); 
			String workTel = request.getParameter("workTel"); 
			String email = request.getParameter("email"); 
			String edu = request.getParameter("edu"); 
			String graCollege = request.getParameter("graCollege"); 
			String choiceSpe = request.getParameter("choiceSpe"); 
			String spe = request.getParameter("spe"); 
			String beforeSpe = request.getParameter("beforeSpe"); 
			String beginWorkDate = request.getParameter("beginWorkDate"); 
			String manageJob = request.getParameter("manageJob"); 
			String jobLevel = request.getParameter("jobLevel"); 
			String title = request.getParameter("title");
			String getInDate = request.getParameter("getInDate");
			String perPro = request.getParameter("perPro");
			String perType = request.getParameter("perType");
			String enfCardNo = request.getParameter("enfCardNo");
			String getCardDate = request.getParameter("getCardDate");
			String healthCardNo = request.getParameter("healthCardNo");
			String getQuaDate = request.getParameter("getQuaDate");
			String perCode = request.getParameter("perCode");
			String cardDay = request.getParameter("cardDay");
			String ifStaffPer = request.getParameter("ifStaffPer");
			T_d0_stuff stuff = new T_d0_stuff();
			stuff.setSectionId(sectionId);stuff.setRepManName(repManName);stuff.setGender(gender);
			stuff.setFolk(folk);stuff.setPol(pol);stuff.setMobile(mobile);
			stuff.setWorkTel(workTel);stuff.setEmail(email);stuff.setEdu(edu);
			stuff.setGraCollege(graCollege);stuff.setChoiceSpe(choiceSpe);
			stuff.setSpe(spe);stuff.setBeforeSpe(beforeSpe);stuff.setManageJob(manageJob);
			stuff.setJobLevel(jobLevel);stuff.setTitle(title);stuff.setPerPro(perPro);
			stuff.setPerType(perType);stuff.setEnfCardNo(enfCardNo);
			stuff.setHealthCardNo(healthCardNo);stuff.setPerCode(perCode);
			stuff.setIfStaffPer(ifStaffPer);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				stuff.setBirthDate(birthDate==""?null:sdf.parse(birthDate));
				stuff.setBeginWorkDate(beginWorkDate==""?null:sdf.parse(beginWorkDate));
				stuff.setGetInDate(getInDate==""?null:sdf.parse(getInDate));
				stuff.setGetCardDate(getCardDate==""?null:sdf.parse(getCardDate));
				stuff.setGetQuaDate(getQuaDate==""?null:sdf.parse(getQuaDate));
				stuff.setCardDay(cardDay==""?null:sdf.parse(cardDay));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stuffService.stuff_create(stuff);
			response.sendRedirect("stufflist?type=list&page=1");	
			break;
		case "list":
			String page = request.getParameter("page");
			List<T_d0_stuff> list1 = stuffService.stuff_list(page==null?1:Integer.parseInt(page), 3);
			request.setAttribute("data", list1);
			request.getRequestDispatcher("/jsp/member-list.jsp").forward(request, response);
			break;
		case "list1":
			String pagepage = request.getParameter("page");
			List<T_d0_stuff> listlist = stuffService.stuff_list(pagepage==null?1:Integer.parseInt(pagepage), 3);
			out.print(new Gson().toJson(listlist));
			break;
		case "query":
			int id = Integer.parseInt(request.getParameter("id"));
			T_d0_stuff stuff1 = stuffService.getStuffbyId(id);
			request.setAttribute("stuff", stuff1);
			request.getRequestDispatcher("jsp/member-view.jsp").forward(request, response);
			break;
		case "edit":
			int id1 = Integer.parseInt(request.getParameter("id"));
			T_d0_stuff stuff2 = stuffService.getStuffbyId(id1);
			request.setAttribute("stuff", stuff2);
			request.getRequestDispatcher("jsp/member-edit.jsp").forward(request, response);
			break;
		case "update":
			int id2 = Integer.parseInt(request.getParameter("id"));
			String sectionId2 = request.getParameter("sectionId"); 
			String repManName2 = request.getParameter("repManName"); 
			String gender2 = request.getParameter("gender"); 
			String birthDate2 = request.getParameter("birthDate"); 
			String folk2 = request.getParameter("folk"); 
			String pol2 = request.getParameter("pol"); 
			String mobile2 = request.getParameter("mobile"); 
			String workTel2 = request.getParameter("workTel"); 
			String email2 = request.getParameter("email"); 
			String edu2 = request.getParameter("edu"); 
			String graCollege2 = request.getParameter("graCollege"); 
			String choiceSpe2 = request.getParameter("choiceSpe"); 
			String spe2 = request.getParameter("spe"); 
			String beforeSpe2 = request.getParameter("beforeSpe"); 
			String beginWorkDate2 = request.getParameter("beginWorkDate"); 
			String manageJob2 = request.getParameter("manageJob"); 
			String jobLevel2 = request.getParameter("jobLevel"); 
			String title2 = request.getParameter("title");
			String getInDate2 = request.getParameter("getInDate");
			String perPro2 = request.getParameter("perPro");
			String perType2 = request.getParameter("perType");
			String enfCardNo2 = request.getParameter("enfCardNo");
			String getCardDate2 = request.getParameter("getCardDate");
			String healthCardNo2 = request.getParameter("healthCardNo");
			String getQuaDate2 = request.getParameter("getQuaDate");
			String perCode2 = request.getParameter("perCode");
			String cardDay2 = request.getParameter("cardDay");
			String ifStaffPer2 = request.getParameter("ifStaffPer");
			T_d0_stuff stuff3 = new T_d0_stuff();
			stuff3.setSectionId(sectionId2);stuff3.setRepManName(repManName2);stuff3.setGender(gender2);
			stuff3.setFolk(folk2);stuff3.setPol(pol2);stuff3.setMobile(mobile2);
			stuff3.setWorkTel(workTel2);stuff3.setEmail(email2);stuff3.setEdu(edu2);
			stuff3.setGraCollege(graCollege2);stuff3.setChoiceSpe(choiceSpe2);
			stuff3.setSpe(spe2);stuff3.setBeforeSpe(beforeSpe2);stuff3.setManageJob(manageJob2);
			stuff3.setJobLevel(jobLevel2);stuff3.setTitle(title2);stuff3.setPerPro(perPro2);
			stuff3.setPerType(perType2);stuff3.setEnfCardNo(enfCardNo2);
			stuff3.setHealthCardNo(healthCardNo2);stuff3.setPerCode(perCode2);
			stuff3.setIfStaffPer(ifStaffPer2);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				stuff3.setBirthDate(birthDate2==""?null:sdf2.parse(birthDate2));
				stuff3.setBeginWorkDate(beginWorkDate2==""?null:sdf2.parse(beginWorkDate2));
				stuff3.setGetInDate(getInDate2==""?null:sdf2.parse(getInDate2));
				stuff3.setGetCardDate(getCardDate2==""?null:sdf2.parse(getCardDate2));
				stuff3.setGetQuaDate(getQuaDate2==""?null:sdf2.parse(getQuaDate2));
				stuff3.setCardDay(cardDay2==""?null:sdf2.parse(cardDay2));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stuffService.stuff_update(id2, stuff3);
			response.sendRedirect("stuffservlet?type=list&page=1");	
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
