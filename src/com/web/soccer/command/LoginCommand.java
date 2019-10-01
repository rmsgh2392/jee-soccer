package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.serviceImpl.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomains(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		this.execute();
		
	}
	@Override
	public void execute() {
		PlayerBean player = new PlayerBean();
		player.setPlayerId(request.getParameter("playerId"));
		player.setSolar(request.getParameter("solar"));
		player = PlayerServiceImpl.getInstance().login(player);
		if(player.getPlayerId()==null) {
			setPage("login");
			this.view = String.format(Constant.HOME_PATH,"facade",page);
		}else {
			setPage(request.getParameter("page"));
			this.view = String.format(Constant.HOME_PATH,domains,page);
		}
	}
}
