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
//		String uri = "c:/filetest/data.xls";
		File f = new File(uri);				//1. File 객체 생성 c:/폴더/파일.xls
		Workbook wb;						//1. Workbook 객체 얻기
		try {
			wb = Workbook.getWorkbook(f); //2. 메서드에게  file객체 전달
			Sheet s = wb.getSheet(0);	  //3. Workbook 객체로 부터 시트얻기(시트 위치전달)
			
			int i = startIndex;
			int count=0;
			while (true) {
				try {
					if(count<list) {
					Cell c = s.getCell(0, i);	//4. 시트로부터 셀객체 얻기(열, 행)
					Cell c1 = s.getCell(1, i);	//5. 셀로부터 내용 추출
					System.out.println(c.getContents() + " \t" + c1.getContents());
					i++;
					count++;
					} else {
						return; //메소드를 완전히 빠져나갈 때
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