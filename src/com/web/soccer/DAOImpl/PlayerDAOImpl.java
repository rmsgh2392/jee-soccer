package com.web.soccer.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.soccer.DAO.PlayerDAO;
import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.enums.DB;
import com.web.soccer.factory.DateBaseFactory;

public  class PlayerDAOImpl implements PlayerDAO{
	private static PlayerDAOImpl instance  = new PlayerDAOImpl();
	public static PlayerDAOImpl getInstance() {
		return instance;
	}
	private PlayerDAOImpl() {}
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		PlayerBean player = new PlayerBean();
		System.out.println("***7.playerDaoImpl의 login 들어옴");
		System.out.println(String.format("param값 출력 :%s,%s"
				,param.getPlayerId()
				,param.getSolar()));
		String sql = "SELECT * \n" + 
				"FROM PLAYER\r\n" + 
				"WHERE PLAYER_ID LIKE ?\n" + 
				"    AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt = DateBaseFactory
					.createDataBase(String.valueOf(DB.ORACLE))
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1,param.getPlayerId());
			stmt.setString(2,param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_No"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYear(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickName(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("9.반환된 결과 값은 : \n"+player.toString());
		return player;
	}
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		String sql = "SELECT DISTINCT POSITION\r\n" + 
				"FROM PLAYER";
		try {
			PreparedStatement stmt = DateBaseFactory
					.createDataBase(String.valueOf(DB.ORACLE))
					.getConnection()
					.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return positions;
	}
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = new ArrayList<>();
		return players;
	}
	@Override
	public List<PlayerBean> selectByTeamIdHeightPosition() {
		List<PlayerBean> players = new ArrayList<>();
		return players;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> players =  new ArrayList<>();
		String sql = "";
		try {
			PreparedStatement pstmt = DateBaseFactory
					.createDataBase(String.valueOf(DB.ORACLE))
					.getConnection()
					.prepareStatement(sql);
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return players;
	}
	@Override
	public List<PlayerBean> selectByBackNo(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		String sql = "? ? ? ?";
		try {
			PreparedStatement pstmt = DateBaseFactory
					.createDataBase(String.valueOf(DB.ORACLE))
					.getConnection()
					.prepareStatement(sql);
			pstmt.setString(1,param.getBackNo());
			pstmt.setString(2,param.getBirthDate());
			pstmt.setString(3,param.getEPlayerName());
			pstmt.setString(4,param.getJoinYear());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public boolean insertPlayer(PlayerBean param) {
		boolean result = false;
		String sql = "INSERT INTO PLAYER (PLAYER_ID,SOLAR,TEAM_ID,PLAYER_NAME) \n" + 
				"VALUES(?, ?,'K03','박근호')";
		try {
			PreparedStatement pstmt = DateBaseFactory.createDataBase(String.valueOf(DB.ORACLE))
										.getConnection()
											.prepareStatement(sql);
			pstmt.setString(1,param.getPlayerId());
			pstmt.setString(2,param.getSolar());
			int rs  = pstmt.executeUpdate();
			result = (rs == 1);//삼항연산자는 불린 타입에서는 삭제가능 --<
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}