package com.freeflux;

public class MethodClass {
	public MethodClass() {
		
	}
	
	/**0. �а� �� �л��������� �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ��**/
	public static DataClass createObject() {
		DataClass dc=new DataClass(); 
		dc.initDepartments();	// �а����� �迭�� �ʱ� ������ ����
		dc.initStudents();	// �л����� �迭�� �ʱ� ������ ����
		return dc;
	}
	
	/**1. */
	
	
	
	
}
