package com.lsw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {
	public static void main(String[] args) {
		int data; //���� ���� �̸� ����
		
		String inFname= "src/com/lsw/MyFileReaderWriter.java";
		String outFname = "src/com/lsw/MyFileReaderWriter.back";	
		
		try {
			//���� ���� �̸����� FileReader ����
			FileReader fr = new FileReader(inFname);
			
			//�ٽ� ����� ���� �̸����� FileWriter ����
			FileWriter fw = new FileWriter(outFname);
			
			//�� ���ھ� �о� �ְܼ� ���Ͽ� ���
			while ((data = fr.read()) != -1) { //read �޼��� �� ���ڿ� ���� ���� ��ȯ�Ѵ� �� �̻� ���� ���� -1�� ��ȯ
				System.out.println((char) data); //byte �ڵ� �������� ������ ������ char ����ȯ ���Ѿ� Ȯ�� ���� �ѹ��ڷ� �д´�
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println();
			System.out.println("�� ������ �����Ǿ����ϴ�.:"+outFname);
		} catch (FileNotFoundException e) {
			System.err.println("���� ������ �����ϴ�."+inFname);
		} catch (IOException e) {
			System.err.println(e);
		}
	}



}
