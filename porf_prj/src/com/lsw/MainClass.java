package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		ProfessorClass pc1 = new ProfessorClass("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		System.out.println(pc1.year);
		ProfessorClass pc2 = new ProfessorClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		System.out.println(pc2.year);
		ProfessorClass pc3 = new ProfessorClass("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		System.out.println(pc3.year);
		ProfessorClass pc4 = new ProfessorClass("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		System.out.println(pc4.year);
		ProfessorClass pc5 = new ProfessorClass("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		System.out.println(pc5.year);
		ProfessorClass pc6 = new ProfessorClass("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
		System.out.println(pc6.year);
		
		int sum = 0;
//		sum=pc1.pay+pc2.pay+pc3.pay+pc4.pay+pc5.pay+pc6.pay;
		ProfessorClass[] profs = {pc1, pc2, pc3, pc4, pc5, pc6};
		System.out.println(profs[0].year);
	}

}
