package com.freeflux;

import java.util.Scanner;

import com.freeflux.xls.ExcelReader;

public class MethodClass {

	private static int list=10;
	private static int pageNo=1;
	private static int startIndex=0;
	public static String uri="c:/filetest/";
	
	public MethodClass() {
	}
	
	public static int fromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어들일 파일 bank_data");
		String filename = sc.nextLine();
		System.out.println("읽어들일 페이지:");
		int pageNo = sc.nextInt();
		uri += (filename + ".xls");
		System.out.println(uri);
		
		pageNo-=1;
		startIndex=pageNo*list+1;
		
		ExcelReader.readExcelFile(uri, startIndex, list);
		uri=null;
		return pageNo+1;
		
	} //fromConsole() END

	
	public static String createTags() {
		String tags="";
		DataClass dc = new DataClass();
//		dc.bank();
		
		tags+=("<!doctype html><html><head><title>Bank Data List</title></head>"
				+ "<body><table border='1'><tr>");
		
		String[] header = {"번호", "나이", "직업", "결혼여부",	"학력", "집소유", "대출", 
				"연락방법", "가입월", "가입요일",	"기간"};

		for(int i=0;i<11;i++) {
			tags+=("<th>"+header[i]+"</th>");
		}
		tags+="</tr>";
		
		for(ObjectClass o: DataClass.bank) {
			tags+="<tr>";
			tags+=("<td>"+o.getNo()+"</td>");
			tags+=("<td>"+o.getAge()+"</td>");
			tags+=("<td>"+o.getJob()+"</td>");
			tags+=("<td>"+o.getMarial()+"</td>");
			tags+=("<td>"+o.getEducation()+"</td>");
			tags+=("<td>"+o.getHousing()+"</td>");
			tags+=("<td>"+o.getLoan()+"</td>");
			tags+=("<td>"+o.getContact()+"</td>");
			tags+=("<td>"+o.getMonth()+"</td>");
			tags+=("<td>"+o.getDay_of_week()+"</td>");
			tags+=("<td>"+o.getDuration()+"</td>");

			tags+="</tr>";
		}

		tags+="</table></body></html>";
	
		
		return tags;
	}
	

	

	
}
