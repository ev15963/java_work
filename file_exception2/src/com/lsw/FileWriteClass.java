package com.lsw;

import java.io.FileWriter;
import java.io.IOException;

import com.lsw.DataClass;
import java.util.ArrayList;

public class FileWriteClass {

	String uri = "c:/filetest/java2.html";

	public void writeFile() {

		FileWriter fw = null;
		DataClass dc = new DataClass();
		dc.initNewspaper();
		String temp = "";
		int count =0;
		// FileWriteClass() {
		// } // 생성자 END

		try {

			fw = new FileWriter(uri);
			fw.write("<!doctype html>");
			fw.write("<html>");
			fw.write("<head><title>java => html </title></head>");
			fw.write("<body>");
			fw.write("<table border='1'>");

			
			for (int j = 0; j <10; j++) {
				fw.write("<tr>");
				for (int i = 0; i <8; i++) { //dc.news.size()

					fw.write("<td> <img src=\'./newsImages/" + dc.news.get(count).img + "\' /> </td>");
					
					count++;
				}	
				
				fw.write("</tr>");
			}


			
//			
			
			// fw.write("<tr><td> <img src=\'./newsImages/nsd16500796.gif' /> </td></tr>");

			fw.write("<a href='https://www.naver.com'>네이버</a>");
			fw.write("</body>");
			fw.write("</html>");

			fw.close();

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}
}
