package com.wst.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		//System.out.println(req.getRequestURI());
		String URI = req.getRequestURI();
		URI = URI.toLowerCase();
		if (URI.endsWith("userservlet") || URI.indexOf("login.jsp")>=0 || URI.endsWith(".js") || URI.endsWith(".css") || URI.endsWith(".gif") || URI.endsWith(".jpg") || URI.endsWith("user")) {
			chain.doFilter(request, response);
		}else {
			if(req.getSession().getAttribute("username")!=null) {
				chain.doFilter(request, response);
			}else {
				res.sendRedirect("login.jsp");
			}
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
