package com.freeflux;

import java.util.ArrayList;

/** ��ü News ������ ���� �ϴ� Ŭ���� **/
public class DataClass {
	
	/** ��ü News ������ ���� �ϴ� ArrayList **/
	public static ArrayList<NewsClass> news=new ArrayList<NewsClass>();
	
	public DataClass() {  // �⺻ ������
	} // ������ END
	
	
	/** news(ArrayList<NewsClass>)��  �ʱ� ������ �����ϴ� �޼��� **/
	public void initInsertNewsData() {
		String uri="c:/filetest/naver_news_stand_data_edit.txt";
		MethodClass.readNewsData(uri);
	}

}
