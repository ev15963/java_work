package com.lsw;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

//import javax.naming.spi.DirStateFactory.Result;



public class MainClass {

	public static void main(String[] args) {
		
		/** 1. JDBC Driver Load **/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			
		} catch (ClassNotFoundException e) { //예외처리 그런 파일 없습니다..
			System.out.println(e.getMessage()+" : e.getMessage()");
		}
		/** 2. mySQL Server Connect **/
		Connection conn=null; //외부에 선언
		try {
			//Access denied for user 'root'@'localhost' (using password: YES)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
			System.out.println("접속성공");
		} catch (SQLException e) {
			System.out.println(e.getMessage()); //getMessage()
		}
		/** 3. SQL 실행 **/
		//3-1 SQL 실행 객체 얻기
		Statement stmt=null;
		try {
			stmt =conn.createStatement();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage()+"Statement 객체 생성 실패");
		}
		//3-2 Query 문 선언
		String query="select * from member"; //
		//3-3 객체의 메서드를 이용하여 query 실행
		try {
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {  //rs.next();
			System.out.print(rs.getInt("no"));
			System.out.print(rs.getString("id"));
			System.out.println(rs.getString("pw"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"select 오류");
		}
		/** 4. SQL 실행 결과 처리 **/
		
		/** 5. DB 관련 객체 및 접속 해제 **/
		
		
		
	} // main() END

} // MainClass END
