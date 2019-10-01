package com.web.soccer.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.web.soccer.DAO.PlayerDAO;
import com.web.soccer.DAOImpl.PlayerDAOImpl;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
		private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
		public static PlayerServiceImpl getInstance() {
			return instance;
		}
		private PlayerServiceImpl() {}
		public void show() {
			System.out.println("싱글톤 하이");
		}
	@Override
	public PlayerBean login(PlayerBean param) {
		System.out.println("***6.playerServiceImpl의 login 들어옴");
		System.out.println(String.format("param값 출력 :%s,%s"
				,param.getPlayerId()
				,param.getSolar()));
		return PlayerDAOImpl.getInstance().selectByPlayerIdSolar(param);
	}
		
	@Override
	public List<String> findPositions() {
		return PlayerDAOImpl.getInstance().selectPositions();
	}
	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDAOImpl.getInstance().selectByTeamIdPosition(param);
		return players;
	}
	@Override
	public  List<PlayerBean> findByTeamIdHeightName(PlayerBean param) {
		System.out.println("컨트롤로에서 서비스로 넘어옴");
//		players = new ArrayList<PlayerBean>();
//		PlayerBean player = new PlayerBean();
//		player.setTeamId(param.getTeamId());
//		player.setHeight(param.getHeight());
//		player.setPlayerName(param.getPlayerName());
//		players.add(player);
//		
//		return players;
		return null;
		}
	@Override
	public boolean join(PlayerBean param) {
		return PlayerDAOImpl.getInstance().insertPlayer(param);
	}
	
	
	
	}


