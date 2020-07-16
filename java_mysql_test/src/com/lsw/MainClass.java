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
		/** 2. mySQL Server Connect **/
		Connection conn = null; // 외부에 선언

		String query = "select * from member"; // 3-2 Query 문 선언

		Statement stmt = null; // 3-1 SQL 실행 객체 얻기

		/** 3. SQL 실행 **/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공");

			// 2
			// Access denied for user 'root'@'localhost' (using password: YES)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
			System.out.println("접속성공");

			stmt = conn.createStatement();// 3-1

			// 3-3 객체의 메서드를 이용하여 query 실행
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) { // rs.next();
				System.out.print(rs.getInt("no"));
				System.out.print(rs.getString("id"));
				System.out.println(rs.getString("pw"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "<===");
		} catch (SQLException e) {
			System.out.println("executeQuery() ERR : " + e.getMessage());
		}

		/** 4. SQL 실행 결과 처리 **/

		/** 5. DB 관련 객체 및 접속 해제 **/

	} // main() END

} // MainClass END
