package com.freeflux.xls;

import java.io.File;
import java.io.IOException;

import com.freeflux.DataClass;
import com.freeflux.ObjectClass;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** ���� ���� �����͸� �о�鿩 ��� �޼��� ���� Ŭ���� **/
public class ExcelReader {

	public ExcelReader() { // �⺻ ������
	}

	/** 
	 * ���� ���� �����͸� �о�鿩
	 * �� ���� �����͸� �̿��Ͽ� ObjectClass ��ü�� ������ ��, 
	 * DataClass�� banks(ArrayList)�� �߰��ϴ� �޼��� ���� 
	 * 
	 * @param uri				: �о���� �������� ���/���ϸ�.xls
	 * @param startIndex		: ���� index (��)
	 * @param list  			: �ѹ��� �о���� ������(��) ����
	 * **/
	public static void readExcelFile(String uri, int startIndex, int list) {

		File f = new File(uri);	
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(f);
			Sheet s = wb.getSheet(0);

			int i = startIndex;  

			String[] c = null;
			ObjectClass o=null;
			
			for(int count=0; count<list; count++) {
				c = new String[11];
				
				c[0] = s.getCell(0, i).getContents();	// no
				c[1] = s.getCell(1, i).getContents(); 	// age
				c[2] = s.getCell(2, i).getContents(); 	// job
				c[3] = s.getCell(3, i).getContents(); 	// marital
				c[4] = s.getCell(4, i).getContents(); 	// education
				c[5] = s.getCell(5, i).getContents(); 	// housing
				c[6] = s.getCell(6, i).getContents(); 	// loan
				c[7] = s.getCell(7, i).getContents(); 	// contact
				c[8] = s.getCell(8, i).getContents(); 	// month
				c[9] = s.getCell(9, i).getContents(); 	// day_of_week
				c[10] = s.getCell(10, i).getContents(); // duration
				
				o=new ObjectClass(c[0], c[1], c[2], c[3], c[4], c[5], c[6], c[7], c[8], c[9], c[10]);
				o.variableValues();  // ��ü ��� ���� �� Ȯ�ο�..
				

				o=null;
				i++;
			}

		} catch (BiffException | IOException e1) { 
			// BiffException : xslxȮ���ڸ� ���� �� �߻��ϴ� ���� ����ó��
			// IOException : ���� �����  ���� ����ó��
			System.out.println(e1.getMessage());
		}

	}

}
