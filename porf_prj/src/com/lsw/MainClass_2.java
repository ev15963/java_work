package com.lsw;

public class MainClass_2 {

	public static void main(String[] args) {
		ProfesserClass_2[] prof = new ProfesserClass_2[8];
		prof[0] = new ProfesserClass_2("1292001", "900424-1825409", "�豤��", 3, "����", 92);
		prof[1] = new ProfesserClass_2("1292002", "900305-1730021", "������", 3, "����", 20);
		prof[2] = new ProfesserClass_2("1292003", "891021-2308302", "������", 4, "����", 55);
		prof[3] = new ProfesserClass_2("1292301", "890902-2704012", "������", 2, "�뱸", 78);
		prof[4] = new ProfesserClass_2("1292303", "910715-1524390", "�ڱ���", 3, "����", 54);
		prof[5] = new ProfesserClass_2("1292305", "921011-1809003", "�����", 4, "�λ�", 88);
		prof[6] = new ProfesserClass_2("1292501", "900825-1506390", "��ö��", 3, "����", 73);
		prof[7] = new ProfesserClass_2("1292502", "911011-1809003", "���¼�", 3, "����", 95);

		for(int i=0; i<prof.length;i++) {
		System.out.println((i+1)+"��° : "+prof[i].gkrsus+"�й�, "+prof[i].age+"��, "+prof[i].name+", "+prof[i].gkrsus+"�г�, "+prof[i].living+" ����, "+prof[i].dd+"����");
		}
	}
	
	
}
