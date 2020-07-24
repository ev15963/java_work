package com.lsw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuizDB {

	public ArrayList<quiz> quiz_list = new ArrayList<quiz>();

	/** ��� ���� **/
	private final String DRIVER = "com.mysql.jdbc.Driver"; // ����̹���
	// ����̹����� ��ǰ���� �ٸ�..
	// �ش� ��ǰ ����Ʈ���� ����

	private final String DB_URL = "jdbc:mysql://localhost:3306/"; // �⺻URL
	// localhost�� ip : 127.0.0.1 (���� Ŭ���̾�Ʈ �ּҷ� ����)
	// 3306: mySQL�� ������ ����� ���� ��Ʈ��ȣ
	// ���� ��Ʈ��ȣ�� ��ǰ���� �ٸ� (����Ŭ�� 8080�� �⺻ ��Ʈ��ȣ)

	private final String DBID = "root"; // ������ ID
	// mySQL 5.1�� "root"�� ����
	// ����Ŭ������ ����� ���� (��, DB��)���� �����
	// ���� : �ұԸ� ��ü�� APM�� �ַ� ��� (Apach/ PHP / MySQL)

	private final String DBPW = "1234";

	/** DB ���� ���� �� ��ü ���� **/
	// java.sql ��Ű�� ���� Ŭ������
	// public String dbname = ""; // ����� �����ͺ��̽���
	private Connection conn = null; // ���� ���� ��ü �ʼ�
	private Statement stmt = null; // ��ü ��ȸ select * from ~
	private PreparedStatement pstmt = null; // ���̺� ������ ������ ����
	private ResultSet rs = null; // select�� ��� ��ü ����
	// public int result = 0; // insert/update/delete ��� ����
	private String db_url_dbname = ""; // null�� ����???

	// �⺻������
	public QuizDB() {
	}

	/** ������ Overloading **/
	public QuizDB(String dbName) {
		this.db_url_dbname = DB_URL + dbName;
	}

	/** ����̹� �ε� �� �����ͺ��̽� ���� **/
	public void connectMySQL() {
		// this.dbname = db_name;
		try {
			Class.forName(db_url_dbname);
			this.conn = DriverManager.getConnection(this.db_url_dbname, DBID, DBPW);
			// com.mysql.jdbc: ��Ű����
			// Driver : Driver.class

			// getConnection("���� URL+DB��", "������ID", "������PW");
			// String url = this.DBURL + this.dbname;
			// try {
			// this.conn = DriverManager.getConnection(url, this.DBID, "1234");
		} catch (SQLException e) {
			System.out.println("����̹� ����" + e.getMessage());

			// getConnection()�� db���� null�ƴ� �̻�,
			// db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻�����
			// ��, db���� ���� ��� , ��, �߸��Է����� ��쿡�� �����߻�!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER con ERR:" + e.getMessage());
		}
	}

	/** quizInsert() �޼��� ���� ���� quiz_db�� quiz_table�� ������ ���� ���� **/
	public void quizInsert() {
		String[] problems = { "��Ʈ��ũ ó�� ��Ű����?", "�ڹ��� �ֽŹ�����?", "" };
		String[] answers = { "java.net", "1.8", "IP" }; // insert ����

		this.pstmt = null;
		String sql_insert = "INSERT INTO quiz_table (question, answer)";
		sql_insert += "VAULES(?,?)";
		int result = 0;
		try {
			this.pstmt = this.conn.prepareStatement(sql_insert);
			for (int i = 0; i < problems.length; i++) {
				this.pstmt.setString(1, ChangeEncoding.toLatin(problems[i]));
				this.pstmt.setString(2, ChangeEncoding.toLatin(problems[i]));
				result = this.pstmt.executeUpdate();
				// System.out.println("for => result : "+result+""+i);
			}
		} catch (SQLException e) {
			System.out.println("quizInsert err : " + e.getMessage());

		}
	}

	// quizInsert() �޼��� ���� ���� : quiz db �� quiz_table�� ������ ���� ��ȸ
	public void quizSelect() {
		this.stmt = null;
		this.rs = null;

		String sql_select = "select * from quiz_table";

		try {
			this.conn.createStatement();
			this.rs = this.stmt.executeQuery(sql_select);
			quiz quiz_object = null;
			while (rs.next()) {
				quiz_object = new quiz();
				quiz_object.setQuizNo(rs.getInt("no"));
				quiz_object.setQuizQuestion(ChangeEncoding.toLatin(rs.getString(1)));
				quiz_object.setQuizAnswer(ChangeEncoding.toLatin(rs.getString(2)));
				quiz_list.add(quiz_object);
				quiz_object = null;
			}
		} catch (SQLException e) {
			System.out.println("quizSelect :" + e.getMessage());
		}

	}

	/** dbcode() �޼��� ���� ���� : quiz_db���� ���� **/
	public void dbClose() {
		try {
			if (this.rs != null) {
				this.rs.close();
			}
			if (this.pstmt != null) {
				this.pstmt.close();
			}
			if (this.stmt != null) {
				this.stmt.close();
			}
			if (this.conn != null) {
				this.conn.close();
			}
		} catch (SQLException e) {
			System.out.println("�ڿ����� err:" + e.getMessage());
		}
	}

}
