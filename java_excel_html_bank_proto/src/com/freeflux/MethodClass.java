package com.freeflux;

public class MethodClass {


	
	public MethodClass() {
	}
	
	public static int fromConsole() {

		return 0;
	}
	
	public static String createTags() {
		String tags="";

		tags = tags + "<!doctype html>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Bank Data List</title></head>";
		tags = tags + "<body>";
		
		tags = tags + "<table border='1'>";
		tags = tags + "<tr>";
		
		String[] headers={"��ȣ", "����", "����", "��ȥ����", "�з�", "������", "����", "�������", "���Կ�", "���Կ���", "�Ⱓ"};

		tags = tags + "</table>";  // table �ݱ�
		tags = tags + "</body>"; // body �ݱ�
		tags = tags + "</html>"; // html �ݱ�
		
		return tags;
	}

	
}
