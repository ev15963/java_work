package com.lsw.xls;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** ���� ���� �����͸� �о�鿩 ��� �޼��� ���� Ŭ���� **/
public class ExcelReader {
	public ExcelReader() { // �⺻ ������
	}

	/** ���� ���� �����͸� �о�鿩 ��� �޼��� ���� **/
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
			// BiffException : xslxȮ���ڸ� ���� �� �߻��ϴ� ���� ����ó��
			// IOException : ���� ����� ���� ����ó��
			System.out.println(e1.getMessage());
		}
	}
}
