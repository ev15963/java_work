package com.lsw;

import java.net.InetAddress;

public class MyInetAddress {
	public InetAddress ip;
	
	public MyInetAddress() {	
	}
	
	//www.~~~.com
	public MyInetAddress(InetAddress ip) { //�����ڸ� ���ؼ� ������ �ּҸ� ����
		this.ip=ip;
	}
	
	public void setInetAddress(InetAddress ip) {
		this.ip=ip;
	} //setInetAddress() END
	
	public void printInfo() {
		System.out.println("printInfo() => "+ip.getHostName()); //�����θ��� ��ȯ�����ִ� �޼���
		System.out.println("printInfo() => "+ip.getHostAddress()); //�ش� �����ο� ���� ���� ip�ּҸ� ��ȯ�����ִ� �޼ҵ�
		System.out.println("printInfo() => "+ip.toString()); //�����ΰ� ip�� ��ȯ�ϴ� �޼���
		System.out.println();
	}

}
