package com.lsw;

public class EmpClass {
	public String empNo="";  // ��� ������ȣ
	public String empName="";  // ����̸�
	public String job="";  // ����
	public String mgr="";  // ���޹�ȣ
	public String hireDate="";  // �Ի���
	public int sale=0;  // �޿�
	public int commission=0; // ������
	public String deptNo="";  // �μ���ȣ
	
	public EmpClass(String en, String na, String j, String m, String h, int s, int d,
			String b) {
		this.empNo=en;
		this.empName=na;
		this.job=j;
		this.mgr=m;
		this.hireDate=h;
		this.sale=s;
		this.commission=d;
		this.deptNo=b;
		// TODO Auto-generated constructor stub
	}

}
