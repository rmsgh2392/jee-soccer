package com.web.soccer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.soccer.command.Receiver;
import com.web.soccer.command.Sender;
import com.web.soccer.costant.Constant;
@WebServlet("/facade.do")
public class FacadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	enum Resources{
		CTX,CSS,JS,IMG
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("facade로 들어옴");
//		HttpSession session = new HttpSession(); <--이렇게 해버리면 리퀘스트가 세션에 담은 정보를 넘어온 정보를 없애버린다.
		for(Resources r : Resources.values()) {
			System.out.println(">>>"+r.toString().toLowerCase());
		  request.getSession().setAttribute(r.toString().toLowerCase(),(r.toString().toLowerCase().equals("ctx")) 
				  	? request.getContextPath() 
				  			: request.getContextPath()+"/resources/"+r.toString().toLowerCase());
		  
		}
		System.out.println(request.getParameter("page"));
		if(request.getParameter("page")==null) {
			request.setAttribute("page","login");
		}else {
			request.setAttribute("page",request.getParameter("page"));
		}
		
	

		
		 request
		 .getRequestDispatcher(String.format(Constant.HOME_PATH,
				 request.getServletPath().substring(1,request.getServletPath().indexOf(".")),"main"))
		 .forward(request, response);
	
		
		
		
	}


//		for(Resources r : Resources.values()) {
//			System.out.println(">>>" +r.toString().toLowerCase());
//			String t = "";
//			if(r.toString().toLowerCase().equals("ctx")) {
//				t = request.getContextPath();
//			} else {
//				t = request.getContextPath()+"/resources/"+r.toString().toLowerCase();
//			}
//			System.out.println("t :" +t);
//		}

}
