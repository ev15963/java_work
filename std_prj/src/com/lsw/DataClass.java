package com.lsw;

public class DataClass {

	public static DepartMent[] dept = new DepartMent[4];
	
	public static void initDEPT() {

		dept[0] = new DepartMent("920", "��ǻ�Ͱ��а�", "201ȣ");
		dept[1] = new DepartMent("923", "������а�", "207ȣ");
		dept[2] = new DepartMent("925", "���ڰ��а�", "308ȣ");
		
	}
	
	public static Student[] std = new Student[8];
	
	public static void initSTD() {
		
		std[0] = new Student("1292001", "900424-1825409", "�豤��", 3, "����", "920");
		std[1] = new Student("1292002", "900305-1730021", "������", 3, "����", "920");
		std[2] = new Student("1292003", "891021-2308302", "������", 4, "����", "920");
		std[3] = new Student("1292301", "890902-2704012", "������", 2, "�뱸", "923");
		std[4] = new Student("1292303", "910715-1524390", "�ڱ���", 3, "����", "923");
		std[5] = new Student("1292305", "921011-1809003", "�����", 4, "�λ�", "923");
		std[6] = new Student("1292501", "900825-1506390", "��ö��", 3, "����", "925");
		std[7] = new Student("1292502", "911011-1809003", "���¼�", 3, "����", "925");
	}
}