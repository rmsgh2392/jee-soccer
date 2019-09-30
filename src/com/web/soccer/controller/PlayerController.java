package com.web.soccer.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.soccer.command.Commander;
import com.web.soccer.command.Receiver;
import com.web.soccer.command.Sender;
import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.serviceImpl.PlayerServiceImpl;
import com.web.soccer.services.PlayerService;




@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>>>>>>1.jsp에서 컨트롤러 들어옴");
		System.out.println(String.format("%s,%s,%s,%s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		
		Receiver.init(request);
		System.out.println("dff"+request.getServletPath());
		System.out.println("receiver init() 끝남");
		Sender.forward(request, response);
	}

	

}
