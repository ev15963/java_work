package com.freeflux;

/** �۾� �޼���鸸 �����ϴ� Ŭ���� **/
public class MethodClass {
	public static DataClass dc = null;
	
	public MethodClass() {
		
	}
	/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ���� **/
	public static void createObject() {
		dc = new DataClass();
	}
// createObject() END

	/**
	 * 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ��
	 * @param t 
	 * 
	 * @return
	 **/
	// DataClass��ü�� takes�迭 ������ �� take ���� ���� ���ϸ� �˻�(�迭�� �̾ƶ�)
	public static void searchStudentID() {
		dc.initTakes();
		for (int i=0;i<dc.tk.length;i++) {
			System.out.println(dc.tk[i].tkGrade);
		}

		

	} // searchStudentID() END : String t / String temp �Ҹ�

	/**�й� �ߺ� ���� �޼��� ȣ��**/
	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static void searchStudentInfo() { 
		
	} // searchStudentInfo() END

	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static void convertDepartmentID() {

	}

	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	public static void printResult() {

	}
} // MethodClass END
