package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521/dink";
			String user = "DA19";
			String password = "DAYOUNG";
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계
			stmt = conn.createStatement();
		
			System.out.print("등록할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name) ";
//				   sql += "values("+ id +","+ name +") ";   //이렇게만 넣으면 안됨 문자형은 작은 따옴표를 붙여야함 ''
				   sql += "values(\'"+ id +"\',\'"+ name +"\') ";  
				   
//			String sql = "insert into t_test(id, name) ";
//			   	   sql += "values('park', '박길동') ";	//공백때문에 문제가 발생할 수 있기 때문에 습관적으로 뒤에 스페이스 하나씩 비워두기/ 쿼리에서는 ; 안붙는거!!기억
		
			//4단계   
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총  " + cnt +"개행 삽입 ...");
				   
			
					
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
