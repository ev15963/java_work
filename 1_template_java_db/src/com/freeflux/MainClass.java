package com.freeflux;

import com.freeflux.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connectMySQL("navercafe");	// ����� DB�� ����
		dbc.selectAll("employee");
////		dbc.insertRecord();
//		System.out.print("employee: ");
//		dbc.searchWord("employee");
	}

}
