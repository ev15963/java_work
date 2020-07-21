package com.freeflux.util;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

	public ChangeEncoding() { // 기본 생성자

	}
	 // java => mySQL
	  public static String toLatin(String str){
	       try{
	            byte[] b=str.getBytes(); //문자열을 byte 단위로 쪼개서 올리는 메소드
	            return new String(b, "ISO-8859-1");   // 기본 인코딩값 mySQL 5.1 전용
	       }catch(UnsupportedEncodingException uee){
	            System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	       }
	  }
	  
	 // mySQL => Java 로 가져올 때
	  public static String toUnicode(String str){
	       try{
	            byte[] b=str.getBytes("ISO-8859-1");
	            return new String(b);   
	       }catch(UnsupportedEncodingException uee){
	        System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	      }
	  }
}
