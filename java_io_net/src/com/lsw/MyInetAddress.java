package com.lsw;

import java.net.InetAddress;

public class MyInetAddress {
	public InetAddress ip;
	
	public MyInetAddress() {	
	}
	
	//www.~~~.com
	public MyInetAddress(InetAddress ip) { //생성자를 통해서 도메인 주소를 받음
		this.ip=ip;
	}
	
	public void setInetAddress(InetAddress ip) {
		this.ip=ip;
	} //setInetAddress() END
	
	public void printInfo() {
		System.out.println("printInfo() => "+ip.getHostName()); //도메인명을 반환시켜주는 메서드
		System.out.println("printInfo() => "+ip.getHostAddress()); //해당 도메인에 대한 실제 ip주소를 반환시켜주는 메소드
		System.out.println("printInfo() => "+ip.toString()); //도메인과 ip를 반환하는 메서드
		System.out.println();
	}

}
