package com.lsw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		// 읽을 파일 이름 지정
		String fname = "src/com/lsw/newfiles.txt"; // 핸져 파일 없는 상태
		// File 객체 생성
		File f = new File(fname);

		// 실제 newfile.txt. 파일 존재 여부 확인
		if (!f.exists()) { //! not
			System.out.println("다음 파일을 찾을 수 없습니다.:" + fname);
		}
		// 새로이 파일을 만들어 문자열 쓰기
		try {
			f.createNewFile(); //File 객체의 파일 생성 메서드
			if (f.exists()) { //File 객체.exist()는 존재(true)
				System.out.println("다음 파일이 없습니다.:" + fname);
			}

			FileWriter fr;
			fr = new FileWriter(f);
			fr.write("파일 내용이 들어갑니다.");
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public CreateFile() {
		// TODO Auto-generated constructor stub
	}

}
