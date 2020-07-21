package com.freeflux.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.util.ChangeEncoding;

import java.sql.DriverManager;

public class DataBaseClass {
	/** ��� ���� **/
	public final String DRIVER = "com.mysql.jdbc.Driver"; // ����̹���
	// ����̹����� ��ǰ���� �ٸ�..
	// �ش� ��ǰ ����Ʈ���� ����

	public final String DBURL = "jdbc:mysql://localhost:3306/"; // �⺻URL
	// localhost�� ip : 127.0.0.1 (���� Ŭ���̾�Ʈ �ּҷ� ����)
	// 3306: mySQL�� ������ ����� ���� ��Ʈ��ȣ
	// ���� ��Ʈ��ȣ�� ��ǰ���� �ٸ� (����Ŭ�� 8080�� �⺻ ��Ʈ��ȣ)

	public final String DBID = "root"; // ������ ID
	// mySQL 5.1�� "root"�� ����
	// ����Ŭ������ ����� ���� (��, DB��)���� �����
	// ���� : �ұԸ� ��ü�� APM�� �ַ� ��� (Apach/ PHP / MySQL)

	/** DB ���� ���� �� ��ü ���� **/
	// java.sql ��Ű�� ���� Ŭ������
	public String dbname = ""; // ����� �����ͺ��̽���
	public Connection conn = null; // ���� ���� ��ü �ʼ�
	public Statement stmt = null; // ��ü ��ȸ select * from ~
	public PreparedStatement pstmt = null; // ���̺� ������ ������ ����
	public ResultSet rs = null; // select�� ��� ��ü ����
	public int result = 0; // insert/update/delete ��� ����

	public DataBaseClass() {

	}

	/** ����̹� �ε� �� �����ͺ��̽� ���� **/
	public void connectMySQL(String db_name) {
		this.dbname = db_name;
		try {
			Class.forName(this.DRIVER);
			// com.mysql.jdbc: ��Ű����
			// Driver : Driver.class

			// getConnection("���� URL+DB��", "������ID", "������PW");
			String url = this.DBURL + this.dbname;
			try {
				this.conn = DriverManager.getConnection(url, this.DBID, "1234");
			} catch (SQLException e) {
				System.out.println("����̹� ����" + e.getMessage());
			}
			// getConnection()�� db���� null�ƴ� �̻�,
			// db���� ��� ���ӿ� ������ �� �ֱ� ������ ���� �߻�����
			// ��, db���� ���� ��� , ��, �߸��Է����� ��쿡�� �����߻�!!
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER ERR:" + e.getMessage());
		}
	}

	/** ��ȸ �޼��� (��ü ��ȸ : select * from ���̺��) **/

