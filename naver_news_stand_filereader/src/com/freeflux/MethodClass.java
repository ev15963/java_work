package com.freeflux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** 작업을 위한 메서드들 : 클래스명.메서드() **/
public class MethodClass {
	
	/** 전체 News 데이터 보유 객체 **/
	private static DataClass newsDatas=null;
	
	public MethodClass() { // 기본 생성자
	} // 생성자 END
	
	/** 전체 News 데이터 보유 객체 생성 메서드 **/
	public static void createNewsObject() {
		newsDatas=new DataClass();
	} // createNewsObject() END
	
	
	/** FileReader와 BufferedReader를 이용하여 txt 파일을 읽어들이는 메서드 **/
	public static void readNewsData(String uri) {
		// ("경향신문", "nsd16500796.gif", "newsstand.naver.com/032",  "종합지"));
		FileReader fr=null;
		BufferedReader br=null;
		NewsClass o=null;
		try {
			fr=new FileReader(uri);
			br=new BufferedReader(fr);
			
			o=null; //초기값
			String one=""; //readLine method로 저장
			String[] temp=null;
			while((one=br.readLine()) != null) {
				temp=one.split("\", \"");
				o=new NewsClass(temp[1], temp[2]); //newclass 객체변수
				DataClass.news.add(o);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	/** String을 이용하여 HTML 태그들을 생성하는 메서드 **/
	public static String createHTML() { //데이터 클래스 맞춰줌
		createNewsObject();
		newsDatas.initInsertNewsData();

		int nRow=10; // 행의 갯수
		int nCol=8;    // 열의 갯수
		
		String tags="";
		tags=tags+"<!doctype>";
		tags=tags+"<html>";
		tags=tags+"<head><title>News Stand</title></head>";
		tags=tags+"<body>";

		int count=0;
			for(int nTR=0; nTR<nRow; nTR++) { 	// 10번 행 반복
				tags=tags+"<tr>";			// 행 시작
				
				for(int nTD=0; nTD<nCol; nTD++) { 	// 8번 열 반복
					tags=tags+"<td>";		// 열 시작
					tags=tags+"<a href='http://"+newsDatas.news.get(count).getUrl() +"'>";
					tags=tags+"<img src='./newsImages/"+newsDatas.news.get(count).getImg() +"' />";
					tags=tags+"</a>";
					tags=tags+"</td>";	// 열 닫기
					count++;
				} // 안쪽 : for() END => 열
				
				tags=tags+"</tr>";		// 행 닫기
			} // 바깥쪽 : for() END => 행
			
			tags=tags+"</body>";		// body 닫기
			tags=tags+"</html>";		// html  닫기
			
			return tags;
	} // createHTML() END
	
	
} // class END
