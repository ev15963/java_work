package com.freeflux.xls;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/** 엑셀 파일 생성 및 초기 데이터 입력 메서드 보유 클래스 **/
public class ExcelMaker {

	public ExcelMaker() { // 기본 생성자
	}

	/** 엑셀 파일 생성 및 초기 데이터 입력 메서드 선언 **/
	public static void makeExcelFile() {
		String uri = "C://filetest/data/xls";
		File f= new File(uri);
		WritableWorkbook wb= null;
		
		try {
			wb=Workbook.createWorkbook(f);
			WritableSheet s1=wb.createSheet("첫번째", 0);
			
			for (int i=0;i<10;i++) {
				Label label= new Label(0,i,"데이터=>"+i);
				Label label1= new Label(1,i,"데이터=>"+i);
				s1.addCell(label1); //???
				
				wb.write();
				wb.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (RowsExceededException e) {
			System.out.println(e.getMessage());
		} catch (WriteException e) {
			System.out.println(e.getMessage());
		}
	} // makeExcelFile() END
} // class END
