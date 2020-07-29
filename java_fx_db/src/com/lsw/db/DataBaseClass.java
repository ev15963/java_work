package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.xml.ws.FaultAction;

import com.lsw.ui.MainView;
import com.lsw.util.ChangeEncoding;

public class DataBaseClass {

	/** database 관련 상수 선언 */
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final String DRIVER_URL = "jdbc:mysql://localhost:3306/";
	public final String DRIVER_ID = "root";
	public final String DRIVER_PW = "1234";
	/** database 관련 객체 선언 */
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public Connection conn = null;
	/** 그 외 필요한 객체, 변수 선언 */
	public String dbname = "cafedb";

	public DataBaseClass() { // 기본 생성자
		// TODO Auto-generated constructor stub
	}

	/** 1. mysql server에 접속하는 메서드 선언 **/
	public void connect_db() {
		try {

			Class.forName(this.DRIVER_NAME);
			String url = this.DRIVER_URL + this.dbname; //dbname 입력
			conn = DriverManager.getConnection(url, DRIVER_ID, DRIVER_PW);
			System.out.println(dbname + "드라이버 접속 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("connect_db err" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("getConn err" + e.getMessage());
		}
	} // connect_db() END

	/** 2. table의 전체 레코드 조회 메서드 선언 **/
	// 결과 : 1. 필드명 출력 / 2. TableView에 데이터 출력
	public void selectAll(String table_name) {
		String query = "select * from " + table_name;

		try {
			this.stmt = this.conn.createStatement();

			this.rs = this.stmt.executeQuery(query);

			// 조회된 필드에 관련된 metadata 정보 객체
			ResultSetMetaData rsmd = rs.getMetaData();

			// 조회된 필드의 개수 확인
			int field_count = rsmd.getColumnCount();

			// 조회된 필드명을 저장하기 위한 String[]배열
			// String[] field_names = new String[field_count];
			MainView.field_names = new String[field_count]; //MainView 추가

			// 필드명 저장 배열에 추출한 필드명을 대입
			for (int i = 0; i < field_count; i++) {
				MainView.field_names[i] = rsmd.getColumnName(i + 1); //getColumnName 오타
			}

			// 추출된 필드명 확인 코드
			System.out.print("FIELD NAMES : " + Arrays.toString(MainView.field_names));

			/** 2. TableView에 데이터 출력을 위한 데이터 확인 **/
			System.out.println("SELECT RECORDS");

		
				while (rs.next()) {
				// 조회된 레코드의 각 필드 값을 출력
				for (int r = 1; r < field_count; r++) {
					String temp = null;
						temp = ChangeEncoding.mysqlToJava(rs.getString(r+1));
					
					System.out.print(temp + "_");
				}
				System.out.println();
				
			}
			
			} catch (SQLException e) {
				System.err.println("selectAll() ERR :"+e.getMessage());
			}
		

	} // selectAll() END

	/** 각 자원들을 해체하는 메서드 */
	public void userClose(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.err.println("rs err" + e.getMessage());
		}
	} // userClose() END

	public void userClose(ResultSet rs, Statement stmt) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("rs err stmt err" + e.getMessage());
		}
	} // userClose() END

	public void userClose(ResultSet rs, PreparedStatement pstmt) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.err.println("rs err pstmt err" + e.getMessage());
		}
	} // userClose() END

	public void userClose(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.err.println("stmt err" + e.getMessage());
		}
	} // userClose() END
		// public void userClose(ResultSet rs) {
		// try {
		// rs.close();
		// } catch (SQLException e) {
		// System.err.println("rs err"+e.getMessage());
		// }
		// } //userClose() END

}
