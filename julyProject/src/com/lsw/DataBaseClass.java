package com.lsw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.�Ӥ�.util.ChangeEncoding;

public class DataBaseClass {

	// db ���� �������
	// 1. mysql ����̹� �̸�
	public final String driver_name = "com.mysql.jdbc.Driver";
	// 2. mysql server url
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mysql admin id
	public final String Admin_ID = "root";
	// 4. mysql admin password
	// public final String Admin_PW = "1234";

	// database ���� ��ü ����
	public String dbname = "";
	// 1. �����ͺ��̽� ����
	public Connection conn = null;
	// 2. query ���� ��ü
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select ��� ���� ��ü
	public ResultSet rs = null;
	// 4. insert / delete / update ��� ���� ����

	// public String company_db = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	// public DataBaseClass(String company_db) {
	// this.company_db = company_db;
	// }

	/** 1. mySQL server�� �����ϴ� �޼��� ���� */
	public void connect_companydb(String dbname) {
		this.dbname = dbname;
		try {
			Class.forName(this.driver_name);
			// com.mysql.jdbc: ��Ű����
			// Driver : Driver.class

			// getConnection("���� URL+DB��", "������ID", "������PW");
			String url = this.DB_URL + this.dbname;
			try {
				this.conn = DriverManager.getConnection(url, this.Admin_ID, "1234");
			} catch (SQLException e) {
				System.out.println("conn err" + e.getMessage());
			}
			// getConnection()�� db���� null�ƴ� �̻�,
			// db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻�����
			// ��, db���� ���� ��� , ��, �߸��Է����� ��쿡�� �����߻�!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR (Ȥ�� build path ���ߴ��� Ȯ�� my-sql connector):" + e.getMessage());
		}
	}
	
	public void search() {

		Scanner sc = new Scanner(System.in);
		System.out.println("ī�װ� �Է��Ͻÿ�(1. ��ü, 2. �����, 3. ��ġ, 4. �����⵵ ):"); // �����
		int temp = sc.nextInt();
		if (temp == 1) {
			selectAll();
		} else {
			if (temp == 2) {
				System.out.println("������� �˻��Ͻÿ�(���̹� , īī�� ��) : ");
				String temp2 = sc.next();
				selectRldjq("company_table", temp2);
			} else if (temp == 3) { // ��ġ
				System.out.println("������ �˻��Ͻÿ�(�����, ������ ��) : ");
				String temp2 = sc.next();
				selectWlsur("company_table", temp2); // �����
			} else if (temp == 4) { // �����⵵
				System.out.println("�⵵�� �˻��Ͻÿ�. ��)2013�� ������� -> 2013 : ");
				String temp2 = sc.next();
				selectYear("company_table", temp2);
			} else {
	
				System.out.println("�߸��Է�");
			}
		}
	}
	

	/**
	 * 2. table�� ��ü ���ڵ� ��ȸ �޼��� ����
	 */
	public void selectAll() { // ��ü�˻�
		System.out.println("��ü �˻��� �Ͽ����ϴ�.");
		// 1. query ����
		String query = "select * from company_table";

		// 2. Statement ��ü ����
		try {
			this.stmt = this.conn.createStatement();
			// 3. query ����
			this.rs = this.stmt.executeQuery(query);
			// 4. ResultSet ��ü ���� �����͸� ArryayList�� ��ü�� �߰�
			// ObjectClass oj = null;
			while (rs.next()) {
				// System.out.println(rs.getInt("no"));
				System.out.println("����� : " + ChangeEncoding.mysqlToJava(rs.getString("name")));
				System.out.println("��ġ : " + ChangeEncoding.mysqlToJava(rs.getString("location")));
				System.out.println("�����⵵ : " + rs.getString("year"));
			}

		} catch (SQLException e) {
			System.out.println("selectAll err" + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("selectAll close err" + e.getMessage());
			}
		}

	}

	public void selectRldjq(String table_name, String rldjqaud) { // ����˻�
		// 1. query ����
		String query = "select * from " + table_name + " where name=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaToMysql(rldjqaud));
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // ��� ���� ����
			//if (this.rs == rldjqaud) {
				System.out.println(rldjqaud + "�� ��������� �˻��Ͽ����ϴ�.");
				while (rs.next()) {
				System.out.println("����� : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "��ġ : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "�����⵵ : "
						+ rs.getString("year"));
				}
//			}else {
//				System.out.println("�߸��Է��Ͽ����ϴ�.");
//				}

		} catch (SQLException e) {
			System.err.println("selectRldjq() ERR" + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println("selectRldjq() close ERR" + e.getMessage());
			}
		}
	}


	public void selectWlsur(String table_name, String wldur) { // �����˻�
		// 1. query ����
		String query = "select * from " + table_name + " where location=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaToMysql(wldur));
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // ��� ���� ����
			System.out.println(wldur + "�� �ִ� ����� �˻��Ͽ����ϴ�.");
			while (rs.next()) {
				System.out.println("����� : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "��ġ : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "�����⵵ : "
						+ rs.getString("year"));
			}
			// System.out.println("ddd");

		} catch (SQLException e) {
			System.err.println("selectWlsur() ERR" + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println("selectWlsur() close ERR" + e.getMessage());
			}
		}
	}///////////////
	
	
	public void selectYear(String table_name, String Year) { // �����˻�
		// 1. query ����
		String query = "select * from " + table_name + " where year=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, Year);
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // ��� ���� ����
			System.out.println(Year + "�⿡ ������ ����� �˻��Ͽ����ϴ�.");
			while (rs.next()) {
				System.out.println("����� : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "��ġ : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "�����⵵ : "
						+ rs.getString("year"));
			}
			// System.out.println("ddd");

		} catch (SQLException e) {
			System.err.println("selectWlsur() ERR" + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println("selectWlsur() close ERR" + e.getMessage());
			}
		}
	}///////////////

}
