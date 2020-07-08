package com.lsw;

public class DataClass {

	public static DepartMent[] dept = new DepartMent[4];
	
	public static void initDEPT() {

		dept[0] = new DepartMent("920", "컴퓨터공학과", "201호");
		dept[1] = new DepartMent("923", "산업공학과", "207호");
		dept[2] = new DepartMent("925", "전자공학과", "308호");
		
	}
	
	public static Student[] std = new Student[8];
	
	public static void initSTD() {
		
		std[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", "920");
		std[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", "920");
		std[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", "920");
		std[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", "923");
		std[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", "923");
		std[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", "923");
		std[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", "925");
		std[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", "925");
	}
}
