package com.freeflux;

/**  �а� �� �л��������� �����ϴ� Ŭ���� **/
public class DataClass {
	Department[] dep = new Department[3];
	Student[] stu = new Student[8];
	Takes[] tk = new Takes[12];

	public DataClass() {
	
	}

	/** �а����� �ʱ� ������ �޼��� **/
	public void initDepartment() {
		dep[0]=new Department(920, "��ǻ�Ͱ��а�", "201ȣ");
		dep[1]=new Department(923, "������а�", "207ȣ");
		dep[2]=new Department(925, "���ڰ��а�", "308ȣ");
	}

	/** �л����� �ʱ� ������ �޼��� **/
	public void initStudent() {
		stu[0]=new Student("1292001", "900424-1825409", "�豤��", 3, "����", 920);
		stu[1]=new Student("1292002", "900305-1730021", "������", 3, "����", 920);
		stu[2]=new Student("1292003", "891021-2308302", "������", 4, "����", 920);
		stu[3]=new Student("1292301", "890902-2704012", "������", 2, "�뱸", 923);
		stu[4]=new Student("1292303", "910715-1524390", "�ڱ���", 3, "����", 923);
		stu[5]=new Student("1292305", "921011-1809003", "�����", 4, "�λ�", 923);
		stu[6]=new Student("1292501", "900825-1506390", "��ö��", 3, "����", 925);
		stu[7]=new Student("1292502", "911011-1809003", "���¼�", 3, "����", 925);
	}

	
	/** �������� �ʱ� ������ �޼��� **/
	public void initTakes() {
		tk[0]=new Takes("1292001", "C101-01", "B+");
		tk[1]=new Takes("1292001", "C103-01", "A+");
		tk[2]=new Takes("1292001", "C301-01", "A");
		tk[3]=new Takes("1292002", "C102-01", "A");
		tk[4]=new Takes("1292002", "C103-01", "B+");
		tk[5]=new Takes("1292002", "C502-01", "C+");
		tk[6]=new Takes("1292003", "C103-02", "B");
		tk[7]=new Takes("1292003", "C501-02", "A+");
		tk[8]=new Takes("1292301", "C102-01", "C+");
		tk[9]=new Takes("1292303", "C102-01", "C");
		tk[10]=new Takes("1292303", "C103-02", "B+");
		tk[11]=new Takes("1292303", "C501-01", "A+");
	}

} // class END
