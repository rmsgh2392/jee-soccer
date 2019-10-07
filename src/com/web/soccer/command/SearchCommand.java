package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.costant.Constant;
import com.web.soccer.serviceImpl.PlayerServiceImpl;

public class SearchCommand extends Command{
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomains(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		this.execute();
	}
	
	@Override
	public void execute() {
//		setPage(request.getParameter("page"));
		request.setAttribute("positions",PlayerServiceImpl.getInstance().findPositions());
		this.view = String.format(Constant.HOME_PATH,domains,"main");
		
	}
}
