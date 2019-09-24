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


import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.serviceImpl.PlayerServiceImpl;
import com.web.soccer.services.PlayerService;

import command.Receiver;
import command.Sender;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		System.out.println("경로는"+page);
		PlayerBean param = null;
		
	
	switch (request.getParameter("action")) {
	case "move":
		System.out.println("action :" +request.getParameter("action"));
		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		break;
	case "find":
//		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		break;
	case "player":
		System.out.println("INDEX JSP에서 controller 들어옴");
		System.out.println("action :"+ request.getParameter("action"));
		param = new PlayerBean();
	    param.setTeamId(request.getParameter("teamId"));
	    param.setPosition(request.getParameter("position"));
//	         서비스 임플과 연결하는 자리 디비랑 연결 !!
	    request.setAttribute("players",PlayerServiceImpl.getInstance().findByTeamIdPosition(param));
		break;
	case "bit1":
		param = new PlayerBean();
		param.setPlayerName(request.getParameter("playerName"));
		param.setHeight(request.getParameter("height"));
		param.setWeight(request.getParameter("weight"));
		request.setAttribute("bit",param);
		break;
		
	case "team":
		System.out.println("action :" +request.getParameter("action"));
		param = new PlayerBean();
		param.setTeamId(request.getParameter("teamId"));
		param.setHeight(request.getParameter("height"));
		param.setPlayerName(request.getParameter("playerName"));
		Object c = PlayerServiceImpl.getInstance().findByTeamIdHeightName(param);
		request.setAttribute("team",c);
		
	}
	request.getRequestDispatcher(String.format(Constant.VIEW_PATH,page))
	.forward(request, response);
		
	}

	

}
