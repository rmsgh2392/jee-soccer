package command;

import javax.servlet.http.HttpServletRequest;

import com.web.soccer.DAO.PlayerDAO;
import com.web.soccer.serviceImpl.PlayerServiceImpl;
import com.web.soccer.services.PlayerService;

//public class SqlCommand extends MoveCommand{
//	public SqlCommand(HttpServletRequest request) {
//		super(request);
//		System.out.println("sqlcommac 진입");
//	}
//	@Override
//	public void execute() {
//		
//		super.execute();
//		System.out.println("애스큐엘 익스큐트 진입");
//		PlayerService sc = new PlayerServiceImpl();
//		request.setAttribute("sql",sc.findPositions().get(1));
//		request.setAttribute("sql",sc.findPositions().get(2));
//		request.setAttribute("sql",sc.findPositions().get(3));
//		request.setAttribute("sql",sc.findPositions().get(4));
//		
//		
//	}
//}
