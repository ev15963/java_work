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

import com.lsw.obj.CafeMember;
import com.lsw.obj.DataClass;
import com.lsw.ui.MainView;
import com.lsw.util.ChangeEncoding;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
		
		/////////////////////////////
		//table에 추가할 데이터 준비
		//ArrayList와 동일한 역할을 담당하는 Java FX의 observableArrayList	
		
		//표형태로 데이터를 출력하는 component
		TableView<CafeMember> table = new TableView<CafeMember>();
		//table에 추가할 데이터 준비
		
//		TableColumn<CafeMember, String> seqno
		
		
		//ArrayList와 동일한 역할을 담당하는 Java FX의 observableArrayList	
		ObservableList<CafeMember> CM = FXCollections.observableArrayList();
				
//		CM.add(new CafeMember(0, "rexratm","이동후","멤버", "2020.07.01", "2020.07.28", 79, 0, 0, "남"));
		//table에 데이터 추가
		table.setItems(CM);
		
		//table에 열 추가
		table.getColumns();
		
		DataClass.members.clear(); //화면전환시 다시 추가되는 걸 방지
		CafeMember members = null;
		while(rs.next()) {
			members=new CafeMember();
			members.setSeqno(rs.getString("seqno"));
			members.setNickname(ChangeEncoding.mysqlToJava(rs.getString("nickname")));
			members.setName(ChangeEncoding.mysqlToJava(rs.getString("name")));
			members.setRating(rs.getString("rating"));
			members.setRegidate(rs.getString("regidate"));
			members.setLastdate(rs.getString("lastdate"));
			members.setVisitno(rs.getString("visino"));
			members.setPostno(rs.getString("postno"));
			members.setReplyno(rs.getString("replyno"));
			members.setGender(ChangeEncoding.mysqlToJava(rs.getString("Gender")));
			DataClass.members.add(members);
			members = null;
		}

		
		
		
	} // selectAll() END
}
	/**3. TableView에 데이터 출력을 위한 데이터 준비 */
	
	
	/** 각 자원들을 해체하는 메서드 */
//	public void userClose(ResultSet rs) {
//		try {
//			rs.close();
//		} catch (SQLException e) {
//			System.err.println("rs err" + e.getMessage());
//		}
//	} // userClose() END
//
//	public void userClose(ResultSet rs, Statement stmt) {
//		try {
//			rs.close();
//			stmt.close();
//		} catch (SQLException e) {
//			System.err.println("rs err stmt err" + e.getMessage());
//		}
//	} // userClose() END
//
//	public void userClose(ResultSet rs, PreparedStatement pstmt) {
//		try {
//			rs.close();
//			pstmt.close();
//		} catch (SQLException e) {
//			System.err.println("rs err pstmt err" + e.getMessage());
//		}
//	} // userClose() END
//
//	public void userClose(Statement stmt) {
//		try {
//			stmt.close();
//		} catch (SQLException e) {
//			System.err.println("stmt err" + e.getMessage());
//		}
//	} // userClose() END
//		// public void userClose(ResultSet rs) {
//		// try {
//		// rs.close();
//		// } catch (SQLException e) {
//		// System.err.println("rs err"+e.getMessage());
//		// }
//		// } //userClose() END
//
//}
