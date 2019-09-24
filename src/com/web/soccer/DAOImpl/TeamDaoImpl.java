package com.web.soccer.DAOImpl;

import com.web.soccer.DAO.TeamDAO;

public class TeamDaoImpl implements TeamDAO{
	private static TeamDaoImpl instance =  new TeamDaoImpl();

	public static TeamDaoImpl getInstance() {
		return instance;
	}
		public TeamDaoImpl() {}
			
		
}
