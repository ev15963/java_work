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
		
		/** 2. �л��������ڿ� �и� �޼��� **/
		String[] names = MethodClass.stringSplit(result[0]);
		String[] dept_id = MethodClass.stringSplit(result[1]);
		System.out.println(dept_id[1]);
		
		/** 3. �а� ��ȣ�� �а������� ���� �޼��� **/
		String[] deptNames = MethodClass.convertDept(dept_id, d.depts);
		
		/** 4. ���л��� ��ճ��� ���ϴ� �޼��� **/
		/** 5. ��ü ��� ����ϴ� �޼��� **/
		
	} // main() END
	

	
} // class END



