package com.lsw.xls;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/** ���� ���� ���� �� �ʱ� ������ �Է� �޼��� ���� Ŭ���� **/
public class ExcelMaker {
	public ExcelMaker() { // �⺻ ������
	}

	/** ���� ���� ���� �� �ʱ� ������ �Է� �޼��� ���� **/
	public static void makeExcelFile() {
		String uri = "c:/filetest/data.xls";
		File f = new File(uri);
		WritableWorkbook wb = null;
		try {
			wb = Workbook.createWorkbook(f);
			WritableSheet s1 = wb.createSheet("ù��°", 0);
			for (int i = 0; i < 10; i++) {
				Label label = new Label(0, i, "������=>" + i);
				s1.addCell(label);
				Label label1 = new Label(1, i, "������=>" + i);
				s1.addCell(label1);
			}
			wb.write();
			wb.close();
		} catch (IOException e) { // ����� ���� ����ó��
			System.out.println(e.getMessage());
		} catch (RowsExceededException e) { // ���� ���� ��� �� ����ó��
			System.out.println(e.getMessage());
		} catch (WriteException e) {
			System.out.println(e.getMessage()); // �����͸� ���Ͽ� �� �� ����ó��
		}
	} // makeExcelFile() END
} // class END