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
	public final String DRIVER = "com.mysql.jdbc.Driver"; // 드라이버명
	// 드라이버명은 제품마다 다름..
	// 해당 제품 사이트에서 제공

	public final String DBURL = "jdbc:mysql://localhost:3306/"; // 기본URL
	// localhost와 ip : 127.0.0.1 (추후 클라이언트 주소로 변경)
	// 3306: mySQL의 데이터 입출력 지원 포트번호
	// 위의 포트번호는 제품마다 다름 (오라클은 8080이 기본 포트번호)

	public final String DBID = "root"; // 관리자 ID
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

	/** 조회 메서드 (전체 조회 : select * from 테이블명) **/

	// q1. 사원의 이름과 급여와 입사일자만을 출력하기
	public void select_empName_sale(String empName, String sale) {
		String query = "select " + empName + ", " + sale + " from employee";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String name = rs.getString("empName");
				String unit1 = ChangeEncoding.toUnicode(name); // 인코딩
				String unit2 = rs.getString("sale");
				System.out.println(unit1 + " : " + unit2);
			}
			// this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("select_empName_sale err: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("select_empName_sale close err: " + e.getMessage());
			}
		}

	}

	// q2. 직급이 중복되지 않고 한 번씩 나열하기
	public void wlrrmq(String employee) {
		String query = "select distinct job from "+employee;

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String name = rs.getString("job");
				String unit1 = ChangeEncoding.toUnicode(name); // 인코딩
				System.out.println(unit1);
			}
			// this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("wlrrmq err: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("wlrrmq close err: " + e.getMessage());
			}
		}

	}
	
	
	// q3. 급여가 300 이하인 사원의 사원번호, 사원 이름, 급여를 출력하기
	public void sale_300_low(String employee) {
		String query = "select empNo, empName, sale from " + employee + " where sale<=300";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // 인코딩
				String unit3 = rs.getString("sale");
				System.out.println(unit1 + " : " + unit2 + " : " + unit3);
			}
			// this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("sale_300_low err: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("sale_300_low close err: " + e.getMessage());
			}
		}

	}

	// q4. 이름이 “오지호”인 사원의 사원번호, 사원명, 급여를 출력하기

	public void mr_oh(String empName) {
		String query = "select empNo, empName, sale from employee where "+empName+" like CONCAT(?,'%')";
		

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("오"));
			this.rs = this.pstmt.executeQuery();

			while (rs.next()) {
				String temp = "";
				temp = rs.getString(1);
				System.out.print(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(2);
				System.out.print(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(3);
				System.out.println(ChangeEncoding.toUnicode(temp));
			}

		} catch (SQLException e) {
			System.out.println("mr_oh() err : " + e.getMessage());
		}
	}

	// q5. 급여가 250, 300, 500인 사원들의 사원 번호와 사원명과 급여를 검색하기
	public void rmqdurjator(String employee) {
		String query = "select empNo, empName from "+employee+" where sale=250 or sale=300 or sale=500";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // 인코딩
				System.out.println(unit1 + " : " + unit2);
			}
			// this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("rmqdurjator err: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("rmqdurjator close err: " + e.getMessage());
			}
		}
	}
	

	// q6. 급여가 250, 300, 500이 아닌 사원들을 검색하기
	public void rmqdurjator2(String employee) {
		String query = "select empNo, empName from "+employee+" where sale!=250 and sale!=300 and sale!=500";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // 인코딩
				System.out.println(unit1 + " : " + unit2);
			}
			// this.rs.next();
			// System.out.println();
		} catch (SQLException e) {
			System.out.println("rmqdurjator err: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("rmqdurjator close err: " + e.getMessage());
			}
		}
	}
	

	// q7. LIKE를 사용하여 사원들 중에서 이름이 “김”으로 시작하는 사람과 이름 중에 “기”를 포함하는 사원의 사원번호와 사원이름을 출력
	// 하기
	public void kimKi(String employee) {
		String query = "select empNo, empName from "+employee+" where empName like CONCAT(?,'%') or empName like CONCAT('%', ?,'%')";
		
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("김"));
			this.pstmt.setString(2, ChangeEncoding.toLatin("기"));
			this.rs = this.pstmt.executeQuery();

			while (rs.next()) {
				String temp = "";
				temp = rs.getString(1);
				System.out.print(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(2);
				System.out.println(ChangeEncoding.toUnicode(temp));
			}

		} catch (SQLException e) {
			System.out.println("mr_oh() err : " + e.getMessage());
		}
	}
	
	// q8. 사원 테이블에서 최근 입사한 직원 순으로 사원번호, 사원명, 직급, 입사일 컬럼만 출력하기
	public void q8(String employee) {
		String query = "select empNo, empName, job, hireDate from "+employee+" order by hireDate desc";
		
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!

			while (rs.next()) {
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // 인코딩
				String name2 = rs.getString("job");
				String unit3 = ChangeEncoding.toUnicode(name2); // 인코딩
				String unit4 = rs.getString("hireDate");
//				System.out.println("unit42222"+unit4);
				System.out.println(unit1 + "	" + unit2 + "	" + unit3+ "	" + unit4);
			}

		} catch (SQLException e) {
			System.out.println("q8() err : " + e.getMessage());
		}
	}
	
	// q9. 부서 번호가 빠른 사원부터 출력하되 같은 부서내의 사원을 출력할 경우, 입사한지 가장 오래된 사원부터 출력하기
	public void q9(String employee) {
		String query = "select * from "+employee+" order by deptNo asc, hireDate asc;";
		
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()는 객체 생성시, query문을 갖지 못함!!!
			this.rs = this.stmt.executeQuery(query);
			// 실제 query 실행요청 시, 실행할 query문을 mySQL에 전달!!!

			while (rs.next()) {
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // 인코딩
				String name2 = rs.getString("job");
				String unit3 = ChangeEncoding.toUnicode(name2); // 인코딩
				String unit4 = rs.getString("mgr");
				String unit5 = rs.getString("hireDate");
				String unit6 = rs.getString("sale");
				String unit7 = rs.getString("mgr");
				String unit8 = rs.getString("mgr");
//				System.out.println("unit42222"+unit4);
				System.out.println(unit1 + "	" + unit2 + "	" + unit3+ "	" + unit4+ "	" 
						+unit5 + "	" + unit6 + "	" + unit7+ "	" + unit8+ "	");
			}

		} catch (SQLException e) {
			System.out.println("q9() err : " + e.getMessage());
		}
	}
	
	
	
	/** 테이블에 데이터추가 (삽입)하는메소드 **/
	// insert into employee (empNo, empName, job, mgr)
	// hireDate, sale, commission, detNo)
	// values(1001, "김사랑", "사원", 13, "2007-03-01", 300, 0, 20);
	// ? ? ? ? ? ? ? ?
	public void insertRecord() {
		String query = "insert into employee ";
		query += "(empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
		query += " values (?,?,?,?,?,?,?,?)"; // 필드의 갯수 만큼 ? 필요
		// empNo는 primary key 이기 때문에 중복업시 추가될 수 없다.
		try {
			// prepareStatement()는 객체생성시, query문을 먼저 전달해야한다.
			this.pstmt = this.conn.prepareStatement(query);
			// query문 내부에 ? 가 있을경우
			// 반드시 ?에 해당항하는 값을 설정!!!
			// 여러 개의 ?가 있을경우 ?는 1부터 지정
			// ?의 갯수보다 많은 값 또는 적은 값을 설정할 경우 오류발생!!!
			// 또한 해당 필드와 타입이 맞이 않을 경우에도 오류발생!!
			this.pstmt.setInt(1, 1015);
			this.pstmt.setString(2, ChangeEncoding.toLatin("강기훈"));
			this.pstmt.setString(3, ChangeEncoding.toLatin("강사"));
			this.pstmt.setInt(4, 12);
			this.pstmt.setString(5, "2020-07-21");
			this.pstmt.setInt(6, 100);
			this.pstmt.setInt(7, 0);
			this.pstmt.setInt(8, 20);

			this.result = this.pstmt.executeUpdate();
			// 객체 생성시 미리 query문을 전달했기 때문에
			// 실행시 query문 전달하지 않음!!
			// executeUpdate()는 실행후 결과 값을 정수로 반환
			// 실행한 내용이 없을 경우에는 0을 반환..
			// 결과 값을 이용하면 실행 여부를 확인할 수 없음
			System.out.println(this.result + "개가 추가되었습니다.");

		} catch (SQLException e) {
			System.out.println("insertRecord err:" + e.getMessage());
		}
	}

	/** 검색어를 이용한 검색 메서드 선언 **/
	// where empName like '%이%'를 아래와 같이 변경해야 가능
	// where empName like CONCAT('%', ?, '%')
	// 참고 : CONCAT은 concatenate(연결, 잇다. 연쇄..)의 약자

	public void searchWord(String table_name) {
		String query = "select empName, job from ";
		query += table_name;
		query += " where empName like CONCAT('%', ?,'%')";

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("이"));
			this.rs = this.pstmt.executeQuery();

			while (rs.next()) {
				String temp = "";
				temp = rs.getString(1);
				System.out.println(ChangeEncoding.toUnicode(temp + " : "));
				temp = rs.getString(2);
				System.out.print(ChangeEncoding.toUnicode(temp));
			}

		} catch (SQLException e) {
			System.out.println("searchWord() err : " + e.getMessage());
		}
	}

}
