package com.freeflux;

import com.freeflux.db.DataBaseClass;
import com.freeflux.outside.PrintClass;

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

		PrintClass.MakeHTML(dbc.quiz1("employee"),"1");
		PrintClass.MakeHTML(dbc.quiz2("employee"),"2");
		PrintClass.MakeHTML(dbc.quiz3("employee", 300),"3");
		PrintClass.MakeHTML(dbc.quiz4("employee", "ø¿¡ˆ»£"),"4");
		PrintClass.MakeHTML(dbc.quiz5("employee",  250, 300, 500),"5");
		PrintClass.MakeHTML(dbc.quiz6("employee",  250, 300, 500),"6");
		PrintClass.MakeHTML(dbc.quiz7("employee",  "±Ë", "±‚"),"7");
		PrintClass.MakeHTML(dbc.quiz8("employee"),"8");
		PrintClass.MakeHTML(dbc.quiz9("employee"),"9");
	}

}
