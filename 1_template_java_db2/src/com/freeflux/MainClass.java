package com.freeflux;

import com.freeflux.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connectMySQL("navercafe");	// 사용할 DB명 전달
		System.out.println("1");
		dbc.select_empName_sale("empName","sale");
		System.out.println("2");
		dbc.wlrrmq("employee");
		System.out.println("3");
		dbc.sale_300_low("employee");
		System.out.println("4");
		dbc.mr_oh("empName");
		System.out.println("5");
		dbc.rmqdurjator("employee");
		System.out.println("6");
		dbc.rmqdurjator2("employee");
		System.out.println("7");
		dbc.kimKi("employee");
		System.out.println("8");
		dbc.q8("employee");
		System.out.println("9");
		dbc.q9("employee");
//		dbc.insertRecord();
//		System.out.print("employee: ");
//		dbc.searchWord("employee");
	}

}
