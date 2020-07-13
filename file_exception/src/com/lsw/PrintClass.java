package com.lsw;

public class PrintClass extends Child {
	public PrintClass() {
		super(1000);
		System.out.println("PrintClass() 내부");
	}
	

	public void prn() { // Override
		System.out.println("Parent의 prn() 실행");
}
}