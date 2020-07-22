package com.freeflux.util;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

	public ChangeEncoding() { // 기본 생성자

	}
	 // java => mySQL
	  public static String javaTomySQL(String str){
	       try{
	            byte[] b=str.getBytes();
	            return new String(b, "ISO-8859-1");   
	       }catch(UnsupportedEncodingException uee){
	            System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	       }
	  }
	  
	 // mySQL => Java 
	  public static String mySQLToJava(String str){
	       try{
	            byte[] b=str.getBytes("ISO-8859-1");
	            return new String(b);   
	       }catch(UnsupportedEncodingException uee){
	        System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	      }
	  }
}
