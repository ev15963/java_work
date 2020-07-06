package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		ProfessorClass[] profs = new ProfessorClass[6];
		profs[0] = new ProfessorClass("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		profs[1] = new ProfessorClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		profs[2] = new ProfessorClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		profs[3] = new ProfessorClass("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		profs[4] = new ProfessorClass("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		profs[5] = new ProfessorClass("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

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
		// System.out.println("나이 합:"+sum);

		for (int i = 0; i < profs.length; i++) {
			System.out.println("재직년수는 "+profs[i].jae+"년차입니다.");
		}
	}

}
