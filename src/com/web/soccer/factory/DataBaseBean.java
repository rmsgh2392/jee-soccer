//package com.web.soccer.factory;
//
//import java.io.Serializable;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import com.web.soccer.DAOImpl.PlayerDAOImpl;
//
//import lombok.Data;
//@Data
//public class DataBaseBean implements Serializable{
//	private static final long serialVersionUID = 1L;
//	private String url,driver,userId,password;
//	private  Connection conn;
//	
//	public  DataBaseBean(String driver,String url,String userId,String password) {
//		this.url = url;
//		this.userId = userId;
//		this.password = password;
//		this.driver = driver;
//		 
//	}
//	
//	public Connection getConnection() {
//		
//		try {
//			Class.forName(driver);//여기서 부터 오라클 영역이다 라는 것을 의미 
//			conn = DriverManager.getConnection(url,userId,password);
//			//먼저 영역을 만듬 (오라클 영역-->  그래야  드라이브 매니저가 산다)
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		return conn;
//	}
//
//	
//	
//}
