package com.freeflux;

public class MethodClass {


	
	public MethodClass() {
	}
	
	public static int fromConsole() {

		return 0;
	}
	
	public static String createTags() {
		String tags="";

		tags = tags + "<!doctype html>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Bank Data List</title></head>";
		tags = tags + "<body>";
		
		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";
		
		String[] headers={"번호", "나이", "직업", "결혼여부", "학력", "집소유", "대출", "연락방법", "가입월", "가입요일", "기간"};

		tags = tags + "</table>";  // table 닫기
		tags = tags + "</body>"; // body 닫기
		tags = tags + "</html>"; // html 닫기
		
		return tags;
	}

	
}
