package com.lsw;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPClient {
 DatagramSocket dsock;   // 상호간 통신할 수 있는 소켓
 DatagramPacket sPack, rPack;  // 서버로 sPack : send / rPack : receive
 InetAddress server;      // 서버 주소
 int port = 8888;      // 서버 접속 포트 번호
 
 public BasicUDPClient() {
 } // 기본 생성자 END
 
 public BasicUDPClient(String ip, int port) {
  try {
   // DatagramPacket에 들어갈 ip 주소가 InetAddress 형태여야 함
   server = InetAddress.getByName(ip);
   this.port = port;
   this.dsock = new DatagramSocket();
   System.out.println("Client >> 서버에 접속합니다."); 
   System.out.println("Client>> 서버에 전달할 메시지를 쓰고 Enter!!!!."); 
   System.out.println("Client>> 종료하려면 quit를 쓰고 Enter!!!!");
   System.out.println("============================");
  } catch (Exception e) {
   System.out.println(e);
  }  
 } // BasicUDPClient() 생성자 END
 
 /** 서버와 소통하는 메서드 **/ 
 public void communicate() {
  try {
   // 키보드로부터 서버에게 전송할 문자열을 입력받기 위해 
   // System.in을 BufferedReader 형태로 변환
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   
   String strOut = null;
   while ((strOut = br.readLine()) != null) {
    //DatagramPacket에 입력 줄을 저장하고 서버에 전송 
    sPack = new DatagramPacket(strOut.getBytes(), 
                strOut.getBytes().length, 
                server, 
                port);
    dsock.send(sPack);  
    
    //서버에 quit를 전송하면 종료
    if (strOut.equals("quit")) {
     break;
    }
   
    //서버로부터 수신되는 DatagramPacket을 받아 표준출력 
    byte[] buffer = new byte[1024];
    
    // 서버로부터 전송되는 DatagramPacket을 받기 위해 
    // rPack 생성한 후 대기 
    rPack = new DatagramPacket(buffer, buffer.length);
    dsock.receive(rPack);
    
    // 전송받은 결과를 문자열로 변환, 
    // String(byte[] bytes, int offset, int length) 
    String strIn = new String(rPack.getData(), 0, rPack.getData().length);
    
    System.out.println("[서버로부터"+ server + ": " + port + "]" + strIn);
   } // while() END
   
   System.out.println("UDP 클라이언트를 종료합니다.");
  } catch(Exception e){
   System.out.println(e);
  }  
 }// communicate() END
} // class END
