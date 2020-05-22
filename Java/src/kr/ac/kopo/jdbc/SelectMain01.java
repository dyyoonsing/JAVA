package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection(); 	//1회성 객체
			
			String sql = "select * from t_test ";
			
			pstmt = conn.prepareStatement(sql);
						
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				System.out.println("#");	//몇개 행인지 확인하기 위함
				String id = rs.getString("ID");
				String name = rs.getString(2);
				
				System.out.println("id : " + id + "  \tname : " + name);
			}
			
			
			
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
