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
		/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
		
		/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
		
		
	} // main() END

} // class END






