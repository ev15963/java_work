package com.lsw;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataBaseClass dbc = new DataBaseClass();
		dbc.connect_companydb("company_db");
		dbc.search();
		
	}

}