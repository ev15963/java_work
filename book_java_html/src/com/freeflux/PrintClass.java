package com.freeflux;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	public PrintClass() { // �⺻ ������
	} // ������ END
	
	
	/** �ܺηκ��� ���޵� ���ڿ��� �̿��Ͽ� html ������ �����ϴ� �޼��� **/
	public static void makeHTML(String tags) {
		String  uri="c:/filetest/bookList.html";	// ���� ��� �� ����.html
		System.out.println(uri);
		
		FileWriter fw=null;	// ����.html ���ο� HTML �±׸� ���� ���� ��ü ����  
		
		try {
			fw=new FileWriter(uri); 	// ���� ���� ��ü ����
			System.out.println("fw");
			
			fw.write(tags); 				// tag �� ���Ͽ� ����
			System.out.println("fw.write(tags);");
			
			fw.close();					// �������� ��, close()
			System.out.println("fw.close();	");
			
			System.out.println("html ���� ���� �� ���� ���� ");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // makeHTML() END

} // class END




