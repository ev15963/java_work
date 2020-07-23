package com.lsw;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream {
	/**
	 * Buffered~~: ó���ӵ��� ������ �ϱ� ���� BufferedReader : FileReader / BufferedWriter :
	 * FileWriter
	 * 
	 * ~~~~ Stream : ����Ʈ�ڵ� ������ ����� ����Ʈ�ڵ�(�� ���� ������ ������ ����) �ַ� ���ͳ� ����(������)�� ���� ����¿���
	 * ��� BufferedInputStream / BufferedOutputSteam FileInputStream /
	 * FileOutputSteam
	 */

	public static void main(String[] args) {
		FileOutputStream fos;
		BufferedInputStream bis;
		BufferedOutputStream bos;
		String fname = "src/com/lsw/test.buff";
		/**
		 * .bak ������� /.db �����ͺ��� ���� / .dat ���������� .js �ڹٽ�ũ��Ʈ ���� / .css ��Ÿ�Ͻ�Ʈ .jsp jsp����
		 * /.buff, .bff ��������
		 **/

		try {
			// ���� ���� ���� �̸����� FileOutputSteam ����
			fos = new FileOutputStream(fname);
			// �Ǵ� fos = new newFileOutputStream("src/com/lsw/test.buff");

			bos = new BufferedOutputStream(fos);
			byte data[] = { 'A', 'B', 'C', 'D', 'E' }; // 5�� �� ����\
			//data=>[65,66,6,68,69]
			System.out.println(Arrays.toString(data));
			// �� ����Ʈ�� �о� FileOutputStream���� ��� ��, test.buff�� ����
			bos.write(data, 0, 5); // byte �а� byte�� ���� byte �迭
			// byte[], startIndex, length(����)
			// data�� �ִ� �����͸� �о ����
			// data�� 0�� ���� 5����..
			bos.close();

			fos.close(); // ���� �� �ݱ�
			System.out.println(fname + ":������ �����Ǿ����ϴ�.");

			// ���� ���� �̸����� FileInputStream ����
			bis = new BufferedInputStream(new FileInputStream(fname));
			FileInputStream ff = new FileInputStream(fname);
			bis = new BufferedInputStream(ff);

			data = new byte[10]; // 5�� (A,B,C,D,E) => 10��
			bis.read(data, 0, 10); // byte[], startIndex, ����
			// bis���ο� �ִ� ������(A,B,C,D,E)�� data�迭�� 0�� �ε��� ���� ä����.. 10����
			// 0 1 2 3 4
			bis.close();

			System.out.println(Arrays.toString(data));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
