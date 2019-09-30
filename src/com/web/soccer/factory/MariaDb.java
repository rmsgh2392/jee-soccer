package com.web.soccer.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.web.soccer.costant.Constant;
import com.web.soccer.enums.DBDriver;
import com.web.soccer.enums.DBUrl;

public class MariaDb implements DataBase{
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.MARIA_DRIVER.toString());//여기서 부터 오라클 영역이다 라는 것을 의미 
			conn = DriverManager.getConnection(DBUrl.MARIA_URL.toString(),Constant.USERNAME,Constant.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
