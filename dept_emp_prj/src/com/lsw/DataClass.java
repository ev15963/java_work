package com.lsw;
/*�μ�������, ��������� ���� Ŭ����*/
public class DataClass {
	
	

	public static DeptClass[] dept = new DeptClass[4];
	
	public static void initDEPT() {
		dept[0]=new DeptClass("10", "�渮��", "����");
		dept[1]=new DeptClass("20", "�λ��", "��õ");
		dept[2]=new DeptClass("30", "������", "����");
		dept[3]=new DeptClass("40", "�����", "����");
	}

	public static EmpClass[] emps = new EmpClass[14];
	
	public static void initEMP() {
		emps[0]=new EmpClass("1001", "����", "���", "1013", "2007-03-01", 300, 0, "20");
		emps[1]=new EmpClass("1002", "�ѿ���", "�븮", "1005", "2007-04-02", 250,   80, "30");
		emps[2]=new EmpClass("1003", "����ȣ", "����", "1005", "2005-02-10", 500,  100, "30");
		emps[3]=new EmpClass("1004", "�̺���", "����", "1008", "2003-09-02", 600, 0, "20");
		emps[4]=new EmpClass("1005", "�ŵ���", "����", "1005", "2005-04-07", 450,  200, "30");
		emps[5]=new EmpClass("1006", "�嵿��", "����", "1008", "2003-10-09", 480, 0, "30");
		emps[6]=new EmpClass("1007", "�̹���", "����", "1008", "2004-01-08", 520, 0, "10");
		emps[7]=new EmpClass("1008", "���켺", "����", "1003", "2004-03-08", 500,    0, "30");
		emps[8]=new EmpClass("1009", "�ȼ���", "����", "", "1996-10-04",1000, 0, "20");
		emps[9]=new EmpClass("1010", "�̺���", "����", "1003", "2005-04-07", 500, 0, "10");
		emps[10]=new EmpClass("1011", "�����", "���", "1007", "2007-03-01", 280, 0, "30");
		emps[11]=new EmpClass("1012", "������", "���", "1006", "2007-08-09", 300, 0, "20");
		emps[12]=new EmpClass("1013", "������", "����", "1003", "2002-10-09", 560, 0, "20");
		emps[13]=new EmpClass("1014", "���μ�", "���", "1006", "2007-11-09", 250, 0, "10");
	}
}
