package com.web.soccer.factory;

import com.web.soccer.costant.Constant;
import com.web.soccer.enums.DB;

public class DateBaseFactory {
	
	public static DataBase createDataBase(String vendor) {
		DataBase database = null;
		
		
		switch (DB.valueOf(vendor.toUpperCase())) {
		case ORACLE:
			System.out.println("오라클 케이스 진입");
			database = new Oracle();
			break;
		case MARIA:
			database = new MariaDb();
			break;
		case MYSQL:
			break;
		case H2 :
			break;
		case DB2 :
			break;
			
		}	
		
		return database;
			
	}
}
