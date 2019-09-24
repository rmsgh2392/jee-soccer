package com.web.soccer.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.web.soccer.costant.Constant;

public class MariaDb implements DataBase{
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constant.MARIA_DRIVER);//여기서 부터 오라클 영역이다 라는 것을 의미 
			conn = DriverManager.getConnection(Constant.MARIA_URL,Constant.USERNAME,Constant.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
