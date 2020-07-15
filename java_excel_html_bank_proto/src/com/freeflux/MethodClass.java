package com.freeflux;

import java.util.Scanner;

import com.freeflux.xls.ExcelReader;

public class MethodClass {

	private static int list=10;
	private static int pageNo=1;
	private static int startIndex=0;

	private static String uri="c:/filetest/";
	private static String extension=".xls";
	
	
	public MethodClass() {
	}
	
	public static int fromConsole() {
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("읽어들일 엑셀파일명 입력 예) bank_data:");
		String filename=scan.next();
		
		System.out.println("읽어들일 페이지번호 입력 (예, 1):");
		int pageNo=scan.nextInt();
		
		uri= uri+filename+extension;
		System.out.println(uri);
		
		pageNo=pageNo-1; //return 에서 +1
		startIndex=pageNo*list+1;
		
		ExcelReader.readExcelFile(uri, startIndex, list);
		uri=null;
		return pageNo+1;
	} //fromConsole() END
	
	public static String createTags() {
		String tags="";

		tags += "<!doctype html>";
		tags += "<html>";
		tags += "<head><title>Bank Data List</title></head>";
		tags += "<body>";
		
		tags += "<table border='1'>";
		tags += "<tr>";
		
		//배열선언
		String[] headers={"번호", "나이", "직업", "결혼여부", "학력", "집소유", "대출", "연락방법", "가입월", "가입요일", "기간"};

		for(String head:headers) {
			tags=tags+"<th>"+head+"</th>";
		}
		tags=tags+"</tr>"; //제목 찍어주기
		
		for(ObjectClass o: DataClass.banks) {
			tags+="<tr>";//행시작
			
			tags+="<td>";//열시작
			tags+=o.getAge();//나이
			tags+="</td>";//열닫기
			
			tags+="<td>";//열시작
			tags+=o.getMarital();//나이
			tags+="</td>";//열닫기
			
			tags+="<td>";//열시작
			tags+=o.getEducation();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getHousing();//나이
			tags+="</td>";//열닫기
			
			tags+="<td>";//열시작
			tags+=o.getJob();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getLoan();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getContact();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getAge();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getMonth();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getDay_of_week();//나이
			tags+="</td>";//열닫기

			tags+="<td>";//열시작
			tags+=o.getDuration();//나이
			tags+="</td>";//열닫기
			
			tags+="<tr>";//행시작
		}
		tags += "</table>";  // table 닫기
		tags += "</body>"; // body 닫기
		tags += "</html>"; // html 닫기
		
		return tags;
	}

	
}
