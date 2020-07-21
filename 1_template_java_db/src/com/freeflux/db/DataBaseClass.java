package com.freeflux.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;

import java.sql.DriverManager;

public class DataBaseClass {
	/** ��� ���� **/
	public final String DRIVER="com.mysql.jdbc.Driver";			//����̹���
	//����̹����� ��ǰ���� �ٸ�..
	//�ش� ��ǰ ����Ʈ���� ����

	public final String DBURL="jdbc:mysql://localhost:3306/";	//�⺻URL
	// localhost�� ip : 127.0.0.1 (���� Ŭ���̾�Ʈ �ּҷ� ����)
	// 3306: mySQL�� ������ ����� ���� ��Ʈ��ȣ
	// ���� ��Ʈ��ȣ�� ��ǰ���� �ٸ� (����Ŭ�� 8080�� �⺻ ��Ʈ��ȣ)
	
	public final String DBID="root";							//������ ID
	//mySQL 5.1�� "root"�� ����
	//����Ŭ������ ����� ���� (��, DB��)���� �����
	//���� : �ұԸ� ��ü�� APM�� �ַ� ��� (Apach/ PHP / MySQL)
	
	
	/** DB ���� ���� �� ��ü ���� **/
	//java.sql ��Ű�� ���� Ŭ������
	public String dbname="";				// ����� �����ͺ��̽���
	public Connection conn=null;			// ���� ���� ��ü �ʼ�
	public Statement stmt=null;				// ��ü ��ȸ select * from ~
	public PreparedStatement pstmt=null;	// ���̺� ������ ������ ����
	public ResultSet rs=null;				// select�� ��� ��ü ����
	public int result=0;					// insert/update/delete ��� ����

	public DataBaseClass() {
		
	}

	/**����̹� �ε� �� �����ͺ��̽� ����**/
	public void connectMySQL(String db_name) {
		this.dbname=db_name;
		try {
			Class.forName(this.DRIVER);
			//com.mysql.jdbc: ��Ű����
			//Driver : Driver.class
			
			//getConnection("���� URL+DB��", "������ID", "������PW");
			String url = this.DBURL+this.dbname;
			try {
				this.conn=DriverManager.getConnection(url, this.DBID, "1234");
			} catch (SQLException e) {
				System.out.println("����̹� ����"+e.getMessage());
			}
			//getConnection()�� db���� null�ƴ� �̻�,
			//db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻�����
			//��, db���� ���� ��� , ��, �߸��Է����� ��쿡�� �����߻�!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:"+e.getMessage());
		}
	}
	
	/**��ȸ �޼��� (��ü ��ȸ : select * from ���̺��) **/
	public void selectAll(String table_name) {
		String query="select * from "+table_name;
		
		try {
			this.stmt=this.conn.createStatement();
			//createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs=this.stmt.executeQuery(query);
			//���� query �����û ��, ������ query���� mySQL�� ����!!!
			while(rs.next()) {
//				System.out.println(rs.getString("empName"));
				String name=rs.getString("empName");
				System.out.println(ChangeEncoding.toUnicode(name));
			}
		} catch (SQLException e) {
			System.out.println("selectAll() ERR:"+e.getMessage());
		}
		
	}
}
