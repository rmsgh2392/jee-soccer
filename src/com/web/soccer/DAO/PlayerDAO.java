package com.web.soccer.DAO;

import java.util.List;

import com.web.soccer.domains.PlayerBean;

public interface PlayerDAO {	
//	    SQL_TEST_002
//	 	포지션 종류(중복제거,없으면 빈공간)
	public List<String> selectPositions();
	public List<PlayerBean> selectByTeamIdPosition();
	public List<PlayerBean> selectByteamIdHeightPosition();
}
