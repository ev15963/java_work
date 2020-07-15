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
	public static void readExcelFile(String uri, int startIndex, int list) {
		// String uri = "c:/filetest/data.xls";
		String tag = "";
		File f = new File(uri); // 1. File 객체 생성 c:/폴더/파일.xls
		Workbook wb; // 1. Workbook 객체 얻기
		try {
			wb = Workbook.getWorkbook(f); // 2. 메서드에게 file객체 전달
			Sheet s = wb.getSheet(0); // 3. Workbook 객체로 부터 시트얻기(시트 위치전달)

			int i = startIndex + 1;//
			int count = 0;
			while (true) {
				try {
					if (count < list) {
						// if(count==i){

						Cell c = s.getCell(0, i); // 4. 시트로부터 셀객체 얻기(열, 행)
						Cell c1 = s.getCell(1, i); // 5. 셀로부터 내용 추출
						Cell c2 = s.getCell(2, i);
						Cell c3 = s.getCell(3, i);
						Cell c4 = s.getCell(4, i);
						Cell c5 = s.getCell(5, i);
						Cell c6 = s.getCell(6, i);
						Cell c7 = s.getCell(7, i);
						Cell c8 = s.getCell(8, i);
						Cell c9 = s.getCell(9, i);
						Cell c10 = s.getCell(10, i);

						System.out.println(c.getContents() + " \t" + c1.getContents() + " \t" + c2.getContents() + " \t"
								+ c3.getContents() + " \t" + c4.getContents() + " \t" + c5.getContents() + " \t"
								+ c6.getContents() + " \t" + c7.getContents() + " \t" + c8.getContents() + " \t"
								+ c9.getContents() + " \t" + c10.getContents());
						
						tag = tag + c.getContents() + " \t" + c1.getContents() + " \t" + c2.getContents() + " \t"
								+ c3.getContents() + " \t" + c4.getContents() + " \t" + c5.getContents() + " \t"
								+ c6.getContents() + " \t" + c7.getContents() + " \t" + c8.getContents() + " \t"
								+ c9.getContents() + " \t" + c10.getContents();

						i++;
						count++;
					} else {
						return; // 메소드를 완전히 빠져나갈 때
					}
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