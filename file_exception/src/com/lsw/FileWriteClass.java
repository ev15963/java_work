package com.lsw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {

	String uri="c:/filetest/java.html";
	public FileWriteClass() {
		
	}
	FileWriter fw=null;
	/**������ ���Ͽ� ���� ����**/
	public void writeFile() {
		try {
			
			
			fw=new FileWriter(uri);
			System.out.println("���Ͼ��� �غ� �Ϸ�");
			fw.write("<!doctype html>");
			fw.write("<html>");
			fw.write("<head><title>java => html </title></head>");
			fw.write("<body>");
			fw.write("<img src='./kart.JPG' />");
			fw.write("<a href='https://www.naver.com'>���̹�</a>");
			fw.write("</body>");
			fw.write("</html>");
			System.out.println("���� ���� �Ϸ�");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}//writeFile() END
}//class END
