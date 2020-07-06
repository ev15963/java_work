package com.lsw;

public class MainClass_2 {

	public static void main(String[] args) {
		ProfesserClass_2[] prof = new ProfesserClass_2[8];
		prof[0] = new ProfesserClass_2("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		prof[1] = new ProfesserClass_2("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		prof[2] = new ProfesserClass_2("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		prof[3] = new ProfesserClass_2("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		prof[4] = new ProfesserClass_2("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		prof[5] = new ProfesserClass_2("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		prof[6] = new ProfesserClass_2("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		prof[7] = new ProfesserClass_2("1292502", "911011-1809003", "백태성", 3, "서울", 95);

		for(int i=0; i<prof.length;i++) {
		System.out.println((i+1)+"번째 : "+prof[i].gkrsus+"학번, "+prof[i].age+"살, "+prof[i].name+", "+prof[i].gkrsus+"학년, "+prof[i].living+" 거주, "+prof[i].dd+"학점");
		}
	}
	
	
}
