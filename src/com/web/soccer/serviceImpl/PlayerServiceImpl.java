package com.web.soccer.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.web.soccer.DAO.PlayerDAO;
import com.web.soccer.DAOImpl.PlayerDAOImpl;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
//	private PlayerDAO dao;
//	private List<PlayerBean> players;
//	public PlayerServiceImpl() {
//		dao = new PlayerDAOImpl();
//		players = new ArrayList<>();
//	}
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {}
		
	
	@Override
	public List<String> findPositions() {
		
		return PlayerDAOImpl.getInstance().selectPositions();
	}
	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDAOImpl.getInstance().selectByTeamIdPosition();
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
	
	
	
	}


