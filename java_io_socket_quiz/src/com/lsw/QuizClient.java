package com.lsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {

	public static void main(String[] args) throws IOException{
		Socket quizSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			// ���� ���� �� ������ ������ ������ �����غ�
			quizSocket = new Socket("localhost", 5555);
			OutputStream quizOut = quizSocket.getOutputStream();
			out=new PrintWriter(quizOut, true);
			
			//�����κ��� ���۵� ������ �б� �غ�
			InputStream quizis=quizSocket.getInputStream();
			InputStreamReader quizisr=new InputStreamReader(quizis);
			in = new BufferedReader(quizisr);
			
		} catch (UnknownHostException e) {
			System.err.println("localhost�� ������ �� �����ϴ�.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("����¿���");
			System.exit(1);
		}
		
		//������� ������ ��� ����
//		BufferedReader user�� ����ڰ� �Է��� ���� �б�
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader user = new BufferedReader(isr);
		String fromServer; //�����κ��� ���޵� �޽�������
		String fromUser;	//����ڰ� �Է��� �޽��� ����
		
		//�����κ��� ���۵� ������ �б�
		while((fromServer=in.readLine())!=null) {
			System.out.println("���� : "+ fromServer);
			if(fromServer.equals("quit")) {
				break;
			}
			
			//client�� �Է��� ������ ���� �� ������ ����
			fromUser = user.readLine(); //"y"
			if(fromUser != null) {
				System.out.println("Ŭ���̾�Ʈ: "+ fromUser);
				out.print(fromUser); //������ ����
			}
		} // while END
		
		
	}

}
