package com.lsw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {
	/** database ���� ��� ���� **/
	// 1. mySQL ����̹� �̸�
	public final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	// 2. mySQL Server URL
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String ADMIN_ID = "root";
	// 4. mySQL Admin Password
	public final String ADMIN_PW = "1234";

	/** database ���� ��ü ���� **/
	// 1. �����ͺ��̽� ����
	public Connection conn = null;
	// 2. query ���� ��ü
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	// 3. select ��� ���� ��ü
	public ResultSet rs = null;
	// 4. insert / delete / update ��� ���� ����
	public int r = 0;

	/** �� �� �ʿ��� ��ü, ���� ���� **/
	public String navercafe = null;

	public DataBaseClass() {
		// TODO Auto-generated constructor stub
	}

	// ���ο��� ó���ϰ� �ʹٸ� private�� ���
	public DataBaseClass(String navercafe) { // main()���� ���� DB�̸� ���޹޴� ������
		this.navercafe = navercafe;
	}

	/** 1. mySQL server�� �����ϴ� �޼��� ���� **/
	public void connect_navercafe() {
		try {
			// 1. mySQL ����̹� �ε�
			Class.forName(this.DRIVER_NAME);

			// 2. ����� �����ͺ��̽��� ����
			String uri = this.DB_URL + this.navercafe;
			this.conn = DriverManager.getConnection(uri, this.ADMIN_ID, this.ADMIN_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("CONNECT ERR : " + e.getMessage());
		}
	}

	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� **/
	public void selectAll() {
		// 1. query ����
		String query = "select * from member";

		try {
			// 2. Statement ��ü ����
			this.stmt = this.conn.createStatement();

			// 3. query ����
			this.rs = this.stmt.executeQuery(query);

			// 4. ResultSet ��ü ���� ������ ��ȸ
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "_");
				System.out.print(rs.getString(2) + "_");
				System.out.println(rs.getString(3));
			} // while() END

		} catch (SQLException e) {
			System.out.println("STATEMENT ERR:" + e.getMessage());
		} finally { // �ڿ����� : try ���� => finally / try ���� -> catch() ����ó�� => finally
			try {
				this.rs.close();
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("SELECT CLOSE ERR:" + e.getMessage());
			}
		} // finally END
	} // selectAll() END

	/** 3. table�� �� ���ڵ� �� Ȯ�� �޼��� ���� **/
	public void countRecord() {
		// 1. query ����
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

	// ����ڰ� �Է��� id�� ���� ���� �Ű�����
	/** 4. �ߺ� ���̵� Ȯ�� �޼��� Ȯ��**/
	public void duplicateID(String ID) {
			//1. query ����
			//memeber ���̺�� ���� ���޵� id �� ���� ����
			String query ="select id from member where id=?";
					
			try {	
				this.pstmt=conn.prepareStatement(query); //������ query �ʿ�
				this.pstmt.setString(1, ID);
				this.rs=this.pstmt.executeQuery(); //����� query ����..
				if(rs.next()) {
					System.out.println("�ߺ��� ���̵��Դϴ�.");
				} else {
					System.out.println("��� ������ ���̵��Դϴ�.");
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

	/** 5. �Է¹���  id�� pw�� ���̺� �߰�(����) �ϴ� �޼��� ����**/
	public void insertTable(String id, String pw) {
		//1.query ����
		String query="insert into member (id, pw) values (?,?)";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r=this.pstmt.executeUpdate();
			if(r>0) {
				System.out.println("���������� ���� �Ǿ����ϴ�.");
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

	/** 6. no �ʵ尪�� �̿��Ͽ� id, pw �ʵ��� ���� �����ϴ� �޼��� ���� **/
	public void updateTable(String id, String pw, int no) {
		// 1. query ����						����				����
		String query="update member set id=?, pw=? where no=?";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.pstmt.setInt(3, no);
			this.r=this.pstmt.executeUpdate();
			
			if(r>0) {
				System.out.println("���� ����!!!");
			} else {
				System.out.println("���� ����!!!");
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

	/** 7. no �ʵ尪�� �̿��Ͽ� ���ڵ带 �����ϴ� �޼��� ���� **/
	public void deleteRecord(int no) {
		//1. query ����
		String query = "delete from member where no=?";
		
		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setInt(1, no);
			this.r=this.pstmt.executeUpdate();
			if(this.r>0) {
				System.out.println("��������");
			} else {
				System.out.println("��������!!");
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