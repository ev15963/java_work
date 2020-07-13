package com.lsw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {

	String uri="c:/filetest/java.html";
	public FileWriteClass() {
		
	}
	FileWriter fw=null;
	/**지정한 파일에 내용 적기**/
	public void writeFile() {
		try {
			
			
			fw=new FileWriter(uri);
			System.out.println("파일쓰기 준비 완료");
			fw.write("<!doctype html>");
			fw.write("<html>");
			fw.write("<head><title>java => html </title></head>");
			fw.write("<body>");
			fw.write("<img src='./kart.JPG' />");
			fw.write("<a href='https://www.naver.com'>네이버</a>");
			fw.write("</body>");
			fw.write("</html>");
			System.out.println("파일 쓰기 완료");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}//writeFile() END
}//class END
