package com.lsw;

public class ProfessorClass {
	//("92001", "590327-1839240", "���±�", 920, "����", "1997")
	//�� ������ ����Ǵ� ������ Ŭ������ �ν��Ͻ� ����
	//�ν��Ͻ��� Ŭ������ ��ü�� �����Ǵ� ����
	//������ ��ü�� �ϳ��� �ν��Ͻ� ���..
	public String n, jumin, name, rank, year;
	public int pay, age;
	
	public ProfessorClass(String no, String j, String n, int p, String r, String y, int a) {
		
		this.n=no; // �˻��ӵ� ���� �ٷ� public String���� ã��
		this.jumin=j;
		this.name=n;
		this.rank=r;
		this.pay=p;
		this.year=y;
		this.age=a;
	} // ������ END
} // Ŭ���� END
