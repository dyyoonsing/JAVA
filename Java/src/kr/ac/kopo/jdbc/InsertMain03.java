package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain03 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user = "DA19";
			String password = "DAYOUNG";
			
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계 : sql 작성(prepared statement)
			System.out.print("등록할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?, ?)";			//객체 만든 다음에 메꾸기	
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);					//문자열은 ''가 필요하니까 대신 넣어줘!, sql에는 1번 index부터!!(0아님!!)
			pstmt.setString(2, name);
			
			//4단계 : sql 실행 및 결과도출
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행 삽입...");
			
				   
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//5단계 close
			if(pstmt!=null) {
				try {
					pstmt.close();
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
