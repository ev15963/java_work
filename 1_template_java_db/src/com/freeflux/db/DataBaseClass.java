package com.freeflux.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;

import java.sql.DriverManager;

public class DataBaseClass {
	/** 상수 선언 **/
	public final String DRIVER="com.mysql.jdbc.Driver";			//드라이버명
	//드라이버명은 제품마다 다름..
	//해당 제품 사이트에서 제공

	public final String DBURL="jdbc:mysql://localhost:3306/";	//기본URL
	// localhost와 ip : 127.0.0.1 (추후 클라이언트 주소로 변경)
	// 3306: mySQL의 데이터 입출력 지원 포트번호
	// 위의 포트번호는 제품마다 다름 (오라클은 8080이 기본 포트번호)
	
	public final String DBID="root";							//관리자 ID
	//mySQL 5.1은 "root"로 고정
	//오라클에서는 사용자 계정 (즉, DB명)으로 변경됨
	//참고 : 소규모 업체는 APM을 주로 사용 (Apach/ PHP / MySQL)
	
	
	/** DB 관련 변수 및 객체 선언 **/
	//java.sql 패키지 내의 클래스들
	public String dbname="";				// 사용할 데이터베이스명
	public Connection conn=null;			// 최종 접속 객체 필수
	public Statement stmt=null;				// 전체 조회 select * from ~
	public PreparedStatement pstmt=null;	// 테이블에 변수로 데이터 전달
	public ResultSet rs=null;				// select의 결과 객체 저장
	public int result=0;					// insert/update/delete 결과 저장

	public DataBaseClass() {
		
	}

	/**드라이버 로드 및 데이터베이스 접속**/
	public void connectMySQL(String db_name) {
		this.dbname=db_name;
		try {
			Class.forName(this.DRIVER);
			//com.mysql.jdbc: 패키지명
			//Driver : Driver.class
			
			//getConnection("접속 URL+DB명", "관리자ID", "관리자PW");
			String url = this.DBURL+this.dbname;
			try {
				this.conn=DriverManager.getConnection(url, this.DBID, "1234");
			} catch (SQLException e) {
				System.out.println("드라이버 ㅇㄹ"+e.getMessage());
			}
			//getConnection()는 db명이 null아닌 이상,
			//db명이 없어도 접속에 성공할 수 있기 때문에 오류 발생안함
			//단, db명이 있을 경우 , 즉, 잘못입력했을 경우에는 오류발생!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:"+e.getMessage());
		}
	}
	
	/**조회 메서드 (전체 조회 : select * from 테이블명) **/
	public void selectAll(String table_name) {
		String query="select * from "+table_name;
		
		try {
			this.stmt=this.conn.createStatement();
			//createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs=this.stmt.executeQuery(query);
			//실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
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
