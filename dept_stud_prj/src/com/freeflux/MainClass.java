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
//		System.out.println(dept_id[1]);
		
		
		/** 3. �а� ��ȣ�� �а������� ���� �޼��� **/
		String[] deptNames = MethodClass.convertDept(dept_id, d.depts);
		for (int i=0;i<deptNames.length;i++) {
		System.out.println(deptNames[i]);
		}
		
		for (int i = 0; i < deptNames.length; i++) {
			System.out.println(deptNames[i]);
		}
		
		/** 4. ���л��� ��ճ��� ���ϴ� �޼��� **/
		double avg=MethodClass.avg(result[2], result[3]);
//		System.out.println(avg);
		
		/** 5. ��ü ��� ����ϴ� �޼��� **/
		System.out.println("��ü ���");
		MethodClass.answer(result, dept_id[1], deptNames, avg);
		
//		for (int i=0;i<)
//		System.out.println(deptNames[i]);
	} // main() END

	

	
} // class END



