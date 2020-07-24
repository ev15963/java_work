package com.lsw;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket=new ServerSocket(5555);
		} catch (IOException e) {
			System.err.println("다음으 포트 번호에 연결할 수 없습니다.: 5555");
			System.exit(1);
		}
		
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept(); //접속했는지 확인가능 메소드 
		} catch (IOException e) {
			System.err.println("accept() 실패");
			System.exit(1);
		}
		
		// 클라이언트와 통신분비 끝
		// 클라이언트아 통신시작
		// PrintWriter out은 클라이언트에게 전송하기 위한 
	}

}
