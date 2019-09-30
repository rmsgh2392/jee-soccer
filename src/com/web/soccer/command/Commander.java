package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.enums.Action;
public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		System.out.println("3.commander command direct 들어옴");
		System.out.println(String.format("%s,%s,%s,%s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		Command cmd = null;

			switch (Action.valueOf(request.getParameter("action")//나누어주어서 어디서 nullpoint가 발생했는지 찾아주기 쉽다.
					.toUpperCase())) {
			case MOVE : cmd = new MoveCommand(request);
//			리퀘스트와 명령어가 life style이 같고 유지해야된다.
				break;
			case SEARCH :cmd = new SearchCommand();
				break;
			case LOGIN : cmd = new LoginCommand(request); break;
			}

		return cmd;
	
	
	}
}