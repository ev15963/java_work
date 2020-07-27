package com.freeflux;

import com.freeflux.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc=new DataBaseClass();
		dbc.connectMySQL("navercafe", "1234");
		
		String resultTags=null;
		resultTags=dbc.quiz1("employee");
		System.out.println("dbc.quiz1() : " + resultTags);
//		
		resultTags=dbc.quiz2("employee");
		System.out.println("dbc.quiz2() : " + resultTags);
		
		resultTags=dbc.quiz3("employee", 300);
		System.out.println("dbc.quiz3() : " + resultTags);
		
		resultTags=dbc.quiz4("employee", "ø¿¡ˆ»£");
		System.out.println("dbc.quiz4() : " + resultTags);
		
		resultTags=dbc.quiz5("employee",  250, 300, 500);
		System.out.println("dbc.quiz5() : " + resultTags);
		
		resultTags=dbc.quiz6("employee",  250, 300, 500);
		System.out.println("dbc.quiz6() : " + resultTags);
		
		resultTags=dbc.quiz7("employee",  "±Ë", "±‚");
		System.out.println("dbc.quiz7() : " + resultTags);
		
		resultTags=dbc.quiz8("employee");
		System.out.println("dbc.quiz8() : " + resultTags);
		
		resultTags=dbc.quiz9("employee");
		System.out.println("dbc.quiz9() : " + resultTags);
	}

}
