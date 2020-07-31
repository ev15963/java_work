package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connect_companydb("company_db");
		dbc.search();
		
	}

}