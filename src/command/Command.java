package command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.costant.Constant;

import lombok.Data;
//@Data
//public class Command implements Order{
//	protected HttpServletRequest request;
//	protected String domains,action,page,view;
//	public Command() {
//		System.out.println("생성자 진입");
//	}
//	
//	public void execute() {
//		System.out.println("command execute");
//		setDomains();
//		setPage();
//		setView();
//	}
//	public void setDomains() {
//		String path = request.getServletPath();
//		domains = path.replace(".do","").substring(1);
//	}
//	public void setPage() {
//		page = request.getParameter("page");
//	}
//	public void setView() {
//		this.view = String.format(Constant.VIEW_PATH,page);
//	}
//	

//}
