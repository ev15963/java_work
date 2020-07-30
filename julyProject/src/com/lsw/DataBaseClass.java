package com.lsw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.ㅣㄴ.util.ChangeEncoding;

public class DataBaseClass {

	// db 관련 상수선언
	// 1. mysql 드라이버 이름
	public final String driver_name = "com.mysql.jdbc.Driver";
	// 2. mysql server url
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mysql admin id
	public final String Admin_ID = "root";
	// 4. mysql admin password
	// public final String Admin_PW = "1234";

	// database 관련 객체 선언
	public String dbname = "";
	// 1. 데이터베이스 접속
	public Connection conn = null;
	// 2. query 실행 객체
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select 결과 저장 객체
	public ResultSet rs = null;
	// 4. insert / delete / update 결과 저장 변수

	// public String company_db = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	// public DataBaseClass(String company_db) {
	// this.company_db = company_db;
	// }

	/** 1. mySQL server에 접속하는 메서드 선언 */
	public void connect_companydb(String dbname) {
		this.dbname = dbname;
		try {
			Class.forName(this.driver_name);
			// com.mysql.jdbc: 패키지명
			// Driver : Driver.class

			// getConnection("접속 URL+DB명", "관리자ID", "관리자PW");
			String url = this.DB_URL + this.dbname;
			try {
				this.conn = DriverManager.getConnection(url, this.Admin_ID, "1234");
			} catch (SQLException e) {
				System.out.println("conn err" + e.getMessage());
			}
			// getConnection()는 db명이 null아닌 이상,
			// db명이 없어도 접속에 성공할 수 있기 때문에 오류 발생안함
			// 단, db명이 있을 경우 , 즉, 잘못입력했을 경우에는 오류발생!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR (혹시 build path 안했는지 확인 my-sql connector):" + e.getMessage());
		}
	}
	
	public void search() {

		Scanner sc = new Scanner(System.in);
		System.out.println("카테고리 입력하시오(1. 전체, 2. 기업명, 3. 위치, 4. 설립년도 ):"); // 기업명
		int temp = sc.nextInt();
		if (temp == 1) {
			selectAll();
		} else {
			if (temp == 2) {
				System.out.println("기업명을 검색하시오(네이버 , 카카오 등) : ");
				String temp2 = sc.next();
				selectRldjq("company_table", temp2);
			} else if (temp == 3) { // 위치
				System.out.println("지역을 검색하시오(서울시, 성남시 등) : ");
				String temp2 = sc.next();
				selectWlsur("company_table", temp2); // 서울시
			} else if (temp == 4) { // 설립년도
				System.out.println("년도를 검색하시오. 예)2013년 설립기업 -> 2013 : ");
				String temp2 = sc.next();
				selectYear("company_table", temp2);
			} else {
	
				System.out.println("잘못입력");
			}
		}
	}
	

	/**
	 * 2. table의 전체 레코드 조회 메서드 선언
	 */
	public void selectAll() { // 전체검색
		System.out.println("전체 검색을 하였습니다.");
		// 1. query 생성
		String query = "select * from company_table";

		// 2. Statement 객체 새성
		try {
			this.stmt = this.conn.createStatement();
			// 3. query 실행
			this.rs = this.stmt.executeQuery(query);
			// 4. ResultSet 객체 내부 데이터를 ArryayList에 객체로 추가
			// ObjectClass oj = null;
			while (rs.next()) {
				// System.out.println(rs.getInt("no"));
				System.out.println("기업명 : " + ChangeEncoding.mysqlToJava(rs.getString("name")));
				System.out.println("위치 : " + ChangeEncoding.mysqlToJava(rs.getString("location")));
				System.out.println("설립년도 : " + rs.getString("year"));
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

	public void selectRldjq(String table_name, String rldjqaud) { // 기업검색
		// 1. query 생성
		String query = "select * from " + table_name + " where name=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaToMysql(rldjqaud));
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // 결과 값에 담음
			//if (this.rs == rldjqaud) {
				System.out.println(rldjqaud + "의 기업정보를 검색하였습니다.");
				while (rs.next()) {
				System.out.println("기업명 : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "위치 : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "설립년도 : "
						+ rs.getString("year"));
				}
//			}else {
//				System.out.println("잘못입력하였습니다.");
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


	public void selectWlsur(String table_name, String wldur) { // 지역검색
		// 1. query 생성
		String query = "select * from " + table_name + " where location=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.javaToMysql(wldur));
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // 결과 값에 담음
			System.out.println(wldur + "에 있는 기업을 검색하였습니다.");
			while (rs.next()) {
				System.out.println("기업명 : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "위치 : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "설립년도 : "
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
	
	
	public void selectYear(String table_name, String Year) { // 지역검색
		// 1. query 생성
		String query = "select * from " + table_name + " where year=?";
		// System.out.println(query);
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, Year);
			// System.out.println(query);
			this.rs = this.pstmt.executeQuery(); // 결과 값에 담음
			System.out.println(Year + "년에 설립한 기업을 검색하였습니다.");
			while (rs.next()) {
				System.out.println("기업명 : " + ChangeEncoding.mysqlToJava(rs.getString("name")) + "\n" + "위치 : "
						+ ChangeEncoding.mysqlToJava(rs.getString("location")) + "\n" + "설립년도 : "
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
