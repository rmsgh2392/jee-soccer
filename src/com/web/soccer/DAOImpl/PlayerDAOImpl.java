package com.web.soccer.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.soccer.DAO.PlayerDAO;
import com.web.soccer.costant.Constant;
import com.web.soccer.domains.PlayerBean;
import com.web.soccer.factory.DateBaseFactory;

public class PlayerDAOImpl implements PlayerDAO{
	private static PlayerDAOImpl instance  = new PlayerDAOImpl();
	public static PlayerDAOImpl getInstance() {
		return instance;
	}
	private PlayerDAOImpl() {}

	
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION\r\n" + 
					"FROM PLAYER";
//			PreparedStatement stmt = DateBaseFactory
//					.createDataBase("oracle",Constant.USERNAME,Constant.PASSWORD)
//					.getConnection().prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
			ResultSet rs = DateBaseFactory.createDataBase(Constant.VENDOR).getConnection().prepareStatement(sql).executeQuery();
			
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return positions;
	
		

    }
	@Override
	public List<PlayerBean> selectByTeamIdPosition() {
			List<PlayerBean> player = new ArrayList<PlayerBean>();
			try {
				String sql = "SELECT *\r\n" + 
						"FROM PLAYER\r\n" + 
						"WHERE TEAM_ID LIKE 'K02'\r\n" + 
						"    AND POSITION LIKE 'GK'";
				PreparedStatement stmt = DateBaseFactory
						.createDataBase("oracle",Constant.USERNAME,Constant.PASSWORD)
						.getConnection()
						.prepareStatement(sql);
				ResultSet result = stmt.executeQuery();
				while(result.next()) {
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	@Override
	public List<PlayerBean> selectByteamIdHeightPosition() {
		
		return null;
	}
}
