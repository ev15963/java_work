package com.lsw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {

	public FileReadClass() {

	}// 생성자 END

	public void readDirectoryAndFiles() {
		//File => 파일 또는 폴더(디렉토리) 검색
		File f = new File("C:/filetest/memo.txt");
		System.out.println(f.length());	//파일 크기 
		System.out.println(f.isFile());	//파일인지 여부 : boolean
		System.out.println(f.canRead());//읽기가능 여부 : boolean
		System.out.println(f.canWrite());//쓰기가능 여부 : boolean
		System.out.println(f.lastModified());//마지막 수정일 : 10진수로
		//1970.1.1 0시 0분 0초 현재까지의 시간..
//		String[] files = (f.list();
//		for (String name : files) {
//			System.out.println(name);
//
//		}
	}

	/** c://filetest의 memo.txt 파일을 읽는 메서드 **/
	public void readFile() {
		// 1.파일 경로명 설정
		String uri = "C:\\work\\file_exception\\src\\com\\lsw\\FileReadClass.java";

		// 2.경로명을 이용하여 해당 파일 읽기
		// FileReader f=new FileReader("경로명");
		FileReader fr = null;

		//3. 파일 내용을 줄단위로 읽어들일 수 있는 클래스(객체) :
		//BufferedReader.class (java.io 패키지)
		//BufferedReader br = new BufferedReader(FileReader객체);
		//BufferedReader의 readLine()를 이용..
		
		BufferedReader br=null;
		try {
			fr = new FileReader(uri);
			System.out.println("읽기 성공");
			
			br=new BufferedReader(fr);
			String sLine = null;
//			System.out.println(sLine+"dd");
			while ((sLine=br.readLine())!= null) {
				System.out.println(sLine);
			}
			String line=br.readLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} // 외부자원 사용하려면 예외처리 필요
	} // readFile() END

}// class END
