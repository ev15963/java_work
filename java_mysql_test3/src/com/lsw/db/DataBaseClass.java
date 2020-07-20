package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lsw.obj.DataClass;
import com.lsw.obj.ObjectClass;

public class DataBaseClass {
	/** database 관련 상수 선언 **/
	// 1. mySQL 드라이버 이름
	public final String driver_name= "com.mysql.jdbc.driver";
	// 2. mySQL Server URL
	public final String DB_URL= "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String Admin_ID="root";
	// 4. mySQL Admin Password
	public final String Admin_PW="1234";

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
		// 1. mySQL 드라이버 로드
		Class.forName(this.driver_name)
	}

	/** 2. table의 전체 레코드 조회 메서드 선언 **/
	public void selectAll() {
		// 1. query 생성
		String query = "select * from company";
		
		// 2. Statement 객체 생성
		try {
			this.stmt=this.conn.createStatement();
			
			// 3. query 실행
			this.rs=this.stmt.executeQuery(query);
			// 4. ResultSet 객체 내부 데이터를 ArrayList에 객체로  추가
			ObjectClass oj = null;
			while(rs.next()) {
				oj=new ObjectClass(rs.getString(1), rs.getInt(2), rs.getInt(3),
						rs.getString(4),rs.getInt(5),rs.getString(6));
				DataClass.company.add(oj);
				oj = null;
			}
		} catch (SQLException e) {
			System.out.println("STATEMENT ERR"+e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("STATEMENT close ERR"+e.getMessage());
			}
			
		}
	} // selectAll() END

	/** 3. table의 총 레코드 수 확인 메서드 선언 **/
	public void countRecord() {
		// 1. query 선언
		String query = "select count(*) from company";

		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query);
			this.rs.next();
			System.out.println(this.rs.getInt(1));
		} catch (SQLException e) {
			System.out.println("count(*) ERR:"+e.getMessage());
		} finally {
			try {
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("count(*)close()ERR:"+e.getMessage());
			}
		}

	}// countRecord END

	// 사용자가 입력한 id를 전달 받음 매개변수
	/** 4. 중복 아이디 확인 메서드 확인**/
	public void duplicateID(String ID) {
			//1. query 선언
		//memeber 테이블로 부터 전달된 id 를 전달 받음
		String query = "select id from member where id=?";
		
		try {
			this.pstmt=conn.prepareStatement(query);
			this.pstmt.setString(1,ID);
			this.rs=this.pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("중복된 아이디입니다.");
			} else {
				System.out.println("사용가능한 아이디입니다.");
			}
		} catch (SQLException e) {
			System.out.println("duplicate err:"+e.getMessage());
		} finally {
				try {
					rs.close();
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("duplicate close err"+e.getMessage());
			}
		}
			
	} //duplicate() END

	/** 5. 입력받은  id와 pw를 테이블에 추가(삽입) 하는 메서드 선언**/
	public void insertTable(String id, String pw) {
		//1.query 선언
		String query = "insert into company (id, pw) values (?,?)";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r=this.pstmt.executeUpdate();
			if(r>0) {
				System.out.println("성공으로 삽입되었습니다.");
			}
		} catch (SQLException e) {
			System.out.println("insert error"+e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("insert close"+e.getMessage());
			}
		}
	}

	/** 6. no 필드값을 이용하여 id, pw 필드의 값을 수정하는 메서드 선언 **/
	public void updateTable(String id, String pw, int no) {
		// 1. query 선언						대입				같다
		
		
	}

	/** 7. no 필드값을 이용하여 레코드를 삭제하는 메서드 선언 **/
	public void deleteRecord(int no) {
		//1. query 선언
		
	}

	/** 각 자원들을 해제하는 메서드 Overloading **/
	public void userClose(ResultSet rs, Statement stmt) {
		
	}//userClose() END
	
	/** 각 자원들을 해제하는 메서드 Overloading **/
	public void userClose(ResultSet rs, PreparedStatement pstmt) {
		
	}//userClose() END
	
	/** 각 자원들을 해제하는 메서드 Overloading **/
	public void userClose(PreparedStatement pstmt) {
		
	}//userClose() END
	
	/** 각 자원들을 해제하는 메서드 Overloading **/
	public void userClose() {
		
	}//userClose() END
}