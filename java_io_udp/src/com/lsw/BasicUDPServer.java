package com.lsw;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport =7777, cport;
	
	public BasicUDPServer() {
	} //�⺻������ END
	
	public BasicUDPServer(int sport) {
		this.sport = sport;
		System.out.println("Server >> ������ �����մϴ�.");
		System.err.println("Server >> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.");
		try {
			this.dsock=new DatagramSocket(sport);
			/**���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ����
			 *DatagramSocket serverSocket = new DatagramSocket(7777)
			 *���� ��ǻ�Ϳ��� ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ����
			 *DatagramSocket clientSocket = new DatagramSocket();
			 ***/
		} catch (Exception e) {
			System.out.println(e);
		}
		/** ���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ����**/
	}
	

}
