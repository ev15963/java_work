package com.freeflux;

/** �а����� Ŭ���� **/
public class Department {
	private int dept_id=0; 			// �а���ȣ
	public String dept_name=""; 	// �а��̸�
	public String office="";			// ���ǽ�
	
	// (920, "��ǻ�Ͱ��а�", "201ȣ");
	public Department(int id, String name, String off) {
		this.dept_id=id;
		this.dept_name=name;
		this.office=off;
	} // ������ END

} // class END
