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
	public static void readExcelFile(String uri, int startIndex, int list) {
		// String uri = "c:/filetest/data.xls";
		String tag = "";
		File f = new File(uri); // 1. File ��ü ���� c:/����/����.xls
		Workbook wb; // 1. Workbook ��ü ���
		try {
			wb = Workbook.getWorkbook(f); // 2. �޼��忡�� file��ü ����
			Sheet s = wb.getSheet(0); // 3. Workbook ��ü�� ���� ��Ʈ���(��Ʈ ��ġ����)

			int i = startIndex + 1;//
			int count = 0;
			while (true) {
				try {
					if (count < list) {
						// if(count==i){

						Cell c = s.getCell(0, i); // 4. ��Ʈ�κ��� ����ü ���(��, ��)
						Cell c1 = s.getCell(1, i); // 5. ���κ��� ���� ����
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
						return; // �޼ҵ带 ������ �������� ��
					}
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