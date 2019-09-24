package com.web.soccer.factory;

import com.web.soccer.costant.Constant;

public class DateBaseFactory {
	
	public static DataBase createDataBase(String vendor) {
		DataBase database = null;
			
		
		switch (vendor) {
		case "oracle":
			System.out.println("오라클 케이스 진입");
			database = new Oracle();
			break;
		case "mariadb":
			database = new MariaDb();
			break;
		case "mysql":
			break;
		case "h2":
			break;
		case "db2":
			break;
			
		}	
		
		return database;
			
	}
}
