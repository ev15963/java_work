package com.freeflux;

/** �л����� Ŭ���� **/
public class Student {
	public String stu_id="";		// �й�
	public String resident_id="";	// �ֹι�ȣ
	public String name="";		// �̸�
	public int year=0; 				// �г�
	public String address="";		// �ּ�
	public int dept_id=0; 		// �а���ȣ

	
	//("1292001", "900424-1825409", "�豤��", 3, "����", 920);
	public Student(String s, String r, String n, int y, String a, int d) {
		this.stu_id=s;
		this.resident_id=r;
		this.name=n;
		this.year=y;
		this.address=a;
		this.dept_id=d;
		
	} // ������ END
	
} // class END




