package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	/**database ���� ��� ���� **/
	// 1. mySQL ����̹� �̸� 
	public final String DRIVER_NAME="com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL="jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID="root";
	// 4. mySQL Admin Password
	public final String ADMIN_PW="1234";
	
	/**database ���� ��ü ����**/
	// 1. �����ͺ��̽� ����
	public Connection conn = null;
	// 2. query ���� ��ü
	public Statement stmt=null;
	public PreparedStatement pstmt=null;
	// 3. select ��� ���� ��ü
	public ResultSet rs = null;
	// 4. insert / delete / update ��� ���� ����
	public int r=0;
	
	/** �� �� �ʿ��� ��ü, ���� ���� **/
	public String navercafe=null;
	
	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}
	
	//���ο��� ó���ϰ� �ʹٸ� private�� ���
	public DataBaseClass(String navercafe) { //main()���� ���� DB�̸� ���޹޴� ������
		this.navercafe=navercafe;
	}
	
	/**1. mySQL server�� �����ϴ� �޼��� ����**/
	public void connect_navercafe() {
		try {
			//1. mySQL ����̹� �ε�
			Class.forName(this.DRIVER_NAME);
			
			//2. ����� �����ͺ��̽��� ����
			String uri=this.DB_URL+this.navercafe;
			this.conn=DriverManager.getConnection(uri, this.ADMIN_ID, this.ADMIN_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("CONNECT ERR : "+e.getMessage());
		}
	}
	
	/**2. table�� ��ü ���ڵ� ��ȸ �޼��� ����**/
	public void selectAll() {
		// 1. query ����
		String query="select * from member";
		
		try {
			// 2. Statement ��ü ����
			this.stmt=this.conn.createStatement();
			
			// 3. query ����
			this.rs=this.stmt.executeQuery(query);
			
			// 4. ResultSet ��ü ���� ������ ��ȸ
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"_");
				System.out.print(rs.getString(2)+"_");
				System.out.println(rs.getString(3));
			} //while() END
			
		} catch (SQLException e) {
			System.out.println("STATEMENT ERR:" +e.getMessage());
		}
	}
}
