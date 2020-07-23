package com.lsw;

import java.net.InetAddress;

public class MainClass {

	public static void main(String[] args) {
		String site="https://www.naver.com/index.html";
		
		URLReader homePage = new URLReader(site);
//		homePage.printConnectioninfo();
		
		System.out.println("===========================");
		
		homePage.printPage();
		
//		InetAddress my;
//		try {
//			my = InetAddress.getLocalHost();
//			MyInetAddress inet = new MyInetAddress(my);
//			inet.printInfo();
//
//			// www.naver.com
//			InetAddress naver = InetAddress.getByName("www.naver.com");
//			inet.setInetAddress(naver);
//			inet.printInfo();
//		} catch (java.net.UnknownHostException e) {
//			e.printStackTrace();
//		}

	}

}
