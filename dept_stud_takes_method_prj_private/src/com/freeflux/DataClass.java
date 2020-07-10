package com.freeflux;

import java.util.ArrayList;

/**  �а� �� �л��������� �����ϴ� Ŭ���� **/
public class DataClass {
	ArrayList<Department> depts= new ArrayList<Department>(); // �а����� �迭
	ArrayList<Student> students=new ArrayList<Student>();			// �л����� �迭
	ArrayList<Takes> takes=new ArrayList<Takes>();					// �������� �迭
	
	public DataClass() { // �⺻ ������
	} // ������ END

	/** �а����� �ʱ� ������ �޼��� **/
	public void initDepartments() {
		depts.add(new Department(920, "��ǻ�Ͱ��а�", "201ȣ"));
		depts.add(new Department(923, "������а�", "207ȣ"));
		depts.add(new Department(925, "���ڰ��а�", "308ȣ"));
	}
	/** �л����� �ʱ� ������ �޼��� **/
	public void initStudents() {
		students.add(new Student("1292001", "900424-1825409", "�豤��", 3, "����", 920));
		students.add(new Student("1292002", "900305-1730021", "������", 3, "����", 920));
		students.add(new Student("1292003", "891021-2308302", "������", 4, "����", 920));
		students.add(new Student("1292301", "890902-2704012", "������", 2, "�뱸", 923));
		students.add(new Student("1292303", "910715-1524390", "�ڱ���", 3, "����", 923));
		students.add(new Student("1292305", "921011-1809003", "�����", 4, "�λ�", 923));
		students.add(new Student("1292501", "900825-1506390", "��ö��", 3, "����", 925));
		students.add(new Student("1292502", "911011-1809003", "���¼�", 3, "����", 925));
	}
	
	/** �������� �ʱ� ������ �޼��� **/
	public void initTakes() {
		takes.add(new Takes("1292001", "C101-01", "B+"));
		takes.add(new Takes("1292001", "C103-01", "A+"));
		takes.add(new Takes("1292001", "C301-01", "A"));
		takes.add(new Takes("1292002", "C102-01", "A"));
		takes.add(new Takes("1292002", "C103-01", "B+"));
		takes.add(new Takes("1292002", "C502-01", "C+"));
		takes.add(new Takes("1292003", "C103-02", "B"));
		takes.add(new Takes("1292003", "C501-02", "A+"));
		takes.add(new Takes("1292301", "C102-01", "C+"));
		takes.add(new Takes("1292303", "C102-01", "C"));
		takes.add(new Takes("1292303", "C103-02", "B+"));
		takes.add(new Takes("1292303", "C501-01", "A+"));
	}
	
} // class END
