package com.lsw;

public class PrintClass extends Child {
	public PrintClass() {
		super(1000);
		System.out.println("PrintClass() ����");
	}
	

	public void prn() { // Override
		System.out.println("Parent�� prn() ����");
}
}