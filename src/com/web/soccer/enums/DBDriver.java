package com.web.soccer.enums;

public enum DBDriver {
	ORACLE_DRIVER,
	MARIA_DRIVER,
	MYSQL_DRIVER,
	H2_DRIVER;
	
	@Override
	public String toString() {
		String driver = "";
		switch (this) {
		case ORACLE_DRIVER :
			driver = "oracle.jdbc.OracleDriver";
			break;
		case MARIA_DRIVER :
			driver = "org.mariadb.jdbc.Drivers";
			break;
		case H2_DRIVER :
			driver = "org.H2db.jdbc.Drivers";
		case MYSQL_DRIVER :
			break;

		
		}
		
		return driver;
	}
	
}
