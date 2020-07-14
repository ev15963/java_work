package com.freeflux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodClass {
	public static DataClass dc = null; //선언

	public MethodClass() {
	}

	public static void createBooksObject() { //dataclass
		dc = new DataClass();
	}

	public static void readBooksData(String uri) { //자료 읽는 메소드

		FileReader fr = null;
		BufferedReader br = null;
		BookClass o = null; //생략가능
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			int count = 0;
			String one = ""; //한줄 단위로 저장..
			String[] temp = null; //한줄을 분리 저장..
			while ((one = br.readLine()) != null) {
				temp = one.split("__");
				//"DO it HTML 5 CSS 3" "고경희" "이지스퍼블리싱" "16800" "06365234" "20"
				o = new BookClass(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
				 o.testToString();
				dc.books.add(o);
				count++;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // readBooksData() END

	public static String makeBooksHTML() { //
		createBooksObject();
		dc.initInsertBookData();

		int rowCount = dc.books.size();

		String tags = "";
		tags = tags + "<!doctype html>";
		tags = tags + "<html>";
		tags = tags + "<head><title>책목록</title></head>";
		tags = tags + "<body>";
		
		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";
		tags = tags + "<td>책표지</td>";
		tags = tags + "<td>제목</td>";
		tags = tags + "<td>저자</td>";
		tags = tags + "<td>출판사</td>";
		tags = tags + "<td>정가</td>";
		tags = tags + "<td>할인율</td>";
		tags = tags + "</tr>";
		

		for (int n = 0; n < rowCount; n++) { // 10번 행 반복
			tags = tags + "<tr>"; // 행 시작

			tags = tags + "<td>"; // 열 시작
			tags = tags + "<img src='./bookImages/" + dc.books.get(n).getImg() + "' />";
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getTitle();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getAuthor();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getPress();
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getPrice()+"원";
			tags = tags + "</td>"; // 열 닫기
			
			tags = tags + "<td>"; // 열 시작
			tags = tags + dc.books.get(n).getDiscount()+"%";
			tags = tags + "</td>"; // 열 닫기

			tags = tags + "</tr>"; // 행 닫기
		} // 바깥쪽 : for() END => 행

		tags = tags + "</body>"; // body 닫기
		tags = tags + "</html>"; // html 닫기

		return tags;
	} // makeBooksHTML() END

} // class END
