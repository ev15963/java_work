package com.lsw.xls;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** 엑셀 파일 데이터를 읽어들여 출력 메서드 보유 클래스 **/
public class ExcelReader {
	public ExcelReader() { // 기본 생성자
	}

	/** 엑셀 파일 데이터를 읽어들여 출력 메서드 선언 **/
	public static void readExcelFile() {
		String uri = "c:/filetest/data.xls";
		File f = new File(uri);
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(f);
			Sheet s = wb.getSheet(0);
			int i = 0;
			while (true) {
				try {
					Cell c = s.getCell(0, i);
					Cell c1 = s.getCell(1, i);
					System.out.println(c.getContents() + " \t" + c1.getContents());
					i++;
				} catch (Exception e) {
					break;
				}
			}
		} catch (BiffException | IOException e1) {
			// BiffException : xslx확장자를 읽을 때 발생하는 오류 예외처리
			// IOException : 파일 입출력 오류 예외처리
			System.out.println(e1.getMessage());
		}
	}
}
