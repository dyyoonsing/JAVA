package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {
	
	public static void main(String[] args) {
		
		//1단계 : jdbc 드라이버 로딩 - class file이 없을수도 있으니까 checked exception함
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			//2단계 : connection
			//내 컴퓨터에 접속하는 경우 localhost라고 하면 됨 -- 오라클이 내 컴터에 있었다면 jdbc:oracle:thin:@localhost:1521/dink
			//포트는 1521
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.88.120:1521/dink","DA19","DAYOUNG");
			
			System.out.println("db 접속 성공 : " + conn);
		
		} catch (Exception e) {
			e.printStackTrace();
		}		 
	}
}
