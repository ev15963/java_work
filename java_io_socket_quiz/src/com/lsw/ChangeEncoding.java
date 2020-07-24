package com.lsw;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {
	public static String mysqlToJava(String str){
		try{
			byte[] b=str.getBytes("ISO-8859-1");
			return new String(b);			
		}catch(java.io.UnsupportedEncodingException uee){
			uee.printStackTrace();
			return null;
		}
	}
	public static String javaToMysql(String str){
		try{
			byte[] b=str.getBytes();
			return new String(b, "ISO-8859-1");			
		}catch(java.io.UnsupportedEncodingException uee){
			uee.printStackTrace();
			return null;
		}
	}
}
