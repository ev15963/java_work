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
			System.err.println("������ ��Ʈ ��ȣ�� ������ �� �����ϴ�.: 5555");
			System.exit(1);
		}
		
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept(); //�����ߴ��� Ȯ�ΰ��� �޼ҵ� 
		} catch (IOException e) {
			System.err.println("accept() ����");
			System.exit(1);
		}
		
		// Ŭ���̾�Ʈ�� ��źк� ��
		// Ŭ���̾�Ʈ�� ��Ž���
		// PrintWriter out�� Ŭ���̾�Ʈ���� �����ϱ� ���� 
	}

}
