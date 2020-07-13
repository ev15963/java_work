package com.lsw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {

	public FileReadClass() {

	}// ������ END

	public void readDirectoryAndFiles() {
		//File => ���� �Ǵ� ����(���丮) �˻�
		File f = new File("C:/filetest/memo.txt");
		System.out.println(f.length());	//���� ũ�� 
		System.out.println(f.isFile());	//�������� ���� : boolean
		System.out.println(f.canRead());//�бⰡ�� ���� : boolean
		System.out.println(f.canWrite());//���Ⱑ�� ���� : boolean
		System.out.println(f.lastModified());//������ ������ : 10������
		//1970.1.1 0�� 0�� 0�� ��������� �ð�..
//		String[] files = (f.list();
//		for (String name : files) {
//			System.out.println(name);
//
//		}
	}

	/** c://filetest�� memo.txt ������ �д� �޼��� **/
	public void readFile() {
		// 1.���� ��θ� ����
		String uri = "C:\\work\\file_exception\\src\\com\\lsw\\FileReadClass.java";

		// 2.��θ��� �̿��Ͽ� �ش� ���� �б�
		// FileReader f=new FileReader("��θ�");
		FileReader fr = null;

		//3. ���� ������ �ٴ����� �о���� �� �ִ� Ŭ����(��ü) :
		//BufferedReader.class (java.io ��Ű��)
		//BufferedReader br = new BufferedReader(FileReader��ü);
		//BufferedReader�� readLine()�� �̿�..
		
		BufferedReader br=null;
		try {
			fr = new FileReader(uri);
			System.out.println("�б� ����");
			
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
		} // �ܺ��ڿ� ����Ϸ��� ����ó�� �ʿ�
	} // readFile() END

}// class END
