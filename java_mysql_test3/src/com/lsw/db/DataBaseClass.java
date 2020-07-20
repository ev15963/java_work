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
	/** database ���� ��� ���� **/
	// 1. mySQL ����̹� �̸�
	public final String driver_name= "com.mysql.jdbc.driver";
	// 2. mySQL Server URL
	public final String DB_URL= "jdbc:mysql://localhost:3306/";
	// 3. mySQL Admin ID
	public final String Admin_ID="root";
	// 4. mySQL Admin Password
	public final String Admin_PW="1234";

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
		// 1. mySQL ����̹� �ε�
		Class.forName(this.driver_name)
	}

	/** 2. table�� ��ü ���ڵ� ��ȸ �޼��� ���� **/
	public void selectAll() {
		// 1. query ����
		String query = "select * from company";
		
		// 2. Statement ��ü ����
		try {
			this.stmt=this.conn.createStatement();
			
			// 3. query ����
			this.rs=this.stmt.executeQuery(query);
			// 4. ResultSet ��ü ���� �����͸� ArrayList�� ��ü��  �߰�
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

	/** 3. table�� �� ���ڵ� �� Ȯ�� �޼��� ���� **/
	public void countRecord() {
		// 1. query ����
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

	// ����ڰ� �Է��� id�� ���� ���� �Ű�����
	/** 4. �ߺ� ���̵� Ȯ�� �޼��� Ȯ��**/
	public void duplicateID(String ID) {
			//1. query ����
		//memeber ���̺�� ���� ���޵� id �� ���� ����
		String query = "select id from member where id=?";
		
		try {
			this.pstmt=conn.prepareStatement(query);
			this.pstmt.setString(1,ID);
			this.rs=this.pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("�ߺ��� ���̵��Դϴ�.");
			} else {
				System.out.println("��밡���� ���̵��Դϴ�.");
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

	/** 5. �Է¹���  id�� pw�� ���̺� �߰�(����) �ϴ� �޼��� ����**/
	public void insertTable(String id, String pw) {
		//1.query ����
		String query = "insert into company (id, pw) values (?,?)";

		try {
			this.pstmt=this.conn.prepareStatement(query);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.r=this.pstmt.executeUpdate();
			if(r>0) {
				System.out.println("�������� ���ԵǾ����ϴ�.");
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

	/** 6. no �ʵ尪�� �̿��Ͽ� id, pw �ʵ��� ���� �����ϴ� �޼��� ���� **/
	public void updateTable(String id, String pw, int no) {
		// 1. query ����						����				����
		
		
	}

	/** 7. no �ʵ尪�� �̿��Ͽ� ���ڵ带 �����ϴ� �޼��� ���� **/
	public void deleteRecord(int no) {
		//1. query ����
		
	}

	/** �� �ڿ����� �����ϴ� �޼��� Overloading **/
	public void userClose(ResultSet rs, Statement stmt) {
		
	}//userClose() END
	
	/** �� �ڿ����� �����ϴ� �޼��� Overloading **/
	public void userClose(ResultSet rs, PreparedStatement pstmt) {
		
	}//userClose() END
	
	/** �� �ڿ����� �����ϴ� �޼��� Overloading **/
	public void userClose(PreparedStatement pstmt) {
		
	}//userClose() END
	
	/** �� �ڿ����� �����ϴ� �޼��� Overloading **/
	public void userClose() {
		
	}//userClose() END
}