package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	/**database 관련 상수 선언 **/
	// 1. mySQL 드라이버 이름 
	public final String DRIVER_NAME="com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL="jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID="root";
	// 4. mySQL Admin Password
	public final String ADMIN_PW="1234";
	
	/**database 관련 객체 선언**/
	// 1. 데이터베이스 접속
	public Connection conn = null;
	// 2. query 실행 객체
	public Statement stmt=null;
	public PreparedStatement pstmt=null;
	// 3. select 결과 저장 객체
	public ResultSet rs = null;
	// 4. insert / delete / update 결과 저장 변수
	public int r=0;
	
	/** 그 외 필요한 객체, 변수 선언 **/
	public String navercafe=null;
	
	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}
	
	//내부에서 처리하고 싶다면 private을 사용
	public DataBaseClass(String navercafe) { //main()으로 부터 DB이름 전달받는 생성자
		this.navercafe=navercafe;
	}
	
	/**1. mySQL server에 접속하는 메서드 선언**/
	public void connect_navercafe() {
		try {
			//1. mySQL 드라이버 로드
			Class.forName(this.DRIVER_NAME);
			
			//2. 사용할 데이터베이스에 접속
			String uri=this.DB_URL+this.navercafe;
			this.conn=DriverManager.getConnection(uri, this.ADMIN_ID, this.ADMIN_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("CONNECT ERR : "+e.getMessage());
		}
	}
	
	/**2. table의 전체 레코드 조회 메서드 선언**/
	public void selectAll() {
		// 1. query 생성
		String query="select * from member";
		
		try {
			// 2. Statement 객체 생성
			this.stmt=this.conn.createStatement();
			
			// 3. query 실행
			this.rs=this.stmt.executeQuery(query);
			
			// 4. ResultSet 객체 내부 데이터 조회
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
