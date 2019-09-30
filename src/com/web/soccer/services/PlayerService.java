package com.web.soccer.services;

import java.util.List;

import com.web.soccer.domains.PlayerBean;

public interface PlayerService {
//	1.로그인
	public PlayerBean login(PlayerBean param);
//	 SQL_TEST_002
//	 포지션 종류(중복제거,없으면 빈공간)
	public List<String> findPositions();
//	SQL TEST 04
//	수원팀(ID:K02) 골키퍼
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param); 
//	SQL TEST 05
//	수원팀(ID: K02)키가 170 이상 선수
//	 이면서 성이 고씨인 선수 ,팀아이디 ,키 , 플레이어네임
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param);
	
}
