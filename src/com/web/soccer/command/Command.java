package com.web.soccer.command;
import javax.servlet.http.HttpServletRequest;
import com.web.soccer.costant.Constant;
import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;//커멘드라는 녀석은 상속받는 구조이기 때문에 protected를 쓴다 
	protected String action,domains,page,view;
	
	@Override
	public void execute() {
		
		System.out.println(String.format("%s,%s,%s,%s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		System.out.println("command execute진입");
		
		this.view = String.format(Constant.HOME_PATH,"facade","main");
	}


	}


