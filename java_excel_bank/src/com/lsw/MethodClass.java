package com.lsw;

import java.io.File;

import com.lsw.xls.ExcelReader;

import jxl.Workbook;

public class MethodClass {

	public static DataClass dc = null;
	public static ExcelReader er = null;

	public MethodClass() {
		// TODO Auto-generated constructor stub
	}

	public static void createBooksObject() {
		dc = new DataClass();
	}

	public static String makeBooksHTML(String uri) {
		er = new ExcelReader();
		File f = new File(uri);
		Workbook wb;
		String tags = "";

		tags += "<!doctype html>";
		tags += "<html>";
		tags += "<head><title>java => html </title></head>";
		tags += "<body>";
		tags += "<table border='1'>";
		tags += "<tr><td>책표지</td><td>제목</td><td>저자</td><td>출판사</td><td>정상가</td><td>할인율</td></tr>\"";

		
			tags += "<tr>";
			tags += "<td>" + c.getContents() + " \\t\"</td>";
			tags += "<td>" + c1.getContents() + " \t" + "</td>";
			tags += "<td>" + c2.getContents() + " \t" + "</td>";
			tags += "<td>" + c3.getContents() + " \t" + "</td>";
			tags += "<td>" + c4.getContents() + " \t" + "</td>";
			tags += "<td>" + c5.getContents() + " \t" + "</td>";
			tags += "<td>" + c6.getContents() + " \t" + "</td>";
			tags += "<td>" + c7.getContents() + " \t" + "</td>";
			tags += "<td>" + c8.getContents() + " \t" + "</td>";
			tags += "<td>" + c9.getContents() + " \t" + "</td>";
			tags += "<td>" + c10.getContents() + " \t" + "</td>";
			tags += "</tr>";

		
		
		tags += "</body>";
		tags += "</html>";

		return tags;
	}
}
