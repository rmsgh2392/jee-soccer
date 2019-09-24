package com.web.soccer.DAOImpl;

import com.web.soccer.DAO.ScheduleDAO;

public class ScheduleDaoImpl implements ScheduleDAO{
	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();

	
	public static ScheduleDaoImpl getInstance() {
		return instance;
	}
	
	private ScheduleDaoImpl() {}
	
	
	
}
		


