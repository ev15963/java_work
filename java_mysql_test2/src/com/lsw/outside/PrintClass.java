package com.lsw.outside;

import java.io.FileWriter;
import java.io.IOException;

public class PrintClass {

	public PrintClass() {
		
	}
	
	/**�±׵��� .html ���Ϸ� �����ϴ� �޼��� ����**/
	public static void createHTML(String tags) {
		//1. ������ ������ ��� �� ���ϸ�
		String fileName="c:/filetest/list.html";
		
		// 2. ���� ���� ��ü ����
		FileWriter fw;
		try {
			fw = new FileWriter(fileName);
			fw.write(tags); //���� ����
			fw.close(); 	//���� �����ϰ� �ݱ�
		} catch (IOException e) {
			System.out.println("Write ERR:"+e.getMessage());

		}
	}//createHTML() END

}
