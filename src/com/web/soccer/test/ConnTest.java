package com.web.soccer.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##oracle";
		String password = "oracle";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//객체는 무조건 하나 접속할 때 아디와 비번을 줘서!! static객체를 만드는 방법
			conn = DriverManager.getConnection(url,username,password);
			if(conn != null) {
				System.out.println("연결 성공");
				stmt = conn.createStatement();//한장 만들어라
				rs = stmt.executeQuery("SELECT *\r\n" + 
						"FROM (SELECT TEAM_ID ,TEAM_NAME \r\n" + 
						"      FROM TEAM\r\n" + 
						"      WHERE TEAM_ID IN('K07','K09','K08')) T \r\n" + 
						"      JOIN(SELECT *\r\n" + 
						"           FROM PLAYER\r\n" + 
						"           WHERE POSITION IN('GK','MF')) P\r\n" + 
						"        ON T.TEAM_ID LIKE P.TEAM_ID");
				List<String> list = new ArrayList<>();
				
				while(rs.next()) {
					list.add(rs.getString("PLAYER_NAME"));
				}
				System.out.println("팀명 :\n"+list);
				//자바는 메타데이터를 프러펄티로 인식한다.
						
			}else {
				System.out.println("연결 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
