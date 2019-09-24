package com.web.soccer.DAOImpl;

import com.web.soccer.DAO.StadiumDAO;

public class StadiumDaoImpl implements StadiumDAO{
	private static StadiumDaoImpl instance = new StadiumDaoImpl();

	public static StadiumDaoImpl getInstance() {
		return instance;
	}
	
	private StadiumDaoImpl() {}
		
	
}
