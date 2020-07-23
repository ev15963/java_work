package com.lsw;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPClient {
 DatagramSocket dsock;   // ��ȣ�� ����� �� �ִ� ����
 DatagramPacket sPack, rPack;  // ������ sPack : send / rPack : receive
 InetAddress server;      // ���� �ּ�
 int port = 8888;      // ���� ���� ��Ʈ ��ȣ
 
 public BasicUDPClient() {
 } // �⺻ ������ END
 
 public BasicUDPClient(String ip, int port) {
  try {
   // DatagramPacket�� �� ip �ּҰ� InetAddress ���¿��� ��
   server = InetAddress.getByName(ip);
   this.port = port;
   this.dsock = new DatagramSocket();
   System.out.println("Client >> ������ �����մϴ�."); 
   System.out.println("Client>> ������ ������ �޽����� ���� Enter!!!!."); 
   System.out.println("Client>> �����Ϸ��� quit�� ���� Enter!!!!");
   System.out.println("============================");
  } catch (Exception e) {
   System.out.println(e);
  }  
 } // BasicUDPClient() ������ END
 
 /** ������ �����ϴ� �޼��� **/ 
 public void communicate() {
  try {
   // Ű����κ��� �������� ������ ���ڿ��� �Է¹ޱ� ���� 
   // System.in�� BufferedReader ���·� ��ȯ
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   
   String strOut = null;
   while ((strOut = br.readLine()) != null) {
    //DatagramPacket�� �Է� ���� �����ϰ� ������ ���� 
    sPack = new DatagramPacket(strOut.getBytes(), 
                strOut.getBytes().length, 
                server, 
                port);
    dsock.send(sPack);  
    
    //������ quit�� �����ϸ� ����
    if (strOut.equals("quit")) {
     break;
    }
   
    //�����κ��� ���ŵǴ� DatagramPacket�� �޾� ǥ����� 
    byte[] buffer = new byte[1024];
    
    // �����κ��� ���۵Ǵ� DatagramPacket�� �ޱ� ���� 
    // rPack ������ �� ��� 
    rPack = new DatagramPacket(buffer, buffer.length);
    dsock.receive(rPack);
    
    // ���۹��� ����� ���ڿ��� ��ȯ, 
    // String(byte[] bytes, int offset, int length) 
    String strIn = new String(rPack.getData(), 0, rPack.getData().length);
    
    System.out.println("[�����κ���"+ server + ": " + port + "]" + strIn);
   } // while() END
   
   System.out.println("UDP Ŭ���̾�Ʈ�� �����մϴ�.");
  } catch(Exception e){
   System.out.println(e);
  }  
 }// communicate() END
} // class END
