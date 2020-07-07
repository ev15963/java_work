package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		TestClass tc1 = new TestClass(10,20);
		TestClass tc2 = new TestClass(100,200);
		TestClass[] tc = {tc1, tc2};
		System.out.println(tc[0].n1);
		System.out.println(tc[1].n2);
		
		tc[0].sum();
		tc[1].sum();
		System.out.println(tc[0].m);
		System.out.println(tc[1].m);
	}
}
