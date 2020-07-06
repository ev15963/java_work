package com.lsw;

public class TestClass { //MainClass와 동일위치
	float f=110.2f;
	int d=11;
	//		0123456
	String n1="770405";//주민 앞번호
	String n2="1202123";
	int age=0; //나이 => String.substring(0,2)
				//  => Integer.parseInt("12")
	public TestClass(String string) {
		System.out.println("TestClass 생성자 시작");
		age(string);
		System.out.println("TestClass 생성자 종료");
	}
	public void age(String s) { // s : String n1
		System.out.println("age()에 값 전달:"+s);
		String n=s.substring(0,2); // n: "77"
		System.out.println("연도만 추출:"+n);
		age =Integer.parseInt(n); // a: 77
		System.out.println("문자열을 숫자로: "+n);
		System.out.println("age() 종료");
	}
}
