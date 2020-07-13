package com.lsw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadClass {

	public FileReadClass() {

	}// 생성자 END

	public void readDirectoryAndFiles() {
		File f = new File("c:/");
		String[] files = f.list();
		for (String name : files) {
			System.out.println(name);

		}
	}

	/** c://filetest의 memo.txt 파일을 읽는 메서드 **/
	public void readFile() {
		// 1.파일 경로명 설정
		String uri = "c:/filetest/memo.txt";

		// 2.경로명을 이용하여 해당 파일 읽기
		// FileReader f=new FileReader("경로명");
		FileReader f = null;

		try {
			f = new FileReader(uri);
			System.out.println("읽기 성공");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} // 외부자원 사용하려면 예외처리 필요
	} // readFile() END

}// class END
