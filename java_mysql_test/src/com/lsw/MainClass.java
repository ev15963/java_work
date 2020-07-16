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
			System.out.println("����̹� �ε� ����");
			
		} catch (ClassNotFoundException e) { //����ó�� �׷� ���� �����ϴ�..
			System.out.println(e.getMessage()+" : e.getMessage()");
		}
		/** 2. mySQL Server Connect **/
		Connection conn=null; //�ܺο� ����
		try {
			//Access denied for user 'root'@'localhost' (using password: YES)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/navercafe", "root", "1234");
			System.out.println("���Ӽ���");
		} catch (SQLException e) {
			System.out.println(e.getMessage()); //getMessage()
		}
		/** 3. SQL ���� **/
		//3-1 SQL ���� ��ü ���
		Statement stmt=null;
		try {
			stmt =conn.createStatement();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage()+"Statement ��ü ���� ����");
		}
		//3-2 Query �� ����
		String query="select * from member"; //
		//3-3 ��ü�� �޼��带 �̿��Ͽ� query ����
		try {
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {  //rs.next();
			System.out.print(rs.getInt("no"));
			System.out.print(rs.getString("id"));
			System.out.println(rs.getString("pw"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"select ����");
		}
		/** 4. SQL ���� ��� ó�� **/
		
		/** 5. DB ���� ��ü �� ���� ���� **/
		
		
		
	} // main() END

} // MainClass END
