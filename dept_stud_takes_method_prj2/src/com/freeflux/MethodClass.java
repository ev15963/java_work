package com.freeflux;
/** �۾� �޼���鸸 �����ϴ� Ŭ���� **/
public class MethodClass {
	public static DataClass dc=null; //��ü���� �ʱⰪ null ����
	
	public MethodClass() {
	} // ������ END

	/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ���� **/
	public static void createObject() {
		dc= new DataClass();
	} // createObject() END
	
	/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� 
	 * @return **/
	// DataClass��ü�� takes�迭 ������ ��  take ���� ���� ���ϸ� �˻�
	public static String searchStudentID(String t) {
		dc.initTakes();
		String temp="";
//		System.out.println(dc.takes[10].take);
		for (int i =0; i<dc.takes.length;i++) {
			if(dc.takes[i].take.startsWith(t)); //if�ȿ� ���� ������ �ʱ�ȭ
				temp=temp+dc.takes[i].stu_id+",";
		} //for() END : int i �Ҹ�
		return temp;
	} //searchStudentID() END : String t / String temp �Ҹ�
	
	/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
	public static void searchStudentInfo(String stu_id) { //"1292001, ..."
		dc.initStudents();
//		System.out.println(dc.students[7].stu_id);
		String[] temp= {"",""}; //temp[0]:�̸���/ temp[1]:�а���ȣ��
		String[] s_ids=stu_id.split(","); //"1292001" "1292001"
		
		for(int i=0;i<dc.students.length;i++) {
			if(dc.students[i].stu_id.equals(s_ids[0])) {
				temp[0]=temp[0]+dc.students[i].name+",";
				temp[1]=temp[1]+dc.students[i].dept_id+",";
			}
		}
		System.out.println(temp[0]);
		System.out.println(temp[1]);
	} //searchStudentInfo() END
	/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
	public static void convertDepartmentID() {
		
	}
	/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/
	public static void printResult() {
		
	}
}  // MethodClass END








