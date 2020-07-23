package com.lsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	public URL url;

	// ���� ����Ʈ�� URL�� ����
	public URLReader(String site) {
		try {
			this.url = new URL(site);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void printPage() {

		try {
			InputStream openURL = url.openStream(); //inputStream���� ��ȯ
			openURL = url.openStream();
			InputStreamReader inputSR = new InputStreamReader(openURL);
			BufferedReader inputBuffer = new BufferedReader(inputSR);

			String inLine = null;
			while ((inLine = inputBuffer.readLine()) != null) { //���پ� ��� (�����Ͱ� ����������)
				System.out.println("readLine() => " + inLine);
			}
		} catch (IOException e) {
			System.out.println("readLine err"+e.getMessage());
		}

	}
	//������ �������� ������ ������ ǥ����¿� ���
	public void printConnectionInfo() {
		URLConnection conn;
		try {
			conn = url.openConnection();
			conn.getConnectTimeout(); //���ӿ� ������ �ð��� ���ڷι�ȯ
//			conn.getContent() //�ϳ��� ��ü�� ��ȯ
//			conn.getContentEncoding() �ϳ��� ���ڵ��� ��������
//			conn.getContentLength() ������ ���� ���̰�
//			conn.getContentLengthLong() ������ ��Ŀ��
//			conn.getContentType() html4 ��� �޼��� 
			System.out.println("openConection =>"+conn); //openConnection�� �̿��Ͽ� ������ ����
		} catch (IOException e) {
			System.out.println("openConection err"+e.getMessage());
		}
	}
}
