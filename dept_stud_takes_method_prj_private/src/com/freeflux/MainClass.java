package com.freeflux;


public class MainClass {

	public static void main(String[] args) {
		/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ��**/
		MethodClass.createObject();
		/** ������ A�̻�(A, A+) �� �л����� �̸��� �й�, �а����� ��� **/
//		System.out.println(MethodClass.dc.takes.length); //��µǴ��� Ȯ��
		/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/
//		MethodClass.searchStudentID("A");
		String stu_id=MethodClass.searchStudentID("A");
//		System.out.println(stu_id);
		/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
		String[] infos = MethodClass.searchStudentInfo(stu_id);
		//info[0]:�̸��� /infos[1]:�а� ��ȣ��
//		System.out.println(infos[1]);
		/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
		String dnames= MethodClass.convertDepartmentID(infos[1]);
//		System.out.println(dnames);
		/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
		MethodClass.printResult(stu_id, infos[1], dnames);
		
	} // main() END

} // class END






