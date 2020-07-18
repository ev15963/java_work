package com.freeflux;

public class MainClass {

	public static void main(String[] args) { //fromconsole createtags makehtml
		String htmlTags=MethodClass.createTags();
		System.out.println(htmlTags);
		
		PrintClass.makeHTML(htmlTags, 1);

	}

}





