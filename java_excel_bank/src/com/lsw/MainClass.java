package com.lsw;

import java.util.Scanner;

import com.lsw.xls.ExcelMaker;
import com.lsw.xls.ExcelReader;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list=1; //int list=10;
//		int pageNo=1;
		System.out.println("입력하자:");
		int pageNo = sc.nextInt();
		pageNo-=1;
//		pageNo = pageNo -1;
		int startIndex=0;
		startIndex=pageNo*list;
		System.out.println(startIndex);
		System.out.println("==================");

		String uri = "c:/filetest/bank_data.xls";
		ExcelReader.readExcelFile(uri,startIndex,list);
		
	} // main() END
} // class END
