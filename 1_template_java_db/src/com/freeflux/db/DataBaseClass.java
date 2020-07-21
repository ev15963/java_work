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
		String query="select sum(sale), avg(sale) from "+table_name+" order by seq_no desc limit 0,5";
		
		try {
			this.stmt=this.conn.createStatement();
			//createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs=this.stmt.executeQuery(query);
			//���� query �����û ��, ������ query���� mySQL�� ����!!!
//			while(rs.next()) {
//				System.out.println(rs.getString("empName"));
//				String name=rs.getString("empName");
//				System.out.println(ChangeEncoding.toUnicode(name)); //���ڵ�
//			}
			this.rs.next();
			System.out.print(rs.getInt(1)+" : ");
			System.out.print(rs.getInt(2));
		} catch (SQLException e) {
			System.out.println("selectAll() ERR:"+e.getMessage());
		}
		
	}
	
	/**���̺� �������߰� (����)�ϴ¸޼ҵ� **/
//	insert into employee (empNo, empName, job, mgr)
//							hireDate, sale, commission, detNo)
//	values(1001, "����", "���", 13, "2007-03-01", 300, 0, 20);
//			?		?	   ?    ?       ?			? ?   ?
	public void insertRecord() {
		String query="insert into employee ";
		query+="(empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
		query+=" values (?,?,?,?,?,?,?,?)";	// �ʵ��� ���� ��ŭ ? �ʿ�
		//empNo�� primary key �̱� ������ �ߺ����� �߰��� �� ����.
		try {
			//prepareStatement()�� ��ü������, query���� ���� �����ؾ��Ѵ�.
			this.pstmt=this.conn.prepareStatement(query);
			//query�� ���ο� ? �� �������
			//�ݵ�� ?�� �ش����ϴ� ���� ����!!!
			//���� ���� ?�� ������� ?�� 1���� ����
			//?�� �������� ���� �� �Ǵ� ���� ���� ������ ��� �����߻�!!!
			//���� �ش� �ʵ�� Ÿ���� ���� ���� ��쿡�� �����߻�!!
			this.pstmt.setInt(1, 1015);
			this.pstmt.setString(2, ChangeEncoding.toLatin("������"));
			this.pstmt.setString(3, ChangeEncoding.toLatin("����"));
			this.pstmt.setInt(4, 12);
			this.pstmt.setString(5, "2020-07-21");
			this.pstmt.setInt(6, 100);
			this.pstmt.setInt(7, 0);
			this.pstmt.setInt(8, 20);
			
			this.result=this.pstmt.executeUpdate();
			//��ü ������ �̸� query���� �����߱� ������
			//����� query�� �������� ����!!
			//executeUpdate()�� ������ ��� ���� ������ ��ȯ
			//������ ������ ���� ��쿡�� 0�� ��ȯ..
			//��� ���� �̿��ϸ� ���� ���θ� Ȯ���� �� ����
			System.out.println(this.result+"���� �߰��Ǿ����ϴ�.");
			
		} catch (SQLException e) {
			System.out.println("insertRecord err:"+e.getMessage());
		}
	}
	
	
}
