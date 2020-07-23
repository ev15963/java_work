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
	int sport = 7777, cport; //������ ��Ʈ��ȣ, Ŭ���̾�Ʈ���� ������� ��Ʈ

	public BasicUDPServer() {
	} // �⺻������ END

	public BasicUDPServer(int sport) { //��Ʈ��ȣ 
		this.sport = sport;
		System.out.println("Server >> ������ �����մϴ�.");
		System.err.println("Server >> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.");
		try {
			this.dsock = new DatagramSocket(sport);
			/**
			 * ���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ���� 
			 * DatagramSocket serverSocket = new DatagramSocket(7777);
			 * ���� ��ǻ�Ϳ��� ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ���� 
			 * DatagramSocket clientSocket = new DatagramSocket();
			 ***/
		} catch (Exception e) {
			System.out.println(e);
		}
		/** ���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� **/
	}

	/** Ŭ���̾�Ʈ�� �����ϴ� �޼��� **/
	public void communicate() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in); //������ �ڵ����� �ȵ� �о�帲
			BufferedReader br = new BufferedReader(isr);
			while (true) { //���ѷ����� ������
				byte[] buffer = new byte[1024];

				// Ŭ���̾�Ʈ���� ���۵Ǵ� DatagramPacket�� �ޱ� ����
				// rPack ������ �� ���
				rPack = new DatagramPacket(buffer, buffer.length);
				//���� �� �ִ� ��Ŷ�� �������� Ŭ���̾�Ʈ�� �����͸� �����ϸ� receive�� �޾ƹ��� Ŭ���̾�Ʈ ���ñ��
				dsock.receive(rPack);// ���۹��� ����� ���ڿ��� ��ȯ,
				// String(byte[] bytes, int offset, int length)
				//srtln ���ڿ� ����
				String strln = new String(rPack.getData(), 0, rPack.getData().length);

				// Ŭ���̾�Ʈ�� �ּҿ� ��Ʈ��ȣ�� ��ȯ
				client = rPack.getAddress(); //Ŭ���̾�Ʈ �ּ�
				cport = rPack.getPort(); //Ŭ���̾�Ʈ ��Ʈ��ȣ

				// ���۹��� ����� ����ϰ� quit�̸� ����
				System.out.println("[Ŭ���̾�Ʈ�κ���" + client + ": " + cport + "]" + strln); //Ŭ���̾�Ʈ�� quit�� �����ϱ� ������

				if (strln.trim().equals("quit")) {
					break;
				}

				// ǥ���Է������Էµ� ������ DatagramPacket���� �����
				// Ŭ���̾�Ʈ�� ����
				String strOut = br.readLine(); //�Է��� �����͸� �о� DatagramPacket���� ����
				//���� ��Ű���� Ŭ���̾�Ʈ���� ����
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);//Ŭ���̾�Ʈ �����Ͽ� ��ü�� ����
				dsock.send(sPack);
			}

			System.out.println("UDP ������ �����մϴ�.");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
