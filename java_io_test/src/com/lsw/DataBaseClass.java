package com.lsw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	/**database ���� ��� ���� */
	public final String DRIVER_NAME="com.mysql.jdbc.Driver";
	public final String DRIVER_URL="jdbc:mysql://localhost:3306/";
	public final String DRIVER_ID="root";
	public final String DRIVER_PW="1234";
	/**database ���� ��ü ���� */
	public Statement stmt =null;
	public PreparedStatement pstmt =null;
	public ResultSet rs =null;
	public Connection conn = null;
	/**�� �� �ʿ��� ��ü, ���� ���� */
	public String dbname="cafedb";
	
	public DataBaseClass() { //�⺻ ������
		// TODO Auto-generated constructor stub
	}
	
	/** 1. mysql server�� �����ϴ� �޼��� ���� **/
	public void connect_db() {
		try {
			Class.forName(this.DRIVER_NAME);
			String url=this.DRIVER_URL+this.DRIVER_NAME;
			try {
				conn = DriverManager.getConnection(DRIVER_URL, DRIVER_ID, DRIVER_PW);
				System.out.println("����̹� ���� ����");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("connect_db err"+e.getMessage());
		}
	} //connect_db() END
	
	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� **/
	//��� : 1. �ʵ�� ��� / 2. TableView�� ������ ���
	public void selectAll() {
		
	} //selectAll() END
	
	/** �� �ڿ����� ��ü�ϴ� �޼��� */
	public void userClose() {
		
	} //userClose() END

}
