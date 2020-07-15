package com.lsw;

import com.lsw.xls.ExcelMaker;
import com.lsw.xls.ExcelReader;

public class MainClass {
	public static void main(String[] args) {
		int list=10;
		int pageNo=2;

		pageNo-=1;
		
		int startIndex=0;
		startIndex=pageNo*list;
		System.out.println(startIndex);
		System.out.println("==================");

		String uri = "c:/filetest/bank_data.xls";
		ExcelReader.readExcelFile(uri,startIndex,list);
	} // main() END
} // class END
