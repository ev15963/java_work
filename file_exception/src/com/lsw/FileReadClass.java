package com.lsw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadClass {

	public FileReadClass() {

	}// ������ END

	public void readDirectoryAndFiles() {
		//File => ���� �Ǵ� ����(���丮) �˻�
		File f = new File("C:/work/file_exception/bin/com/lsw/MainClass.class");
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
		String uri = "c:/filetest/memo.txt";

		// 2.��θ��� �̿��Ͽ� �ش� ���� �б�
		// FileReader f=new FileReader("��θ�");
		FileReader f = null;

		try {
			f = new FileReader(uri);
			System.out.println("�б� ����");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} // �ܺ��ڿ� ����Ϸ��� ����ó�� �ʿ�
	} // readFile() END

}// class END
