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
	 * 
	 * @param t
	 * @return
	 * 
	 * @return
	 **/
	// DataClass��ü�� takes�迭 ������ �� take ���� ���� ���ϸ� �˻�(�迭�� �̾ƶ�)
	public static String searchStudentID(String t) {
		dc.initTakes();
		String temp = "";
		for (int i = 0; i < dc.tk.length; i++) {
			if (dc.tk[i].tkGrade.startsWith("A")) {
				temp += dc.tk[i].tkHakburn + ",";
			}
		}
		return temp;

	} // searchStudentID() END : String t / String temp �Ҹ�

	/** �й� �ߺ� ���� �޼��� ȣ�� **/
	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static String[] searchStudentInfo(String t) {
		dc.initStudent();
		String temp[] = {"",""};
		String ts[]=t.split(",");
		for(int j=0;j<ts.length;j++) {
			for(int i=0;i<dc.stu.length;i++) {
				if(dc.stu[i].stuHakburn.equals(ts[j])) {
//					System.out.println(ts[j]);
					temp[0] = temp[0]+ dc.stu[i].stuName +",";
					temp[1] = temp[1]+ dc.stu[i].stuHakburn +",";
				}
			}
		}
//		System.out.println(temp[0]);
//		System.out.println(temp[1]);
		return temp;
	} // searchStudentInfo() END

	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static void convertDepartmentID() {

	}

	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	public static void printResult() {

	}
} // MethodClass END
