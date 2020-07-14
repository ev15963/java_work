package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		String tags = MethodClass.makeBooksHTML();
		System.out.println(tags);
		PrintClass.makeHTML(tags);
	}

}
