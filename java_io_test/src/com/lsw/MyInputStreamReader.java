package com.lsw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
	public static void main(String[] args) {
		String line;
		//읽을 파일 이름 지정
		String fname="src/com/lsw/MyInputStreamReader.java";
		
		try {
			//읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis= new FileInputStream(fname);
			
			//파일 입력스트럼을 다시 InputStreamReader로 연결
			InputStreamReader isr = new InputStreamReader(fis);
			
			//파일 입력스트림을 다시 InputStreamReader로 연결
			BufferedReader br = new BufferedReader(isr);
			
			//현재 InputStreamReader의 인코딩 방식  출력
			System.out.println("getEncoding() => "+isr.getEncoding()); //InputStreamReader만 인코딩값 갖고 있다..
			System.out.println();
			//한줄씩 읽어 출력
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("디음파일이 업습니다.: "+fname);
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}
	public MyInputStreamReader() {
		// TODO Auto-generated constructor stub
	}

}
