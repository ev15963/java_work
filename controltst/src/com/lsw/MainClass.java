package com.lsw;

import com.lsw.data.DataClass;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("main() 시작");

		DataClass dc = new DataClass();
		TestClass tc = new TestClass("800211");
		System.out.println(tc.age);
//		Object o = new Object(); //모든 클래스의 원조
		System.out.println("main() 종료");
	}

}
