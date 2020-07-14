package com.freeflux;

import java.util.ArrayList;

public class DataClass {

	public static ArrayList<BookClass> books=new ArrayList<BookClass>();
	
	public DataClass() {
	}
	
	public static void initInsertBookData() {
		String uri="c:/filetest/bookdata.txt";
		MethodClass.readBooksData(uri);
	}

}
