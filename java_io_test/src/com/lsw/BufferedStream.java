package com.lsw;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream {
	/**
	 * Buffered~~: 처리속도를 빠르게 하기 위함 BufferedReader : FileReader / BufferedWriter :
	 * FileWriter
	 * 
	 * ~~~~ Stream : 바이트코드 단위로 입출력 바이트코드(두 개의 정수로 구성된 문자) 주로 인터넷 라인(유무선)을 통한 입출력에서
	 * 사용 BufferedInputStream / BufferedOutputSteam FileInputStream /
	 * FileOutputSteam
	 */

	public static void main(String[] args) {
		FileOutputStream fos;
		BufferedInputStream bis;
		BufferedOutputStream bos;
		String fname = "src/com/lsw/test.buff";
		/**
		 * .bak 백업파일 /.db 데이터벵스 파일 / .dat 데이터파일 .js 자바스크립트 파일 / .css 스타일시트 .jsp jsp파일
		 * /.buff, .bff 버퍼파일
		 **/

		try {
			// 새로 만들 파일 이름으로 FileOutputSteam 생성
			fos = new FileOutputStream(fname);
			// 또는 fos = new newFileOutputStream("src/com/lsw/test.buff");

			bos = new BufferedOutputStream(fos);
			byte data[] = { 'A', 'B', 'C', 'D', 'E' }; // 5개 방 생성\
			//data=>[65,66,6,68,69]
			System.out.println(Arrays.toString(data));
			// 한 바이트씩 읽어 FileOutputStream으로 출력 즉, test.buff에 쓰기
			bos.write(data, 0, 5); // byte 읽고 byte로 보냄 byte 배열
			// byte[], startIndex, length(갯수)
			// data에 있는 데이터를 읽어서 쓰기
			// data의 0번 부터 5개를..
			bos.close();

			fos.close(); // 저장 후 닫기
			System.out.println(fname + ":파일이 생성되었습니다.");

			// 읽을 파일 이름으로 FileInputStream 생성
			bis = new BufferedInputStream(new FileInputStream(fname));
			FileInputStream ff = new FileInputStream(fname);
			bis = new BufferedInputStream(ff);

			data = new byte[10]; // 5개 (A,B,C,D,E) => 10개
			bis.read(data, 0, 10); // byte[], startIndex, 갯수
			// bis내부에 있는 데이터(A,B,C,D,E)를 data배열의 0번 인덱스 부터 채워라.. 10개를
			// 0 1 2 3 4
			bis.close();

			System.out.println(Arrays.toString(data));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
