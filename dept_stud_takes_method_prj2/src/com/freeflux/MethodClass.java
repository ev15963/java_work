package com.freeflux;

/** �۾� �޼���鸸 �����ϴ� Ŭ���� **/
public class MethodClass {
	public static DataClass dc = null; // ��ü���� �ʱⰪ null ����

	public MethodClass() {
	} // ������ END

	/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ���� **/
	public static void createObject() {
		dc = new DataClass();
	} // createObject() END

	/**
	 * 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ��
	 * 
	 * @return
	 **/
	// DataClass��ü�� takes�迭 ������ �� take ���� ���� ���ϸ� �˻�
	public static String searchStudentID(String t) {
		dc.initTakes();
		String temp = "";
		// System.out.println(dc.takes[10].take);
		for (int i = 0; i < dc.takes.length; i++) {
			if (dc.takes[i].take.startsWith(t)) {
			// if�ȿ� ���� ������ �ʱ�ȭ
			temp = temp + dc.takes[i].stu_id + ",";
			}
		} // for() END : int i �Ҹ�
		return temp;
	} // searchStudentID() END : String t / String temp �Ҹ�

	/**�й� �ߺ� ���� �޼��� ȣ��**/
	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static String[] searchStudentInfo(String stu_id) { //"1292001, ..."
//		dc.initStudents();
////		System.out.println(dc.students[7].stu_id);
//		String[] temp= {"",""}; //temp[0]:�̸���/ temp[1]:�а���ȣ��
//		String[] s_ids=stu_id.split(","); //"1292001" "1292001"
//		for (int n=0;n<s_ids.length;n++) {
//			for(int i=0;i<dc.students.length;i++) {
//				if(dc.students[i].stu_id.equals(s_ids[n])) {
//					temp[0]=temp[0]+dc.students[i].name+",";
//					temp[1]=temp[1]+dc.students[i].dept_id+",";
//				}
//			}
//		}
////		System.out.println(temp[0]);
////		System.out.println(temp[1]);
//		return temp;
		
		dc.initStudents();
		//String[]

	} // searchStudentInfo() END

	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static String convertDepartmentID(String d_id) {
		dc.initDepartments();
//		System.out.println(dc.depts[2].dept_name);
		String[] temp=d_id.split(","); //920, 923
		String dnames="";
		//depts: 920, 923, 925
		int no=0;
		for(int n=0;n<temp.length;n++) {
			for (int i=0;i<dc.depts.length;i++) { //dc.depts�迭�� ������ŭ �ݺ�
				no=Integer.parseInt(temp[n]); //i�� �ƴϰ� n
				if(dc.depts[i].dept_id==no) {
					dnames=dnames+dc.depts[i].dept_name+",";
				}
			}
		}
		return dnames;
	}

	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	public static void printResult(String s1, String s2, String s3) {
		s1=MethodClass.searchStudentID("A");
		System.out.println("������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� :\n"+s1);
		String[] infos = MethodClass.searchStudentInfo(s1);
//		s2= infos[1];
		System.out.println("�˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� :\n"+s2);
		s3= MethodClass.convertDepartmentID(s2);
		System.out.println("�˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� :\n"+s3);
	}
} // MethodClass END
