package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.serviceImpl.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request){
		System.out.println("5.로그인커맨드 들어옴");
		System.out.println(String.format("%s,%s,%s,%s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		setRequest(request);
		setDomains(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		exeucute();
	}
	@Override
	public void exeucute() {
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		PlayerBean player = new PlayerBean();
		player.setPlayerId(playerId);
		player.setSolar(solar);
		player = PlayerServiceImpl.getInstance().login(player);
		System.out.println("10.DB에서 로그인 커맨드로 전달된 로그인 객체는 : \n"+player.toString());
		if(player.getPlayerId() != null) {
			setPage(request.getParameter("page"));
		}else {
			setPage("fail");
		}
		super.exeucute();
	}
}
