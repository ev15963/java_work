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
		String temp[] = { "", "" };
		String ts[] = t.split(",");
		for (int j = 0; j < ts.length; j++) {
			for (int i = 0; i < dc.stu.length; i++) {
				if (dc.stu[i].stuHakburn.equals(ts[j])) {
					// System.out.println(ts[j]);
					temp[0] = temp[0] + dc.stu[i].stuName + ",";
					temp[1] = temp[1] + dc.stu[i].stuNum + ",";
				}
			}
		}
		// System.out.println(temp[0]);
		// System.out.println(temp[1]);
		return temp;
	} // searchStudentInfo() END

	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static String convertDepartmentID(String t) {
		int no =0;
		String dnames = "";
		dc.initStudent();
		String ts[] = t.split(",");
		for(int j=0;j<dc.dep.length;j++) {
			for (int i=0;i<ts.length;i++) {
				no=Integer.parseInt(ts[i]);
				if(dc.dep[j]==ts[i]) {
					
				}
			}
		}
		System.out.println("no"+no);
		return null;
	}

	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	public static void printResult() {

	}
} // MethodClass END
