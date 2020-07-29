package com.lsw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	// db 관련 상수선언
	// 1. mysql 드라이버 이름
	public final String driver_name = "com.mysql.jdbc.driver";
	// 2. mysql server url
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mysql admin id
	public final String Admin_ID = "root";
	// 4. mysql admin password
	public final String Admin_PW = "1234";

	// database 관련 객체 선언
	// 1. 데이터베이스 접속
	public Connection conn = null;
	// 2. query 실행 객체
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select 결과 저장 객체
	public ResultSet rs = null;
	// 4. insert / delete / update 결과 저장 변수

	public String company_db = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseClass(String company_db) {
		this.company_db = company_db;
	}

	/** 1. mySQL server에 접속하는 메서드 선언 */
	public void connect_companydb() {
		// 1. mySQL 드라이버 로드
		try {
			Class.forName(this.driver_name);
		} catch (ClassNotFoundException e) {
			System.out.println("connect_companydb"+e.getMessage());
		}
	}

	/** 2. table의 전체 레코드 조회 메서드 선언 */
	public void selectAll() {
		//1. query 생성
		String query = "select * from company_table";
		
		//2. Statement 객체 새성
		try {
			this.stmt=this.conn.createStatement();
			//3. query 실행
			this.rs=this.stmt.executeQuery(query);
			//4. ResultSet 객체 내부 데이터를 ArryayList에 객체로 추가
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
