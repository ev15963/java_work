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

	/** database ���� ��� ���� */
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final String DRIVER_URL = "jdbc:mysql://localhost:3306/";
	public final String DRIVER_ID = "root";
	public final String DRIVER_PW = "1234";
	/** database ���� ��ü ���� */
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public Connection conn = null;
	/** �� �� �ʿ��� ��ü, ���� ���� */
	public String dbname = "cafedb";

	public DataBaseClass() { // �⺻ ������
		// TODO Auto-generated constructor stub
	}

	/** 1. mysql server�� �����ϴ� �޼��� ���� **/
	public void connect_db() {
		try {

			Class.forName(this.DRIVER_NAME);
			String url = this.DRIVER_URL + this.dbname; //dbname �Է�
			conn = DriverManager.getConnection(url, DRIVER_ID, DRIVER_PW);
			System.out.println(dbname + "����̹� ���� ����");

		} catch (ClassNotFoundException e) {
			System.out.println("connect_db err" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("getConn err" + e.getMessage());
		}
	} // connect_db() END

	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� **/
	// ��� : 1. �ʵ�� ��� / 2. TableView�� ������ ���
	public void selectAll(String table_name) {
		String query = "select * from " + table_name;

		try {
			this.stmt = this.conn.createStatement();

			this.rs = this.stmt.executeQuery(query);

			// ��ȸ�� �ʵ忡 ���õ� metadata ���� ��ü
			ResultSetMetaData rsmd = rs.getMetaData();

			// ��ȸ�� �ʵ��� ���� Ȯ��
			int field_count = rsmd.getColumnCount();

			// ��ȸ�� �ʵ���� �����ϱ� ���� String[]�迭
			// String[] field_names = new String[field_count];
			MainView.field_names = new String[field_count]; //MainView �߰�

			// �ʵ�� ���� �迭�� ������ �ʵ���� ����
			for (int i = 0; i < field_count; i++) {
				MainView.field_names[i] = rsmd.getColumnName(i + 1); //getColumnName ��Ÿ
			}

			// ����� �ʵ�� Ȯ�� �ڵ�
			System.out.print("FIELD NAMES : " + Arrays.toString(MainView.field_names));

			/** 2. TableView�� ������ ����� ���� ������ Ȯ�� **/
			System.out.println("SELECT RECORDS");

		
				while (rs.next()) {
				// ��ȸ�� ���ڵ��� �� �ʵ� ���� ���
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
		//table�� �߰��� ������ �غ�
		//ArrayList�� ������ ������ ����ϴ� Java FX�� observableArrayList	
		
		//ǥ���·� �����͸� ����ϴ� component
		TableView<CafeMember> table = new TableView<CafeMember>();
		//table�� �߰��� ������ �غ�
		
//		TableColumn<CafeMember, String> seqno
		
		
		//ArrayList�� ������ ������ ����ϴ� Java FX�� observableArrayList	
		ObservableList<CafeMember> CM = FXCollections.observableArrayList();
				
//		CM.add(new CafeMember(0, "rexratm","�̵���","���", "2020.07.01", "2020.07.28", 79, 0, 0, "��"));
		//table�� ������ �߰�
		table.setItems(CM);
		
		//table�� �� �߰�
		table.getColumns();
		
		DataClass.members.clear(); //ȭ����ȯ�� �ٽ� �߰��Ǵ� �� ����
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
	/**3. TableView�� ������ ����� ���� ������ �غ� */
	
	
	/** �� �ڿ����� ��ü�ϴ� �޼��� */
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
