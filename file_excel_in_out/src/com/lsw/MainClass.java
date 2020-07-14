package com.lsw;

import com.lsw.xls.ExcelMaker;
import com.lsw.xls.ExcelReader;

public class MainClass {
	public static void main(String[] args) {
		ExcelMaker.makeExcelFile();
		ExcelReader.readExcelFile();
	} // main() END
} // class END