package com.lsw;

import java.net.InetAddress;

public class MainClass {

	public static void main(String[] args) {
		InetAddress my;
		try {
			my = InetAddress.getLocalHost();
			MyInetAddress inet = new MyInetAddress(my);
			inet.printInfo();

			// www.naver.com
			InetAddress naver = InetAddress.getByName("www.naver.com");
			inet.setInetAddress(naver);
			inet.printInfo();
		} catch (java.net.UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
