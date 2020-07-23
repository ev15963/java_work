package com.lsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	public URL url;

	// 접속 사이트를 URL로 지정
	public URLReader(String site) {
		try {
			this.url = new URL(site);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void printPage() {

		try {
			InputStream openURL = url.openStream(); //inputStream으로 반환
			openURL = url.openStream();
			InputStreamReader inputSR = new InputStreamReader(openURL);
			BufferedReader inputBuffer = new BufferedReader(inputSR);

			String inLine = null;
			while ((inLine = inputBuffer.readLine()) != null) { //한줄씩 출력 (데이터가 없을때까지)
				System.out.println("readLine() => " + inLine);
			}
		} catch (IOException e) {
			System.out.println("readLine err"+e.getMessage());
		}

	}
	//접속한 페이지의 정보를 간단히 표준출력에 출력
	public void printConnectionInfo() {
		URLConnection conn;
		try {
			conn = url.openConnection();
			conn.getConnectTimeout(); //접속에 성공된 시간을 숫자로반환
//			conn.getContent() //하나의 객체로 반환
//			conn.getContentEncoding() 하나의 인코딩인 무엇인지
//			conn.getContentLength() 접속한 것의 길이값
//			conn.getContentLengthLong() 범위가 더커짐
//			conn.getContentType() html4 방식 메서드 
			System.out.println("openConection =>"+conn); //openConnection을 이용하여 정보를 만듬
		} catch (IOException e) {
			System.out.println("openConection err"+e.getMessage());
		}
	}
}
