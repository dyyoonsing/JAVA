package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class PrnEmpSalary {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnectionEZU();
			
			StringBuilder sb = new StringBuilder();
			sb.append(" select avg(e.salary) AVG, j.job_title ");
			sb.append(" from (select * from employees ");
			sb.append("		   where salary >= ?) E, ");
			sb.append("		   jobs J ");
			sb.append(" where e.job_id = j.job_id ");
			sb.append(" group by j.job_title ");
			sb.append(" order by AVG desc ");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("급여를 입력하세요 : ");
			int numSalary = sc.nextInt();
			sc.nextLine();
			
			String sql = sb.toString();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, numSalary);
			ResultSet rs = pstmt.executeQuery();
			
			int cnt = 0;
			while(rs.next()) {
				int salary = rs.getInt(1);
				String deptName = rs.getString(2);
				cnt++;
				
				System.out.println("[" + deptName + "]  " + salary);
			}
			System.out.println("총 ["+cnt+"] 명이 검색되었습니다.");
			
			
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
