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
		Connection conn = null; // �ܺο� ����

		String query = "select * from member"; // 3-2 Query �� ����

		Statement stmt = null; // 3-1 SQL ���� ��ü ���

		/** 3. SQL ���� **/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� ����");

			// 2
			// Access denied for user 'root'@'localhost' (using password: YES)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
			System.out.println("���Ӽ���");

			stmt = conn.createStatement();// 3-1

			// 3-3 ��ü�� �޼��带 �̿��Ͽ� query ����
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

		/** 4. SQL ���� ��� ó�� **/

		/** 5. DB ���� ��ü �� ���� ���� **/

	} // main() END

} // MainClass END
