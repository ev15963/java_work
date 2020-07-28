package com.lsw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lsw.ChangeEncoding;

import java.sql.DriverManager;

public class DataBaseClass {
	/** ��� ���� **/
	public final String DRIVER = "com.mysql.jdbc.Driver"; // ����̹���
	// ����̹����� ��ǰ���� �ٸ�..
	// �ش� ��ǰ ����Ʈ���� ����

	public final String DBURL = "jdbc:mysql://localhost:3306/"; // �⺻URL
	// localhost�� ip : 127.0.0.1 (���� Ŭ���̾�Ʈ �ּҷ� ����)
	// 3306: mySQL�� ������ ����� ���� ��Ʈ��ȣ
	// ���� ��Ʈ��ȣ�� ��ǰ���� �ٸ� (����Ŭ�� 8080�� �⺻ ��Ʈ��ȣ)

	public final String DBID = "root"; // ������ ID
	public final String DBPW = "1234"; // ������ PW
	// mySQL 5.1�� "root"�� ����
	// ����Ŭ������ ����� ���� (��, DB��)���� �����
	// ���� : �ұԸ� ��ü�� APM�� �ַ� ��� (Apach/ PHP / MySQL)

	/** DB ���� ���� �� ��ü ���� **/
	// java.sql ��Ű�� ���� Ŭ������
	public String dbname = ""; // ����� �����ͺ��̽���
	public Connection conn = null; // ���� ���� ��ü �ʼ�
	public Statement stmt = null; // ��ü ��ȸ select * from ~
	public PreparedStatement pstmt = null; // ���̺� ������ ������ ����
	public ResultSet rs = null; // select�� ��� ��ü ����
	public int result = 0; // insert/update/delete ��� ����

	public DataBaseClass() {

	}

	/** ����̹� �ε� �� �����ͺ��̽� ���� **/
	public void connectMySQL(String db_name) {
		this.dbname = db_name;
		try {
			Class.forName(this.DRIVER);
			// com.mysql.jdbc: ��Ű����
			// Driver : Driver.class

			// getConnection("���� URL+DB��", "������ID", "������PW");
			String url = this.DBURL + this.dbname;
			try {
				this.conn = DriverManager.getConnection(url, this.DBID, "1234");
			} catch (SQLException e) {
				System.out.println("����̹� ����" + e.getMessage());
			}
			// getConnection()�� db���� null�ƴ� �̻�,
			// db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻�����
			// ��, db���� ���� ��� , ��, �߸��Է����� ��쿡�� �����߻�!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:" + e.getMessage());
		}
	}

//	public void qnaNum(String qna, String num) {
//		String query="select "+qna+" from quiz_table where no="+num;
//		
//		String temp ="";
//		try {
//			this.stmt=this.conn.createStatement();
//			this.rs=this.stmt.executeQuery(query);
//			temp = rs.getString(1);
//			ChangeEncoding.toUnicode(temp);
//		} catch (SQLException e) {
//			System.out.println("qnaNum err:"+e.getMessage());
//		}
//	}

	//
	// /**��ȸ �޼��� (��ü ��ȸ : select * from ���̺��) **/
	// public void selectAll(String table_name) {
	// //86970: 1000 : 100 where X
	// //84370: 1000 : 250 where sale>200
	// String query="select sum(sale*13), max(sale), min(sale) from "
	// +table_name +" where sale>200";
	//
	//
	// try {
	// this.stmt=this.conn.createStatement();
	// //createStatement()�� ��ü ������, query���� ���� ����!!!
	// this.rs=this.stmt.executeQuery(query);
	// //���� query �����û ��, ������ query���� mySQL�� ����!!!
	//// while(rs.next()) {
	//// System.out.println(rs.getString("empName"));
	//// String name=rs.getString("empName");
	//// System.out.println(ChangeEncoding.toUnicode(name)); //���ڵ�
	//// }
	// this.rs.next();
	// System.out.print(rs.getInt(1)+" : ");
	// System.out.print(rs.getInt(2)+" : ");
	// System.out.print(rs.getInt(3));
	// } catch (SQLException e) {
	// System.out.println("selectAll() ERR:"+e.getMessage());
	// }
	//
	// }
	//
	// /**���̺� �������߰� (����)�ϴ¸޼ҵ� **/
	//// insert into employee (empNo, empName, job, mgr)
	//// hireDate, sale, commission, detNo)
	//// values(1001, "����", "���", 13, "2007-03-01", 300, 0, 20);
	//// ? ? ? ? ? ? ? ?
	// public void insertRecord() {
	// String query="insert into employee ";
	// query+="(empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
	// query+=" values (?,?,?,?,?,?,?,?)"; // �ʵ��� ���� ��ŭ ? �ʿ�
	// //empNo�� primary key �̱� ������ �ߺ����� �߰��� �� ����.
	// try {
	// //prepareStatement()�� ��ü������, query���� ���� �����ؾ��Ѵ�.
	// this.pstmt=this.conn.prepareStatement(query);
	// //query�� ���ο� ? �� �������
	// //�ݵ�� ?�� �ش����ϴ� ���� ����!!!
	// //���� ���� ?�� ������� ?�� 1���� ����
	// //?�� �������� ���� �� �Ǵ� ���� ���� ������ ��� �����߻�!!!
	// //���� �ش� �ʵ�� Ÿ���� ���� ���� ��쿡�� �����߻�!!
	// this.pstmt.setInt(1, 1015);
	// this.pstmt.setString(2, ChangeEncoding.toLatin("������"));
	// this.pstmt.setString(3, ChangeEncoding.toLatin("����"));
	// this.pstmt.setInt(4, 12);
	// this.pstmt.setString(5, "2020-07-21");
	// this.pstmt.setInt(6, 100);
	// this.pstmt.setInt(7, 0);
	// this.pstmt.setInt(8, 20);
	//
	// this.result=this.pstmt.executeUpdate();
	// //��ü ������ �̸� query���� �����߱� ������
	// //����� query�� �������� ����!!
	// //executeUpdate()�� ������ ��� ���� ������ ��ȯ
	// //������ ������ ���� ��쿡�� 0�� ��ȯ..
	// //��� ���� �̿��ϸ� ���� ���θ� Ȯ���� �� ����
	// System.out.println(this.result+"���� �߰��Ǿ����ϴ�.");
	//
	// } catch (SQLException e) {
	// System.out.println("insertRecord err:"+e.getMessage());
	// }
	// }
	//
	// /**�˻�� �̿��� �˻� �޼��� ���� **/
	// //where empName like '%��%'�� �Ʒ��� ���� �����ؾ� ����
	// //where empName like CONCAT('%', ?, '%')
	// //���� : CONCAT�� concatenate(����, �մ�. ����..)�� ����
	//
	// public void searchWord(String table_name) {
	// String query = "select empName, job from ";
	// query+=table_name;
	// query+=" where empName like CONCAT('%', ?,'%')";
	//
	// try {
	// this.pstmt=this.conn.prepareStatement(query);
	// this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
	// this.rs=this.pstmt.executeQuery();
	//
	// while(rs.next()) {
	// String temp="";
	// temp=rs.getString(1);
	// System.out.println(ChangeEncoding.toUnicode(temp+" : "));
	// temp=rs.getString(2);
	// System.out.print(ChangeEncoding.toUnicode(temp));
	// }
	//
	// }catch(SQLException e) {
	// System.out.println("searchWord() err : "+e.getMessage());
	// }
	// }

}
