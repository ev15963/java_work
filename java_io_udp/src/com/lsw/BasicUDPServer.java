package com.lsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPServer {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport; //서버쪽 포트번호, 클라이언트서버 저장받을 포트

	public BasicUDPServer() {
	} // 기본생성자 END

	public BasicUDPServer(int sport) { //포트번호 
		this.sport = sport;
		System.out.println("Server >> 서버를 시작합니다.");
		System.err.println("Server >> 클라이언트가 접속하길 기다리고 있습니다.");
		try {
			this.dsock = new DatagramSocket(sport);
			/**
			 * 현재 컴퓨터에서 지정된 포트버호로 데ㅣ터그램 소켓 생성 
			 * DatagramSocket serverSocket = new DatagramSocket(7777);
			 * 현재 컴퓨터에서 사용 가능한 포트번호로 데이터그램 소켓 생성 
			 * DatagramSocket clientSocket = new DatagramSocket();
			 ***/
		} catch (Exception e) {
			System.out.println(e);
		}
		/** 현재 컴퓨터에서 지정된 포트번호로 데이터그램 소켓 **/
	}

	/** 클라이언트와 소통하는 메서드 **/
	public void communicate() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in); //대기상태 코드진행 안됨 읽어드림
			BufferedReader br = new BufferedReader(isr);
			while (true) { //무한루프로 대기상태
				byte[] buffer = new byte[1024];

				// 클라이언트에서 전송되는 DatagramPacket을 받기 위해
				// rPack 생성한 후 대기
				rPack = new DatagramPacket(buffer, buffer.length);
				//받을 수 있는 패킷을 만들어놓음 클라이언트가 데이터를 전달하면 receive가 받아버림 클라이언트 감시기능
				dsock.receive(rPack);// 전송받은 결과를 문자열로 변환,
				// String(byte[] bytes, int offset, int length)
				//srtln 문자열 생성
				String strln = new String(rPack.getData(), 0, rPack.getData().length);

				// 클라이언트의 주소와 포트번호를 반환
				client = rPack.getAddress(); //클라이언트 주소
				cport = rPack.getPort(); //클라이언트 포트번호

				// 전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트로부터" + client + ": " + cport + "]" + strln); //클라이언트가 quit을 전송하기 전까지

				if (strln.trim().equals("quit")) {
					break;
				}

				// 표준입력으로입력된 정보를 DatagramPacket으로 만들어
				// 클라이언트에 전송
				String strOut = br.readLine(); //입력한 데이터를 읽어 DatagramPacket으로 보냄
				//만든 패키지를 클라이언트에게 보냄
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);//클라이언트 지정하여 객체를 보냄
				dsock.send(sPack);
			}

			System.out.println("UDP 서버를 종료합니다.");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
