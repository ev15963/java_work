package com.lsw;

public class MethodClass {

	public static DataClass dc=null;
	
	public static void object() {
		dc = new DataClass();
	}
	//Æò±ÕÁ¶È¸¼ö
	public static double avg() {
		dc.initBook();
		double sum=0; int count =0;
		for(int i=0;i<dc.book.length;i++) {
			sum = sum + dc.book[i].bkView;
			count++;
		}
		return (sum/count);
		
	}
}
