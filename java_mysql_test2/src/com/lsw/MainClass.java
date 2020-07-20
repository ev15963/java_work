package com.lsw;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import com.lsw.db.DataBaseClass;
import com.lsw.obj.DataClass;
import com.lsw.outside.PrintClass;
import com.lsw.util.MethodClass;

//import javax.naming.spi.DirStateFactory.Result;

public class MainClass {

	public static void main(String[] args) {
		
		DataBaseClass dbc = new DataBaseClass("navercafe");
		dbc.connect_navercafe();
		dbc.selectAll();
		System.out.println(DataClass.members.size());
		System.out.println(DataClass.members.get(0).getPw());
		
		String tags =MethodClass.makeTags();
		System.out.println(tags);
		PrintClass.createHTML(tags);
//		dbc.duplicateID("aaa");
//		dbc.duplicateID("vvv");
//		dbc.insertTable("ssss", "12345");
//		dbc.updateTable("zzzz", "4444", 5);
//		dbc.deleteRecord(10);
//		dbc.selectAll();
//		
//		dbc.userClose();
//		
//		dbc.selectAll();
//		/** 1. JDBC Driver Load **/
//		/** 2. mySQL Server Connect **/
////		Connection conn = null; // 외부에 선언
//		Connection conn = null;
////		String query = "select * from member"; // 3-2 Query 문 선언
//		String query = "select * from member";
////		Statement stmt = null; // 3-1 SQL 실행 객체 얻기
//		Statement stmt = null;
////		ResultSet rs = null;
//		ResultSet rs = null;
//		/** 3. SQL 실행 **/
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			Class.forName("com.mysql.jdbc.Driver");
////			System.out.println("드라이버 로드 성공");
//			System.out.println("드라이버 로드 성공");
////			// 2
////			// Access denied for user 'root'@'localhost' (using password: YES)
////			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
////			System.out.println("접속성공");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
////			stmt = conn.createStatement();// 3-1
//			stmt = conn.createStatement();
////
////			// 3-3 객체의 메서드를 이용하여 query 실행
////			rs = stmt.executeQuery(query);
//			rs = stmt.executeQuery(query);
////			while (rs.next()) { // rs.next();
////				System.out.print(rs.getInt("no"));
////				System.out.print(rs.getString("id"));
////				System.out.println(rs.getString("pw"));
////			}
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("no"));
//				System.out.println(rs.getString("id"));
//				System.out.println(rs.getString("pw"));
//			}
//		} catch (ClassNotFoundException e) {
////			System.out.println(e.getMessage() + "<===");
//			System.out.println(e.getMessage() + "<===");
//		} catch (SQLException e) {
////			System.out.println("executeQuery() ERR : " + e.getMessage());
//			System.out.println("executeQuery() ERR : " + e.getMessage());
//		} finally {
//			/** 5. DB 관련 객체 및 접속 해제 **/
//			try {
////				rs.close();
////				stmt.close();
////				conn.close();
//				rs.close();
//				stmt.close();
//				conn.close();
//			} catch (SQLException e) {
////				System.out.println("CLOSE ERR : " + e.getMessage());
//				System.out.println("CLOSE ERR : " + e.getMessage());
//			}
//		}

		/** 4. SQL 실행 결과 처리 **/


	} // main() END

} // MainClass END
