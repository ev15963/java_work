package com.lsw;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPServer {
 DatagramSocket dsock;   // ��ȣ�� ����� �� �ִ� ����
 DatagramPacket sPack, rPack;  // Ŭ���̾�Ʈ�� sPack : send / rPack : receive
 InetAddress client;      // Ŭ���̾�Ʈ �ּ�
 int sport = 7777, cport;   // Ŭ���̾�Ʈ ���� ��Ʈ ��ȣ
 
 public BasicUDPServer() {
 } // �⺻ ������ END
 
 public BasicUDPServer(int sport) {
  try {
   //DatagramPacket�� sport�� �����Ͽ� ����
   this.sport = sport;
   System.out.println("Server >> ������ �����մϴ�."); 
   System.out.println("Server >> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�."); 
   System.out.println("-------------------------");
   this.dsock = new DatagramSocket(sport);
   /**���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ���� 
        DatagramSocket serverSocket = new DatagramSocket(7777);
       ���� ��ǻ�Ϳ��� ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ���� 
        DatagramSocket clientScoket = new DatagramSocket();
   **/
  } catch (Exception e) {
   System.out.println(e);
  }  
 } // BasicUDPServer() ������ END
 
 
 
 /** Ŭ���̾�Ʈ�� �����ϴ� �޼��� **/ 
 public void communicate() {
  try {
   // Ű����κ��� ������ ���ڿ��� �Է¹ޱ� ���� 
   // BufferedReader ���·� ��ȯ
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   while (true) {
    byte[] buffer = new byte[1024];
    
    // Ŭ���̾�Ʈ���� ���۵Ǵ� DatagramPacket�� �ޱ� ���� 
    // rPack ������ �� ��� 
    rPack = new DatagramPacket(buffer, buffer.length);
    dsock.receive(rPack); //Ŭ���̾�Ʈ�� �����͸� �����ϸ�
    
    // ���۹��� ����� ���ڿ��� ��ȯ, 
    // String(byte[] bytes, int offset, int length):������,������,�󸶸�ŭ 
    String strIn = new String(rPack.getData(), 0, rPack.getData().length);
    
    // Ŭ���̾�Ʈ�� �ּҿ� ��Ʈ��ȣ�� ��ȯ 
    client = rPack.getAddress(); 
    cport = rPack.getPort();   
    
    // ���۹��� ����� ����ϰ� quit�̸� ����
    System.out.println("[Ŭ���̾�Ʈ�κ���"+client+": "+cport+ "]"+strIn);
    
    if (strIn.trim().equals("quit")) {
     break;    
    }
    
    // ǥ���Է����� �Էµ� ������ DatagramPacket���� ����� 
    // Ŭ���̾�Ʈ�� ����
    String strOut = br.readLine();
    sPack = new DatagramPacket(strOut.getBytes(), 
                  strOut.getBytes().length, 
                  client, 
                  cport);
    dsock.send(sPack);
   } // while() END
   
   System.out.println("UDP ������ �����մϴ�.");
  } catch(Exception e){
   System.out.println(e);
  }  
 } // communicate() END
} // class END
