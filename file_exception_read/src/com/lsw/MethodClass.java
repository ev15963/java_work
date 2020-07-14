package com.lsw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MethodClass {
	public static DataClass dc = null;

	public MethodClass() {

	}

	public static void createBooksObject() {
		dc = new DataClass();
	}

	public static void readBooksData() {

		try {
			FileReader fr = new FileReader("C:\\filetest\\bookdata.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String one = br.readLine();
			while (one.equals(null)) {
				String[] temp =one.split("__");
				dc.news.add(new NewsClass(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]));
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String makeBooksHTML() {
//		String uri = "c:/filetest/java4.html";
//		FileWriter fw = null;

		String tags = "";

		tags += "<!doctype html>";
		tags += "<html>";
		tags += "<head><title>java => html </title></head>";
		tags += "<body>";
		tags += "<table border='1'>";
		tags += "<tr><td>책표지</td><td>제목</td><td>저자</td><td>출판사</td><td>정상가</td><td>할인율</td></tr>\"";

		for (int i = 0; i < dc.news.size(); i++) {
			tags += "<tr>";
			tags += "<td><img src='./bookImages/" + dc.news.get(i).getImgName() + ".jpg' /></td>";
			tags += "<td>" + dc.news.get(i).getTitle() + "</td>";
			tags += "<td>" + dc.news.get(i).getAuthor() + "</td>";
			tags += "<td>" + dc.news.get(i).getPublish() + "</td>";
			tags += "<td>" + dc.news.get(i).getPrice() + "원" + "</td>";
			tags += "<td>" + dc.news.get(i).getDiscount() + "%" + "</td>";
			tags += "</tr>";
		}

		tags += "</body>";
		tags += "</html>";

		return tags;

	}
}
