package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain01 {
	
	public static void main(String[] args) {
			
			//new 하는 경우가 없음 - 인스턴스 객체로 만들면 어려우니까? 내부적으로 그 벤더회사들의 클래스들이 내부적으로 움직이면서 알아서 객체를 만들어서 넘기는 것...
			//drivermManager class에서 connection 객체를 얻어오는것 (예시)
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//1단계 : jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //대소문자 주의하기!!!
			System.out.println("1단계 드라이버 로딩...");
			
			//2단계 : drivermanager를 이용한 db 접속, connection 객체 얻기
			String url = "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user = "DA19";
			String password = "DAYOUNG";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2단계 conn : " + conn);
			
			//3단계 : SQL문 작성
			stmt = conn.createStatement();
			

			String sql = "insert into t_test(id, name) values('hong', '홍길동')";
			
			//4단계 : sql문 실행 및 결과 도출 실행 (Statement) execute update - executequery가 메소드 이름이 됨

			int cnt2 = stmt.executeUpdate(sql);
			
			System.out.println("삽입 성 공  " + " 개행 "+cnt2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//5단계 close
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