	// q1. ����� �̸��� �޿��� �Ի����ڸ��� ����ϱ�
	public void select_empName_sale(String empName, String sale) {
		String query = "select " + empName + ", " + sale + " from employee";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String name = rs.getString("empName");
				String unit1 = ChangeEncoding.toUnicode(name); // ���ڵ�
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

	// q2. ������ �ߺ����� �ʰ� �� ���� �����ϱ�
	public void wlrrmq(String employee) {
		String query = "select distinct job from "+employee;

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String name = rs.getString("job");
				String unit1 = ChangeEncoding.toUnicode(name); // ���ڵ�
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
	
	
	// q3. �޿��� 300 ������ ����� �����ȣ, ��� �̸�, �޿��� ����ϱ�
	public void sale_300_low(String employee) {
		String query = "select empNo, empName, sale from " + employee + " where sale<=300";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // ���ڵ�
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

	// q4. �̸��� ������ȣ���� ����� �����ȣ, �����, �޿��� ����ϱ�

	public void mr_oh(String empName) {
		String query = "select empNo, empName, sale from employee where "+empName+" like CONCAT(?,'%')";
		

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
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

	// q5. �޿��� 250, 300, 500�� ������� ��� ��ȣ�� ������ �޿��� �˻��ϱ�
	public void rmqdurjator(String employee) {
		String query = "select empNo, empName from "+employee+" where sale=250 or sale=300 or sale=500";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // ���ڵ�
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
	

	// q6. �޿��� 250, 300, 500�� �ƴ� ������� �˻��ϱ�
	public void rmqdurjator2(String employee) {
		String query = "select empNo, empName from "+employee+" where sale!=250 and sale!=300 and sale!=500";

		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!
			while (rs.next()) {
				// System.out.println(rs.getString("empName"));
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // ���ڵ�
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
	

	// q7. LIKE�� ����Ͽ� ����� �߿��� �̸��� ���衱���� �����ϴ� ����� �̸� �߿� ���⡱�� �����ϴ� ����� �����ȣ�� ����̸��� ���
	// �ϱ�
	public void kimKi(String employee) {
		String query = "select empNo, empName from "+employee+" where empName like CONCAT(?,'%') or empName like CONCAT('%', ?,'%')";
		
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
			this.pstmt.setString(2, ChangeEncoding.toLatin("��"));
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
	
	// q8. ��� ���̺��� �ֱ� �Ի��� ���� ������ �����ȣ, �����, ����, �Ի��� �÷��� ����ϱ�
	public void q8(String employee) {
		String query = "select empNo, empName, job, hireDate from "+employee+" order by hireDate desc";
		
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!

			while (rs.next()) {
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // ���ڵ�
				String name2 = rs.getString("job");
				String unit3 = ChangeEncoding.toUnicode(name2); // ���ڵ�
				String unit4 = rs.getString("hireDate");
//				System.out.println("unit42222"+unit4);
				System.out.println(unit1 + "	" + unit2 + "	" + unit3+ "	" + unit4);
			}

		} catch (SQLException e) {
			System.out.println("q8() err : " + e.getMessage());
		}
	}
	
	// q9. �μ� ��ȣ�� ���� ������� ����ϵ� ���� �μ����� ����� ����� ���, �Ի����� ���� ������ ������� ����ϱ�
	public void q9(String employee) {
		String query = "select * from "+employee+" order by deptNo asc, hireDate asc;";
		
		try {
			this.stmt = this.conn.createStatement();
			// createStatement()�� ��ü ������, query���� ���� ����!!!
			this.rs = this.stmt.executeQuery(query);
			// ���� query �����û ��, ������ query���� mySQL�� ����!!!

			while (rs.next()) {
				String unit1 = rs.getString("empNo");
				String name = rs.getString("empName");
				String unit2 = ChangeEncoding.toUnicode(name); // ���ڵ�
				String name2 = rs.getString("job");
				String unit3 = ChangeEncoding.toUnicode(name2); // ���ڵ�
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
	
	
	
	/** ���̺� �������߰� (����)�ϴ¸޼ҵ� **/
	// insert into employee (empNo, empName, job, mgr)
	// hireDate, sale, commission, detNo)
	// values(1001, "����", "���", 13, "2007-03-01", 300, 0, 20);
	// ? ? ? ? ? ? ? ?
	public void insertRecord() {
		String query = "insert into employee ";
		query += "(empNo, empName, job, mgr, hireDate, sale, commission, deptNo)";
		query += " values (?,?,?,?,?,?,?,?)"; // �ʵ��� ���� ��ŭ ? �ʿ�
		// empNo�� primary key �̱� ������ �ߺ����� �߰��� �� ����.
		try {
			// prepareStatement()�� ��ü������, query���� ���� �����ؾ��Ѵ�.
			this.pstmt = this.conn.prepareStatement(query);
			// query�� ���ο� ? �� �������
			// �ݵ�� ?�� �ش����ϴ� ���� ����!!!
			// ���� ���� ?�� ������� ?�� 1���� ����
			// ?�� �������� ���� �� �Ǵ� ���� ���� ������ ��� �����߻�!!!
			// ���� �ش� �ʵ�� Ÿ���� ���� ���� ��쿡�� �����߻�!!
			this.pstmt.setInt(1, 1015);
			this.pstmt.setString(2, ChangeEncoding.toLatin("������"));
			this.pstmt.setString(3, ChangeEncoding.toLatin("����"));
			this.pstmt.setInt(4, 12);
			this.pstmt.setString(5, "2020-07-21");
			this.pstmt.setInt(6, 100);
			this.pstmt.setInt(7, 0);
			this.pstmt.setInt(8, 20);

			this.result = this.pstmt.executeUpdate();
			// ��ü ������ �̸� query���� �����߱� ������
			// ����� query�� �������� ����!!
			// executeUpdate()�� ������ ��� ���� ������ ��ȯ
			// ������ ������ ���� ��쿡�� 0�� ��ȯ..
			// ��� ���� �̿��ϸ� ���� ���θ� Ȯ���� �� ����
			System.out.println(this.result + "���� �߰��Ǿ����ϴ�.");

		} catch (SQLException e) {
			System.out.println("insertRecord err:" + e.getMessage());
		}
	}

	/** �˻�� �̿��� �˻� �޼��� ���� **/
	// where empName like '%��%'�� �Ʒ��� ���� �����ؾ� ����
	// where empName like CONCAT('%', ?, '%')
	// ���� : CONCAT�� concatenate(����, �մ�. ����..)�� ����

	public void searchWord(String table_name) {
		String query = "select empName, job from ";
		query += table_name;
		query += " where empName like CONCAT('%', ?,'%')";

		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, ChangeEncoding.toLatin("��"));
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
