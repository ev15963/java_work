package com.lsw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		// ���� ���� �̸� ����
		String fname = "src/com/lsw/newfiles.txt"; // ���� ���� ���� ����
		// File ��ü ����
		File f = new File(fname);

		// ���� newfile.txt. ���� ���� ���� Ȯ��
		if (!f.exists()) { //! not
			System.out.println("���� ������ ã�� �� �����ϴ�.:" + fname);
		}
		// ������ ������ ����� ���ڿ� ����
		try {
			f.createNewFile(); //File ��ü�� ���� ���� �޼���
			if (f.exists()) { //File ��ü.exist()�� ����(true)
				System.out.println("���� ������ �����ϴ�.:" + fname);
			}

			FileWriter fr;
			fr = new FileWriter(f);
			fr.write("���� ������ ���ϴ�.");
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public CreateFile() {
		// TODO Auto-generated constructor stub
	}

}
