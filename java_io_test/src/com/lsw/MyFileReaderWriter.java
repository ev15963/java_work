package com.lsw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {
	public static void main(String[] args) {
		int data; //읽을 파일 이름 지정
		
		String inFname= "src/com/lsw/MyFileReaderWriter.java";
		String outFname = "src/com/lsw/MyFileReaderWriter.back";	
		
		try {
			//읽을 파일 이름으로 FileReader 생성
			FileReader fr = new FileReader(inFname);
			
			//다시 출력할 파일 이름으로 FileWriter 생성
			FileWriter fw = new FileWriter(outFname);
			
			//한 문자씩 읽어 콘솔과 파일에 출력
			while ((data = fr.read()) != -1) { //read 메서드 한 글자에 대한 값을 변환한다 더 이상 없을 때는 -1을 반환
				System.out.println((char) data); //byte 코드 값ㅇ으로 나오기 때문에 char 형변환 시켜야 확인 가능 한문자로 읽는다
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println();
			System.out.println("위 파일이 생성되었습니다.:"+outFname);
		} catch (FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다."+inFname);
		} catch (IOException e) {
			System.err.println(e);
		}
	}



}
