package com.freeflux;

import java.util.Scanner;

import com.freeflux.xls.ExcelReader;

public class MethodClass {

	private static int list=10;
	private static int pageNo=1;
	private static int startIndex=0;

	private static String uri="c:/filetest/";
	private static String extension=".xls";
	
	
	public MethodClass() {
	}
	
	public static int fromConsole() {
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("�о���� �������ϸ� �Է� ��) bank_data:");
		String filename=scan.next();
		
		System.out.println("�о���� ��������ȣ �Է� (��, 1):");
		int pageNo=scan.nextInt();
		
		uri= uri+filename+extension;
		System.out.println(uri);
		
		pageNo=pageNo-1; //return ���� +1
		startIndex=pageNo*list+1;
		
		ExcelReader.readExcelFile(uri, startIndex, list);
		uri=null;
		return pageNo+1;
	} //fromConsole() END
	
	public static String createTags() {
		String tags="";

		tags += "<!doctype html>";
		tags += "<html>";
		tags += "<head><title>Bank Data List</title></head>";
		tags += "<body>";
		
		tags += "<table border='1'>";
		tags += "<tr>";
		
		//�迭����
		String[] headers={"��ȣ", "����", "����", "��ȥ����", "�з�", "������", "����", "�������", "���Կ�", "���Կ���", "�Ⱓ"};

		for(String head:headers) {
			tags=tags+"<th>"+head+"</th>";
		}
		tags=tags+"</tr>"; //���� ����ֱ�
		
		for(ObjectClass o: DataClass.banks) {
			tags+="<tr>";//�����
			
			tags+="<td>";//������
			tags+=o.getAge();//����
			tags+="</td>";//���ݱ�
			
			tags+="<td>";//������
			tags+=o.getMarital();//����
			tags+="</td>";//���ݱ�
			
			tags+="<td>";//������
			tags+=o.getEducation();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getHousing();//����
			tags+="</td>";//���ݱ�
			
			tags+="<td>";//������
			tags+=o.getJob();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getLoan();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getContact();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getAge();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getMonth();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getDay_of_week();//����
			tags+="</td>";//���ݱ�

			tags+="<td>";//������
			tags+=o.getDuration();//����
			tags+="</td>";//���ݱ�
			
			tags+="<tr>";//�����
		}
		tags += "</table>";  // table �ݱ�
		tags += "</body>"; // body �ݱ�
		tags += "</html>"; // html �ݱ�
		
		return tags;
	}

	
}
