package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		ProfessorClass[] profs = new ProfessorClass[6];
		profs[0] = new ProfessorClass("92001", "590327-1839240", "���±�", 920, "����", "1997");
		profs[1] = new ProfessorClass("92002", "690702-1350026", "����", 910, "�α���", "2003");
		profs[2] = new ProfessorClass("92002", "690702-1350026", "����", 910, "�α���", "2003");
		profs[3] = new ProfessorClass("92302", "750728-1102458", "���¼�", 920, "����", "1999");
		profs[4] = new ProfessorClass("92501", "620505-1200546", "��ö��", 900, "������", "2007");
		profs[5] = new ProfessorClass("92502", "740101-1830264", "��μ�", 910, "�α���", "2005");

		// for (int i = 0; i < profs.length; i++) {
		// System.out.println(profs[i].age);
		// }

		profs[5].ageMethod(profs[5].jumin);

		System.out.println(profs[5].age);
		// int sum = 0;
		//// sum=pc1.pay+pc2.pay+pc3.pay+pc4.pay+pc5.pay+pc6.pay;
		// for(int i=0;i<profs.length;i++) {
		// sum = sum+profs[i].pay;
		// }
		// System.out.println("���� ��:"+sum);

		for (int i = 0; i < profs.length; i++) {
			System.out.println("��������� "+profs[i].jae+"�����Դϴ�.");
		}
	}

}
