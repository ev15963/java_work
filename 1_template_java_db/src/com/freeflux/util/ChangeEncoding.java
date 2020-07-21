package com.freeflux.util;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

	public ChangeEncoding() { // �⺻ ������

	}
	 // java => mySQL
	  public static String toLatin(String str){
	       try{
	            byte[] b=str.getBytes(); //���ڿ��� byte ������ �ɰ��� �ø��� �޼ҵ�
	            return new String(b, "ISO-8859-1");   // �⺻ ���ڵ��� mySQL 5.1 ����
	       }catch(UnsupportedEncodingException uee){
	            System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	       }
	  }
	  
	 // mySQL => Java �� ������ ��
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
