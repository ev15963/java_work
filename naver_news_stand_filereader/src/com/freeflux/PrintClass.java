package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	public PrintClass() { // �⺻ ������
	} // ������ END
	
	
	/** �ܺηκ��� ���޵� ���ڿ��� �̿��Ͽ� html ������ �����ϴ� �޼��� **/
	public static void makeHTML(String tags) {
		String  uri="c:/filetest/news_FileReader_String_FileReader.html";	// ���� ��� �� ����.html
		
		FileWriter fw=null;	// ����.html ���ο� HTML �±׸� ���� ���� ��ü ����  
		
		try {
			fw=new FileWriter(uri); 	// ���� ���� ��ü ����
			fw.write(tags); 				// tag �� ���Ͽ� ����
			fw.close();					// �������� ��, close()
			System.out.println("html ���� ���� �� ���� ���� ");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // makeHTML() END

} // class END




