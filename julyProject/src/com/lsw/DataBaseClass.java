package com.lsw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	// db ���� �������
	// 1. mysql ����̹� �̸�
	public final String driver_name = "com.mysql.jdbc.driver";
	// 2. mysql server url
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mysql admin id
	public final String Admin_ID = "root";
	// 4. mysql admin password
	public final String Admin_PW = "1234";

	// database ���� ��ü ����
	// 1. �����ͺ��̽� ����
	public Connection conn = null;
	// 2. query ���� ��ü
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select ��� ���� ��ü
	public ResultSet rs = null;
	// 4. insert / delete / update ��� ���� ����

	public String company_db = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseClass(String company_db) {
		this.company_db = company_db;
	}

	/** 1. mySQL server�� �����ϴ� �޼��� ���� */
	public void connect_companydb() {
		// 1. mySQL ����̹� �ε�
		try {
			Class.forName(this.driver_name);
		} catch (ClassNotFoundException e) {
			System.out.println("connect_companydb"+e.getMessage());
		}
	}

	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� */
	public void selectAll() {
		//1. query ����
		String query = "select * from company_table";
		
		//2. Statement ��ü ����
		try {
			this.stmt=this.conn.createStatement();
			//3. query ����
			this.rs=this.stmt.executeQuery(query);
			//4. ResultSet ��ü ���� �����͸� ArryayList�� ��ü�� �߰�
			ObjectClass oj = null;
		} catch (SQLException e) {
			System.out.println("selectAll err"+e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("selectAll close err"+e.getMessage());
			}
		}
		
	}

}
