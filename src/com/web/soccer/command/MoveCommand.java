package com.web.soccer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MoveCommand extends Command{//jsp에서 처음 정해준 page로 무조건 가게 한다. 정한대로가 
	public MoveCommand(HttpServletRequest request){
		System.out.println("4.무브커맨드 들어옴");
		System.out.println(String.format("%s,%s,%s,%s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		setRequest(request);
		setDomains(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		System.out.println("도메인"+domains);
		setAction(request.getParameter("action"));
		execute();
		//도메인하고 리퀘스트랑 액션값은 바뀌지 않으니까 써주고 setpage는 언제 바뀔지 모르니 해주지 않는다.
       // 무슨 커맨드를 하던간에 매번 새로운 값이 들어오기 때문에 각 커맨드마다 command에 상속을 받고 생성자에 초기화를 해준다.
		
	}//init 끝나는 시점
	@Override
	public void execute() {
		
		setPage(request.getParameter("page"));
		super.execute();
	
	}
}
