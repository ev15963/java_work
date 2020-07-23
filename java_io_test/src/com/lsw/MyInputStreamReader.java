package com.lsw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
	public static void main(String[] args) {
		String line;
		//���� ���� �̸� ����
		String fname="src/com/lsw/MyInputStreamReader.java";
		
		try {
			//���� ���� �̸����� FileInputStream ����
			FileInputStream fis= new FileInputStream(fname);
			
			//���� �Է½�Ʈ���� �ٽ� InputStreamReader�� ����
			InputStreamReader isr = new InputStreamReader(fis);
			
			//���� �Է½�Ʈ���� �ٽ� InputStreamReader�� ����
			BufferedReader br = new BufferedReader(isr);
			
			//���� InputStreamReader�� ���ڵ� ���  ���
			System.out.println("getEncoding() => "+isr.getEncoding()); //InputStreamReader�� ���ڵ��� ���� �ִ�..
			System.out.println();
			//���پ� �о� ���
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("���������� �����ϴ�.: "+fname);
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println();
	}
	public MyInputStreamReader() {
		// TODO Auto-generated constructor stub
	}

}
