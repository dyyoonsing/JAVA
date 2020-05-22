package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
 *  t_test에서 오름차순 기준 첫번째 
 */
public class SelectMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuffer sb = new StringBuffer();
			sb.append("select id, name ");
			sb.append(" from ( select * ");
			sb.append(" 		from t_test ");
			sb.append("			order by id asc ");
			sb.append(" 	 ) ");
			sb.append(" where rownum = 1 ");
	
			
//			String sql = "select id, name ";
//				   sql += " from ( select * ";
//				   sql += " 		from t_test ";
//				   sql += " 		order by id asc ";
//				   sql += " 	 ) ";
//				   sql += " where rownum = 1 ";
			
			String sql = sb.toString();
			pstmt = conn.prepareStatement(sql);	 	//뒤에 string만 들어올 수 있음. stringbuffer형은 들어올 수 없다 . toString메소드 사용
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				
				System.out.println("id : " + id + " \t name : " + name);
			}else {
				System.out.println("등록된 id가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
