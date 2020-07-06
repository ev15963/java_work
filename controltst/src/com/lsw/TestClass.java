package com.lsw;

public class TestClass { // MainClass와 동일위치
	float f = 110.2f;
	int d = 11;
	// 0123456
	String n1 = "770405";// 주민 앞번호
	String n2 = "1202123";
	int age = 0; // 나이 => String.substring(0,2)
					// => Integer.parseInt("12")

	public TestClass(String string1, String string2) {
		System.out.println("TestClass 생성자 시작");
		age(string1, string2);
		System.out.println("TestClass 생성자 종료");
	}

	public void age(String s, String s1) { // s : String n1
		String nfront=s.substring(0,2); //주민 앞자리중 맨처음 2자리
		int temp=Integer.parseInt(nfront);
		
		String nback=s1.substring(0,1); //주민 뒷자리중 맨처음 1자리
		if(nback.equals("1")||nback.equals("2")) {
			age=2020-(temp+1900);
		} else {
			age=2020-(temp+2020);
		}
	}

//	public int year(int year) {
//		if (n2.equals("1") || n2.equals("2")) {
//			year = age + 1900;
//		} else {
//			year = age + 2000;
//		}
//		return year;
//	}
	
	
	
}
