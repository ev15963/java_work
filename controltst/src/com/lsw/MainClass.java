package com.lsw;

import com.lsw.data.DataClass;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("main() ����");

		DataClass dc = new DataClass();
		TestClass tc = new TestClass("800211");
		System.out.println(tc.age);
//		Object o = new Object(); //��� Ŭ������ ����
		System.out.println("main() ����");
	}

}
