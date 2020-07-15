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
//		String uri = "c:/filetest/data.xls";
		File f = new File(uri);				//1. File ��ü ���� c:/����/����.xls
		Workbook wb;						//1. Workbook ��ü ���
		try {
			wb = Workbook.getWorkbook(f); //2. �޼��忡��  file��ü ����
			Sheet s = wb.getSheet(0);	  //3. Workbook ��ü�� ���� ��Ʈ���(��Ʈ ��ġ����)
			
			int i = startIndex;
			int count=0;
			while (true) {
				try {
					if(count<list) {
					Cell c = s.getCell(0, i);	//4. ��Ʈ�κ��� ����ü ���(��, ��)
					Cell c1 = s.getCell(1, i);	//5. ���κ��� ���� ����
					System.out.println(c.getContents() + " \t" + c1.getContents());
					i++;
					count++;
					} else {
						return; //�޼ҵ带 ������ �������� ��
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