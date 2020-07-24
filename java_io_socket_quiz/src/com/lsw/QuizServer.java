package com.lsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {

	public static void main(String[] args) throws Exception{
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
		// PrintWriter out�� Ŭ���̾�Ʈ���� �����ϱ� ���� ��ü
		OutputStream clientOut=clientSocket.getOutputStream();
		PrintWriter out =new PrintWriter(clientOut, true);
		
		//InputStreamReader isr �� BufferedReader in�� Ŭ���̾�Ʈ�� �Է��� ����
		InputStream clientInput = clientSocket.getInputStream();
		InputStreamReader isr = new InputStreamReader(clientInput);
		BufferedReader in = new BufferedReader(isr);
		
		//String inputLine�� BufferedReader in�� �����͸� ����
		//String outputLine�� Ŭ���̾�Ʈ���� ������ �޽��� ����
		String inputLine, outputLine;
		
		//�������
		
		//��� �����ϱ� ���� ��ü����
		QuizProtocol qp = new QuizProtocol();
		
		//���� ���μ��� ����
		outputLine = qp.process(null); 
		/** qp.process(null);
		 * �ʱ� client�κ��� ���޹��� ���� �����Ƿ� null�� �����Ͽ�
		 * ���μ��� ���� //"��� �����մϴ�."
		 * ���� client�� ������ ������ ����...
		 * **/
		out.println(outputLine);		//"��� �����մϴ�.(y/n)"�� client���� ����
		//Ŭ���̾�Ʈ���� ����
		//�Ʒ� �κ��� client�� �Է°��� �������� ��� ���� �������� �Ͻ�����!!
		//client : "y", "Y" �Է��� ,������ �����ϸ�
		//client : "java.net" �Է� ��, ������ �����ϸ�
		while ((inputLine = in.readLine())!= null) {
			outputLine = qp.process(inputLine); //'y', "Y"
						//qp.process('y');, qp.process("y");
						//qp.process("java.net");
			out.println(outputLine);	//��Ʈ��ũ ó�� ��Ű����?�� client���� ���� quit;
			//2.���� (y/n)�Ǵ� ���� (y/n)�� client���� ���� protocol
			if(outputLine.equals("quit")) {
				break;
			}
		} //while() END
		out.close(); in.close(); clientSocket.close(); serverSocket.close();
	} //main END

} //class END