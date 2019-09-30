package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.soccer.costant.Constant;

public class Sender {
	
	public static void forward(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			System.out.println("11.sender들어옴");
			System.out.println(String.format("%s,%s,%s,%s"
					,request.getParameter("playerId")
					,request.getParameter("solar")
					,request.getParameter("action")
					,request.getParameter("page")));
			System.out.println("도착지::" + Receiver.cmd.getView());
//			도착지는 커맨드가 가지고 있다 --> 리시버가 아니라
			 request
			.getRequestDispatcher(Receiver.cmd.getView())
			.forward(request,response);//보내는거 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void redirect(HttpServletRequest request,HttpServletResponse response) {
		try {
			response
			.sendRedirect("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
