package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	/** database 관련 상수 선언 **/
	// 1. mySQL 드라이버 이름
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID = "root";
	// 4. mySQL Admin Password
	public final String ADMIN_PW = "1234";

	/** database 관련 객체 선언 **/
	// 1. 데이터베이스 접속
	public Connection conn = null;
	// 2. query 실행 객체
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select 결과 저장 객체
	public ResultSet rs = null;
	// 4. insert / delete / update 결과 저장 변수
	public int r = 0;

	/** 그 외 필요한 객체, 변수 선언 **/
	public String navercafe = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	// 내부에서 처리하고 싶다면 private을 사용
	public DataBaseClass(String navercafe) { // main()으로 부터 DB이름 전달받는 생성자
		this.navercafe = navercafe;
	}

	/** 1. mySQL server에 접속하는 메서드 선언 **/
	public void connect_navercafe() {
		try {
			// 1. mySQL 드라이버 로드
			Class.forName(this.DRIVER_NAME);

			// 2. 사용할 데이터베이스에 접속
			String uri = this.DB_URL + this.navercafe;
			this.conn = DriverManager.getConnection(uri, this.ADMIN_ID, this.ADMIN_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("CONNECT ERR : " + e.getMessage());
		}
	}

	/** 2. table의 전체 레코드 조회 메서드 선언 **/
	public void selectAll() {
		// 1. query 생성
		String query = "select * from member";

		try {
			// 2. Statement 객체 생성
			this.stmt = this.conn.createStatement();

			// 3. query 실행
			this.rs = this.stmt.executeQuery(query);

			// 4. ResultSet 객체 내부 데이터 조회
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "_");
				System.out.print(rs.getString(2) + "_");
				System.out.println(rs.getString(3));
			} // while() END

		} catch (SQLException e) {
			System.out.println("STATEMENT ERR:" + e.getMessage());
		} finally { // 자원해제 : try 성공 => finally / try 오류 -> catch() 예외처리 => finally
			try {
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("SELECT CLOSE ERR:" + e.getMessage());
			}
		} // finally END
	} // selectAll() END

	/** 3. table의 총 레코드 수 확인 메서드 선언 **/
	public void countRecord() {
		// 1. query 선언
		String query = "select count(*) from member";

		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			this.rs.next();
			System.out.println(this.rs.getInt(1));
		} catch (SQLException e) {
			System.out.println("COUNT(*) ERR: " + e.getMessage());
		} finally {
			try {
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("COUNT(*)CLOSE ERR:" + e.getMessage());
			}
		} // finally END

	}// countRecord END

	// 사용자가 입력한 id를 전달 받음 매개변수
	/** 4. 중복 아이디 확인 메서드 확인**/
	public void duplicateID(String ID) {
			//1. query 선언
			//memeber 테이블로 부터 전달된 id 를 전달 받음
			String query ="select id from member where id=?";
					
			try {	
				this.pstmt=conn.prepareStatement(query); //생성시 query 필요
				this.pstmt.setString(1, ID);
				this.rs=this.pstmt.executeQuery(); //실행시 query 없음..
				if(rs.next()) {
					System.out.println("중복된 아이디입니다.");
				} else {
					System.out.println("사용 가능한 아이디입니다.");
				}
				
				
			}catch(SQLException e) {
				System.out.println("duplicate() ERR:"+ e.getMessage());
			} finally {
				try {
					rs.close();
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("duplicate() CLOSE ERR:"+e.getMessage());
			}
		}	//finally END
	} //duplicate() END

	/** 5. 입력받은  id와 pw를 테이블에 추가(삽입) 하는 메서드 선언**/
	public void insertTable(String id, String pw) {
		//1.query 선언
		String query="insert into member (id, pw) values (?,?)";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r=this.pstmt.executeUpdate();
			if(r>0) {
				System.out.println("성공적으로 삽입 되었습니다.");
			} 
		} catch (SQLException e) {
			System.out.println("insertTable() ERR:"+e.getMessage());
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				System.out.println("insertTable() CLOSE ERR: "+e.getMessage());
			}
		}
	}

	/** 6. no 필드값을 이용하여 id, pw 필드의 값을 수정하는 메서드 선언 **/
	public void updateTable(String id, String pw, int no) {
		// 1. query 선언						대입				같다
		String query="update member set id=?, pw=? where no=?";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.pstmt.setInt(3, no);
			this.r=this.pstmt.executeUpdate();
			
			if(r>0) {
				System.out.println("수정 성공!!!");
			} else {
				System.out.println("수정 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println("updateTable() ERR:"+e.getMessage());
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				System.out.println("updateTable CLOSE ERR");
			}
		} //finally END
		
	}

	/** 7. no 필드값을 이용하여 레코드를 삭제하는 메서드 선언 **/
	public void deleteRecord(int no) {
		//1. query 선언
		String query = "delete from member where no=?";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setInt(1, no);
			this.r=this.pstmt.executeUpdate();
			if(this.r>0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패!!");
			}
		} catch (SQLException e) {
			System.out.println("deleteRecord ERR : "+e.getMessage());
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				System.out.println("deleteRecord() CLOSE ERR :"+e.getMessage());				
			}
		}
	}
}