package com.freeflux.xls;

import java.io.File;
import java.io.IOException;

import com.freeflux.DataClass;
import com.freeflux.ObjectClass;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** 엑셀 파일 데이터를 읽어들여 출력 메서드 보유 클래스 **/
public class ExcelReader {

	public ExcelReader() { // 기본 생성자
	}
	
	public static void readExcelFile(String uri, int startIndex, int list) {

		File f = new File(uri);

		Workbook wb;

		try {

			wb=Workbook.getWorkbook(f);

			Sheet s = wb.getSheet(0);
			
			int i=startIndex+1;
			
			String[] c=null;
			ObjectClass o=null;
			
			for(int count =0; count<list;count++) {
				c=new String[11];
				for(int j =0; j<11;j++) {
					c[j]=s.getCell(j, i).getContents(); //열,행
					System.out.println(c[j]);
				}
				
				o=new ObjectClass(c[0], c[1], c[2], c[3], c[4], c[5], 
						c[6], c[7], c[8], c[9], c[10]);
				
//				System.out.println(c[0]);
				
				
				o.variableValues();
				
				DataClass.bank.add(o);
				
				o=null;
				i++;
			}
		} catch (BiffException|IOException e1) {
			System.out.println(e1.getMessage()+"4444444444444444");
		}


	}

}
