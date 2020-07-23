package com.lsw;

import java.io.File;
import java.sql.Date;

public class FileInfo {
	public static void main(String[] args) {
		//���� ���� �̸� ����
		String fname="src/com/lsw/FileInfo.java";
		//File ��ü ����
		File f = new File(fname);
		System.out.println("����"+f.getName()+"����:"); //���ϸ�
		System.err.println();
		System.out.println("\t�н�:"+f.getPath()); //����� ���ʿ� �ַ� ���
		System.out.println("\t�����н�:"+f.getAbsolutePath()); //������ : ����̺��:\ 
		System.out.println("\t�θ�:"+f.getParent()); //������ ������ �θ��ּ�
		System.out.println("\t���⿩��:"+f.canWrite()); // �� �� �ִ� �������� boolean������ ��ȯ
		System.out.println("\t�б⿩��:"+f.canRead());	//���� �� �ִ� �������� boolean������ ��ȯ
		System.out.println("\t���Ͽ���:"+f.isFile()); //������ ���� boolean ������ ��ȯ 
		System.out.println("\t��������:"+f.isDirectory()); //�������� boolean ������ ��ȯ
		System.out.println("\t������:"+new Date(f.lastModified())); // ���� ��¥���� ���ڷ� ��ȯ
		System.out.println("\t����ũ��:"+f.length()); // ������ ũ�� byte ����
		
		//new Date() : ������ ��¥�� �ٲ��ִ� ����
	}
	
}
