package com.lsw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
	public static void main(String[] args) {
		int data;
		//���� ���� �̸� ����
		String fname="src/com/lsw/ReadFiles.java";
		
		try {
			//���� ���� �̸����� FileInputStream ����
			FileInputStream fis = new FileInputStream(fname);
			
			//�� ����Ʈ��(�����ڵ尪) �о� ���ڷ� ��ȯ�Ͽ� ���
			while((data=fis.read()) != -1) {
				char c = (char) data;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			System.err.println("���� ������ �����ϴ�:"+fname);
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}
	public ReadFiles() {
		// TODO Auto-generated constructor stub
	}

}
