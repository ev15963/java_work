package com.lsw;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent c = new Child(); //int child
		Child cc=(Child)c;
		cc.prn();
		
		PrintClass print=new PrintClass();
		print.prn();
//		System.out.println(print.child);
//		print.
	}
}
