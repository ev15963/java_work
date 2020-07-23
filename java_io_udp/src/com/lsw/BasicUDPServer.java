package com.lsw;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPServer {
 DatagramSocket dsock;   // 상호간 통신할 수 있는 소켓
 DatagramPacket sPack, rPack;  // 클라이언트로 sPack : send / rPack : receive
 InetAddress client;      // 클라이언트 주소
 int sport = 7777, cport;   // 클라이언트 접속 포트 번호
 
 public BasicUDPServer() {
 } // 기본 생성자 END
 
 public BasicUDPServer(int sport) {
  try {
   //DatagramPacket을 sport로 지정하여 생성
   this.sport = sport;
   System.out.println("Server >> 서버를 시작합니다."); 
   System.out.println("Server >> 클라이언트가 접속하길 기다리고 있습니다."); 
   System.out.println("-------------------------");
   this.dsock = new DatagramSocket(sport);
   /**현재 컴퓨터에서 지정된 포트번호로 데이터그램 소켓 생성 
        DatagramSocket serverSocket = new DatagramSocket(7777);
       현재 컴퓨터에서 사용 가능한 포트번호로 데이터그램 소켓 생성 
        DatagramSocket clientScoket = new DatagramSocket();
   **/
  } catch (Exception e) {
   System.out.println(e);
  }  
 } // BasicUDPServer() 생성자 END
 
 
 
 /** 클라이언트와 소통하는 메서드 **/ 
 public void communicate() {
  try {
   // 키보드로부터 전송할 문자열을 입력받기 위해 
   // BufferedReader 형태로 변환
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   while (true) {
    byte[] buffer = new byte[1024];
    
    // 클라이언트에서 전송되는 DatagramPacket을 받기 위해 
    // rPack 생성한 후 대기 
    rPack = new DatagramPacket(buffer, buffer.length);
    dsock.receive(rPack); //클라이언트가 데이터를 전달하면
    
    // 전송받은 결과를 문자열로 변환, 
    // String(byte[] bytes, int offset, int length):무엇을,어디부터,얼마만큼 
    String strIn = new String(rPack.getData(), 0, rPack.getData().length);
    
    // 클라이언트의 주소와 포트번호를 반환 
    client = rPack.getAddress(); 
    cport = rPack.getPort();   
    
    // 전송받은 결과를 출력하고 quit이면 종료
    System.out.println("[클라이언트로부터"+client+": "+cport+ "]"+strIn);
    
    if (strIn.trim().equals("quit")) {
     break;    
    }
    
    // 표준입력으로 입력된 정보를 DatagramPacket으로 만들어 
    // 클라이언트에 전송
    String strOut = br.readLine();
    sPack = new DatagramPacket(strOut.getBytes(), 
                  strOut.getBytes().length, 
                  client, 
                  cport);
    dsock.send(sPack);
   } // while() END
   
   System.out.println("UDP 서버를 종료합니다.");
  } catch(Exception e){
   System.out.println(e);
  }  
 } // communicate() END
} // class END
