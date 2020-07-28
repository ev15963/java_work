package com.lsw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lsw.ChangeEncoding;

import java.sql.DriverManager;

public class DataBaseClass {
	/** 상수 선언 **/
	public final String DRIVER = "com.mysql.jdbc.Driver"; // 드라이버명
	// 드라이버명은 제품마다 다름..
	// 해당 제품 사이트에서 제공

	public final String DBURL = "jdbc:mysql://localhost:3306/"; // 기본URL
	// localhost와 ip : 127.0.0.1 (추후 클라이언트 주소로 변경)
	// 3306: mySQL의 데이터 입출력 지원 포트번호
	// 위의 포트번호는 제품마다 다름 (오라클은 8080이 기본 포트번호)

	public final String DBID = "root"; // 관리자 ID
	public final String DBPW = "1234"; // 관리자 PW
	// mySQL 5.1은 "root"로 고정
	// 오라클에서는 사용자 계정 (즉, DB명)으로 변경됨
	// 참고 : 소규모 업체는 APM을 주로 사용 (Apach/ PHP / MySQL)

	/** DB 관련 변수 및 객체 선언 **/
	// java.sql 패키지 내의 클래스들
	public String dbname = ""; // 사용할 데이터베이스명
	public Connection conn = null; // 최종 접속 객체 필수
	public Statement stmt = null; // 전체 조회 select * from ~
	public PreparedStatement pstmt = null; // 테이블에 변수로 데이터 전달
	public ResultSet rs = null; // select의 결과 객체 저장
	public int result = 0; // insert/update/delete 결과 저장

	public DataBaseClass() {

	}

	/** 드라이버 로드 및 데이터베이스 접속 **/
	public void connectMySQL(String db_name) {
		this.dbname = db_name;
		try {
			Class.forName(this.DRIVER);
			// com.mysql.jdbc: 패키지명
			// Driver : Driver.class

			// getConnection("접속 URL+DB명", "관리자ID", "관리자PW");
			String url = this.DBURL + this.dbname;
			try {
				this.conn = DriverManager.getConnection(url, this.DBID, "1234");
			} catch (SQLException e) {
				System.out.println("드라이버 ㅇㄹ" + e.getMessage());
			}
			// getConnection()는 db명이 null아닌 이상,
			// db명이 없어도 접속에 성공할 수 있기 때문에 오류 발생안함
			// 단, db명이 있을 경우 , 즉, 잘못입력했을 경우에는 오류발생!!
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
	// /**조회 메서드 (전체 조회 : select * from 테이블명) **/
	// public void selectAll(String table_name) {
	// //86970: 1000 : 100 where X
	// //84370: 1000 : 250 where sale>200
	// String query="select sum(sale*13), max(sale), min(sale) from "
	// +table_name +" where sale>200";
	//
	//
	// try {
	// this.stmt=this.conn.createStatement();
	// //createStatement()는 객체 생성시, query문을 갖지 못함!!!
	// this.rs=this.stmt.executeQuery(query);
	// //실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
	//// while(rs.next()) {
	//// System.out.println(rs.getString("empName"));
	//// String name=rs.getString("empName");
	//// System.out.println(ChangeEncoding.toUnicode(name)); //인코딩
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
	// /**테이블에 데이터추가 (삽입)하는메소드 **/
	//// insert into employee (empNo, empName, job, mgr)
	//// hireDate, sale, commission, detNo)
	//// values(1001, "김사랑", "사원", 13, "2007-03-01", 300, 0, 20);
	//// ? ? ? ? ? ? ? ?
	// public void insertRecord() {
	// String query="insert into employee ";
	// query+="(empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
	// query+=" values (?,?,?,?,?,?,?,?)"; // 필드의 갯수 만큼 ? 필요
	// //empNo는 primary key 이기 때문에 중복업시 추가될 수 없다.
	// try {
	// //prepareStatement()는 객체생성시, query문을 먼저 전달해야한다.
	// this.pstmt=this.conn.prepareStatement(query);
	// //query문 내부에 ? 가 있을경우
	// //반드시 ?에 해당항하는 값을 설정!!!
	// //여러 개의 ?가 있을경우 ?는 1부터 지정
	// //?의 갯수보다 많은 값 또는 적은 값을 설정할 경우 오류발생!!!
	// //또한 해당 필드와 타입이 맞이 않을 경우에도 오류발생!!
	// this.pstmt.setInt(1, 1015);
	// this.pstmt.setString(2, ChangeEncoding.toLatin("강기훈"));
	// this.pstmt.setString(3, ChangeEncoding.toLatin("강사"));
	// this.pstmt.setInt(4, 12);
	// this.pstmt.setString(5, "2020-07-21");
	// this.pstmt.setInt(6, 100);
	// this.pstmt.setInt(7, 0);
	// this.pstmt.setInt(8, 20);
	//
	// this.result=this.pstmt.executeUpdate();
	// //객체 생성시 미리 query문을 전달했기 때문에
	// //실행시 query문 전달하지 않음!!
	// //executeUpdate()는 실행후 결과 값을 정수로 반환
	// //실행한 내용이 없을 경우에는 0을 반환..
	// //결과 값을 이용하면 실행 여부를 확인할 수 없음
	// System.out.println(this.result+"개가 추가되었습니다.");
	//
	// } catch (SQLException e) {
	// System.out.println("insertRecord err:"+e.getMessage());
	// }
	// }
	//
	// /**검색어를 이용한 검색 메서드 선언 **/
	// //where empName like '%이%'를 아래와 같이 변경해야 가능
	// //where empName like CONCAT('%', ?, '%')
	// //참고 : CONCAT은 concatenate(연결, 잇다. 연쇄..)의 약자
	//
	// public void searchWord(String table_name) {
	// String query = "select empName, job from ";
	// query+=table_name;
	// query+=" where empName like CONCAT('%', ?,'%')";
	//
	// try {
	// this.pstmt=this.conn.prepareStatement(query);
	// this.pstmt.setString(1, ChangeEncoding.toLatin("이"));
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
