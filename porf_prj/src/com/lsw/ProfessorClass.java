package com.lsw;

public class ProfessorClass {
	// ("92001", "590327-1839240", "���±�", 920, "����", "1997")
	// �� ������ ����Ǵ� ������ Ŭ������ �ν��Ͻ� ����
	// �ν��Ͻ��� Ŭ������ ��ü�� �����Ǵ� ����
	// ������ ��ü�� �ϳ��� �ν��Ͻ� ���..
	public String n, jumin, name, rank, year;
	public int pay;
	public int age = 0;
	public int jae = 0;

	public ProfessorClass(String no, String j, String n, int p, String r, String y) {

		this.n = no; // �˻��ӵ� ���� �ٷ� public String���� ã��
		this.jumin = j;
		this.name = n;
		this.rank = r;
		this.pay = p;
		this.year = y; // �Ի�⵵ -> �������

		this.ageMethod(this.jumin); // ��ü������ ������ age ���� ����
		this.jaeMethod(this.year);
	} // ������ END

	// �ֹι�ȣ�� �̿��� ���̰�� �޼ҵ�
	public void ageMethod(String jumin) {
		String[] ju=jumin.split("-");	//"590327-1839240" �и�
		
		String nFront=ju[0].substring(0,2); //"590327" => "59"
		int temp=Integer.parseInt(nFront); //"59" => 59
		
		String nBack = ju[1].substring(0,1); //"1839240" => "1"
		if(nBack.equals("1")||nBack.equals("2")) {
			this.age=2020-(temp+1900); //1900��� ���� ���ϱ�
		} else {
			this.age=2020-(temp+2000); //2000 ��� ���� ���ϱ�
		}
		
		
//		public void age(String s, String s1) { // s : String n1
//			String nfront=s.substring(0,2); //�ֹ� ���ڸ��� ��ó�� 2�ڸ�
//			int temp=Integer.parseInt(nfront);
//
//			String nback=s1.substring(0,1); //�ֹ� ���ڸ��� ��ó�� 1�ڸ�
//			if(nback.equals("1")||nback.equals("2")) {
//				age=2020-(temp+1900);
//			} else {
//				age=2020-(temp+2020);
//			}
//		}
	} // ageMethod() END
	
	public void jaeMethod(String year) {
		
		int y = Integer.parseInt(year);
		this.jae= 2020-y;
	} // jaeMethod() END
} // Ŭ���� END
