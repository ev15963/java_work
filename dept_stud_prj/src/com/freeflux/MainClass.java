package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		DataClass d=MethodClass.createObject();

		/**���л��� �а���(Department), �̸�, ��� ���� ���ϱ�**/
		// 0. �˻� ���� ����
		char searchGender='F';
		
		/** 1. �л����� �迭(students)�κ��� ���л� �˻� �޼��� ȣ��**/
		String[] result = MethodClass.searchInfo(searchGender, d.students);
		for(int idx=0;idx<result.length;idx++) {
			System.out.println(result[idx]);
		}
	} // main() END
	
	
	
} // class END



