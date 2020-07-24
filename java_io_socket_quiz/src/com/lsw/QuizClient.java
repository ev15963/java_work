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

	public static void main(String[] args) throws Exception{
		Socket quizSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			// 서버 접속 및 서버로 전송할 데이터 전송준비
			quizSocket = new Socket("localhost", 5555);
			OutputStream quizOut = quizSocket.getOutputStream();
			out=new PrintWriter(quizOut, true);
			
			//서버로부터 전송된 데이터 읽기 준비
			InputStream quizis=quizSocket.getInputStream();
			InputStreamReader quizisr=new InputStreamReader(quizis);
			in = new BufferedReader(quizisr);
			
		} catch (UnknownHostException e) {
			System.err.println("localhost에 접속할 수 없습니다.");
		} catch (IOException e) {
			
		}
		
		//여기부터 서버와 통신 시작
//		BufferedReader user는 사용자가 입력한 답을 읽기
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader user = new BufferedReader(isr);
		String fromServer; //서버로부터 전달된 메시지저장
		String fromUser;	//사용자가 입력한 메시지 저장
		
		//서버로부터 전송된 데이터 읽기
		while((fromServer=in.readLine())!=null) {
			System.out.println("서버 : "+ fromServer);
			if(fromServer.equals("quit")) {
				break;
			}
			
			//client가 입력한 데이터 읽은 후 서버로 전송
			fromUser = user.readLine(); //"y"
			if(fromUser != null) {
				System.out.println("클라이언트: "+ fromServer);
				out.print(fromUser); //서버로 전송
			}
		} // while END
		
		
	}

}
