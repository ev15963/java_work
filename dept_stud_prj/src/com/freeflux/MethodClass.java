package com.freeflux;

public class MethodClass {
	public MethodClass() {

	}

	/** 0. �а� �� �л��������� �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ�� **/
	public static DataClass createObject() {
		DataClass dc = new DataClass();
		dc.initDepartments(); // �а����� �迭�� �ʱ� ������ ����
		dc.initStudents(); // �л����� �迭�� �ʱ� ������ ����
		return dc;
	}

	/** 1. �л����� �迭(students)�κ��� ���л� �˻� �޼��� **/
	public static String[] searchInfo(char c, Student[] s) {
		String names = ""; // �˻� �л��̸��� : "�̸�,�̸�...."
		String dept_id = ""; // �˻� �л� �а���ȣ�� : "�а���ȣ,�а���ȣ...."
		int ageSum = 0; // ���� ��
		int count = 0; // �˻� �ο���
		for (int idx = 0; idx < s.length; idx++) {
			if (s[idx].gender == c) {
				names = names + s[idx].name + ","; // �л� �̸� ����
				dept_id = dept_id + s[idx].dept_id + ","; // �л� �а���ȣ ����
				ageSum = ageSum + s[idx].age; // �л� ���� ����
				count = count + 1; // count++ �� ���� // �ο��� ����
			}
		}
		String[] resultData = { names, dept_id, (ageSum + ""), (count + "") };
		return resultData; // void -> String���� ��ȯ

	}

	/** 2. �л��������ڿ� �и� �޼��� **/
	public static String[] stringSplit(String s) {
		return s.split(",");
	}

	/** 3. �а� ��ȣ�� �а������� ���� �޼��� **/
	// dept_id:"920","923" d.depts
	public static String[] convertDept(String[] d, Department[] dd) { // d : �а���ȣ��
		String[] dname = new String[d.length]; // �а� �̸�
		// "920"
		dname[0] = searchDeptName(dd, d[0]); // ù��° �а���ȣ
		dname[1] = searchDeptName(dd, d[1]); // �ι�° �а���ȣ
		return dname;
	}

	// d.depts "920"
	public static String searchDeptName(Department[] depts, String sName) {
		String dName = "";
		for (int idx = 0; idx < depts.length; idx++) {
			if (depts[idx].dept_id.equals(sName)) {
				dName = depts[idx].dept_name;
			}
		}
		return dName;
	}

	/** 4. ���л��� ��ճ��� ���ϴ� �޼��� **/
	public static double avg(String s, String c) {
		int sum = Integer.parseInt(s);
		int count = Integer.parseInt(c);

		return (float) sum / count;
	}

	/** 5. ��ü ��� ����ϴ� �޼��� **/

	public static void answer(String[] s1, String s2, String[] s3, double s4) {
		for (int idx = 0; idx < s1.length; idx++) {
			System.out.println(s1[idx]);
		}
		System.out.println(s2);
		
		
		//deptNames
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		
	
		
		System.out.println(s4);
	}
	//
	// System.out.println(dept_id[1]);
	//
	// System.out.println(avg);

}
