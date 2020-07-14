package com.freeflux;

import java.util.ArrayList;

/** 전체 News 데이터 보유 하는 클래스 **/
public class DataClass {
	
	/** 전체 News 데이터 보유 하는 ArrayList **/
	public static ArrayList<NewsClass> news=new ArrayList<NewsClass>();
	
	public DataClass() {  // 기본 생성자
	} // 생성자 END
	
	
	/** news(ArrayList<NewsClass>)에  초기 데이터 삽입하는 메서드 **/
	public void initInsertNewsData() {
		String uri="c:/filetest/naver_news_stand_data_edit.txt";
		MethodClass.readNewsData(uri);
	}

}
