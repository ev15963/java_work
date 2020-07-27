package com.freeflux.outside;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.freeflux.MainClass;
import com.freeflux.db.DataBaseClass;

public class PrintClass {

	public static void MakeHTML(String pos, String num) {
		FileWriter fw = null;
		String temp = "c:/filetest/employee";
		String temp2= ".html";
		
		try {
			fw = new FileWriter(temp+num+temp2);
			fw.write(pos);
			fw.close();
			
			System.out.println(temp+num+temp2+"생성완료");
		} catch (IOException e) {
			System.out.println("MakeHTML err"+e.getMessage());
		}
	}
}
