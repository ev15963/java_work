package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		int pageNo=MethodClass.fromConsole();
		
		String htmlTags=MethodClass.createTags();
		System.out.println(htmlTags);
		
		PrintClass.makeHTML(htmlTags, pageNo);
	}

}





