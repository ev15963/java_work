package com.freeflux;

import java.util.Scanner;

import com.freeflux.xls.ExcelReader;

public class MethodClass {

	private static int list=10;
	private static int pageNo=1;
	private static int startIndex=0;
	
	public MethodClass() {
	}
	
	public static int fromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�о���� ���� book-data");
		String filename = sc.nextLine();
		System.out.println("�о���� ������:");
		int pageNo = sc.nextInt();
		String uri = "c:/filetest/" + filename + ".xls";
		System.out.println(uri);
		
		pageNo-=1;
		startIndex=pageNo*list+1;
		
		ExcelReader.readExcelFile(uri, startIndex, list);
		uri=null;
		return pageNo+1;
		
	} //fromConsole() END

	
//	public static String createTags() {
//		String tags="";
//		
//		tags+=("<!doctype html><html><head><title>Bank Data List</title></head>"
//				+ "<body><table border='1'><tr><th>");
//		
//		String[] header = {"��ȣ", "����", "����", "��ȥ����",	"�з�", "������", "����", 
//				"�������", "���Կ�", "���Կ���",	"�Ⱓ"};
//		
//		return null;
//	}
	

	

	
}
