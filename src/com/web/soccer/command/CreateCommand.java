package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.domains.PlayerBean;
import com.web.soccer.serviceImpl.PlayerServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request) {
		super.setRequest(request);
		setAction(request.getParameter("action"));
		setDomains(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		super.execute();
		this.execute();
	}
	
	@Override
	public void execute() {
		PlayerBean bean = new PlayerBean();
		bean.setPlayerId(request.getParameter("playerId"));
		bean.setSolar(request.getParameter("solar"));
		 if(PlayerServiceImpl.getInstance().join(bean)) {
			 System.out.println("회원가입 성공");
		 }else {
			 System.out.println("회원가입 실패");
		 }
	}
}
