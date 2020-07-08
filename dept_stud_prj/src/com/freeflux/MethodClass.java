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
	public static String searchInfo(char c, Student[] s) {
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
		String[] resultData= {names, dept_id, (ageSum+""), (count+"") };
		return resultData; //void -> String���� ��ȯ
	}
}
