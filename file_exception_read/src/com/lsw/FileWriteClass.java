package com.lsw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {

	String uri = "C:/filetest/java3.html";

	public void writeFile() {
		FileWriter fw = null;
		DataClass dc = new DataClass();
		dc.initNewspaper();
		
		try {
			fw= new FileWriter(uri);
			fw.write("<!doctype html>");
			fw.write("<html><head><title>java => html </title></head><body><table border='1'>");
//			fw.write("<img src='./bookImages/"+"06365234"+".jpg' />");
			fw.write("<tr><td>åǥ��</td><td>����</td><td>����</td><td>���ǻ�</td><td>����</td><td>������</td></tr>");
			
			for(int i=0;i<dc.news.size();i++) {
				fw.write("<tr>");
				fw.write("<td><img src='./bookImages/"+dc.news.get(i).getImgName()+".jpg' /></td>");
				fw.write("<td>"+dc.news.get(i).getTitle()+"</td>");
				fw.write("<td>"+dc.news.get(i).getAuthor()+"</td>");
				fw.write("<td>"+dc.news.get(i).getPublish()+"</td>");
				fw.write("<td>"+dc.news.get(i).getPrice()+"��"+"</td>");
				fw.write("<td>"+dc.news.get(i).getDiscount()+"%"+"</td>");
				fw.write("</tr>");
			}
			
			fw.write("</body>");
			fw.write("</html>");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
