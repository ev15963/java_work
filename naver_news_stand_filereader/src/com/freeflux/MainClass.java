package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		String tags=MethodClass.createHTML();
		
		PrintClass.makeHTML(tags);
	}

}

