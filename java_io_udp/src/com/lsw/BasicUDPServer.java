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
	} //기본생성자 END
	
	public BasicUDPServer(int sport) {
		this.sport = sport;
		System.out.println("Server >> 서버를 시작합니다.");
		System.err.println("Server >> 클라이언트가 접속하길 기다리고 있습니다.");
		try {
			this.dsock=new DatagramSocket(sport);
			/**현재 컴퓨터에서 지정된 포트버호로 데ㅣ터그램 소켓 생성
			 *DatagramSocket serverSocket = new DatagramSocket(7777)
			 *현재 컴퓨터에서 사용 가능한 포트번호로 데이터그램 소켓 생성
			 *DatagramSocket clientSocket = new DatagramSocket();
			 ***/
		} catch (Exception e) {
			System.out.println(e);
		}
		/** 현재 컴퓨터에서 지정된 포트번호로 데이터그램 소켓**/
	}
	

}
