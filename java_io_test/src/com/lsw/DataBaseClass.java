package com.lsw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	/**database 관련 상수 선언 */
	public final String DRIVER_NAME="com.mysql.jdbc.Driver";
	public final String DRIVER_URL="jdbc:mysql://localhost:3306/";
	public final String DRIVER_ID="root";
	public final String DRIVER_PW="1234";
	/**database 관련 객체 선언 */
	public Statement stmt =null;
	public PreparedStatement pstmt =null;
	public ResultSet rs =null;
	public Connection conn = null;
	/**그 외 필요한 객체, 변수 선언 */
	public String dbname="cafedb";
	
	public DataBaseClass() { //기본 생성자
		// TODO Auto-generated constructor stub
	}
	
	/** 1. mysql server에 접속하는 메서드 선언 **/
	public void connect_db() {
		try {
			Class.forName(this.DRIVER_NAME);
			String url=this.DRIVER_URL+this.DRIVER_NAME;
			try {
				conn = DriverManager.getConnection(DRIVER_URL, DRIVER_ID, DRIVER_PW);
				System.out.println("드라이버 접속 성공");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("connect_db err"+e.getMessage());
		}
	} //connect_db() END
	
	/** 2. table의 전체 레코드 조회 메서드 선언 **/
	//결과 : 1. 필드명 출력 / 2. TableView에 데이터 출력
	public void selectAll() {
		
	} //selectAll() END
	
	/** 각 자원들을 해체하는 메서드 */
	public void userClose() {
		
	} //userClose() END

}
