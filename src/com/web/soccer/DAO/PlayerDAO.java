package com.web.soccer.DAO;

import java.util.List;

import com.web.soccer.domains.PlayerBean;

public interface PlayerDAO {	
//	    SQL_TEST_002
//	 	포지션 종류(중복제거,없으면 빈공간)
	public PlayerBean selectByPlayerIdSolar(PlayerBean param);
	public List<String> selectPositions();
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param);
	public List<PlayerBean> selectByTeamIdHeightPosition();
	//테스트
	public List<PlayerBean> selectByMany(PlayerBean param);
	public List<PlayerBean> selectByBackNo(PlayerBean param);
	
}
