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

	/** 상수 선언 **/
	private final String DRIVER = "com.mysql.jdbc.Driver"; // 드라이버명
	// 드라이버명은 제품마다 다름..
	// 해당 제품 사이트에서 제공

	private final String DB_URL = "jdbc:mysql://localhost:3306/"; // 기본URL
	// localhost와 ip : 127.0.0.1 (추후 클라이언트 주소로 변경)
	// 3306: mySQL의 데이터 입출력 지원 포트번호
	// 위의 포트번호는 제품마다 다름 (오라클은 8080이 기본 포트번호)

	private final String DBID = "root"; // 관리자 ID
	// mySQL 5.1은 "root"로 고정
	// 오라클에서는 사용자 계정 (즉, DB명)으로 변경됨
	// 참고 : 소규모 업체는 APM을 주로 사용 (Apach/ PHP / MySQL)

	private final String DBPW = "1234";

	/** DB 관련 변수 및 객체 선언 **/
	// java.sql 패키지 내의 클래스들
	// public String dbname = ""; // 사용할 데이터베이스명
	private Connection conn = null; // 최종 접속 객체 필수
	private Statement stmt = null; // 전체 조회 select * from ~
	private PreparedStatement pstmt = null; // 테이블에 변수로 데이터 전달
	private ResultSet rs = null; // select의 결과 객체 저장
	// public int result = 0; // insert/update/delete 결과 저장
	private String db_url_dbname = ""; // null과 차이???

	// 기본생성자
	public QuizDB() {
	}

	/** 생성자 Overloading **/
	public QuizDB(String dbName) {
		this.db_url_dbname = DB_URL + dbName;
	}

	/** 드라이버 로드 및 데이터베이스 접속 **/
	public void connectMySQL() {
		// this.dbname = db_name;
		try {
			Class.forName(db_url_dbname);
			this.conn = DriverManager.getConnection(this.db_url_dbname, DBID, DBPW);
			// com.mysql.jdbc: 패키지명
			// Driver : Driver.class

			// getConnection("접속 URL+DB명", "관리자ID", "관리자PW");
			// String url = this.DBURL + this.dbname;
			// try {
			// this.conn = DriverManager.getConnection(url, this.DBID, "1234");
		} catch (SQLException e) {
			System.out.println("드라이버 ㅇㄹ" + e.getMessage());

			// getConnection()는 db명이 null아닌 이상,
			// db명이 없어도 접속에 성공할 수 있기 때문에 오류 발생안함
			// 단, db명이 있을 경우 , 즉, 잘못입력했을 경우에는 오류발생!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER con ERR:" + e.getMessage());
		}
	}

	/** quizInsert() 메서드 선언 시작 quiz_db의 quiz_table에 문제와 정답 삽입 **/
	public void quizInsert() {
		String[] problems = { "네트워크 처리 패키지는?", "자바의 최신버전은?", "" };
		String[] answers = { "java.net", "1.8", "IP" }; // insert 방지

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

	// quizInsert() 메서드 선언 시작 : quiz db 의 quiz_table에 문제와 정답 조회
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

	/** dbcode() 메서드 선언 시작 : quiz_db접속 끊기 **/
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
			System.out.println("자원해제 err:" + e.getMessage());
		}
	}

}
