package com.lsw;

import java.util.ArrayList;


public class DataClass {


public static ArrayList<ObjectClass> books=new ArrayList<ObjectClass>();
	
	public DataClass() {
	}
	
	public static void initInsertBookData() {
		String uri="c:/filetest/bookdata.txt";
		MethodClass.makeBooksHTML(uri);
	}
	
}
