package com.lsw.util;

import com.lsw.obj.DataClass;
import com.lsw.obj.ObjectClass;

public class MethodClass {

	public MethodClass() {
		
	}
	
	/** �����͸� �̿��Ͽ� HTML �±׸� �����ϴ� �޼��� ����
	 * @return **/
	public static String makeTags() {
		String tags=""; //���������� �ʿ��ϱ� ������ ""/null�� ���� �Ұ�!!!
		tags=tags+"<!doctype html><head><title>List</title></head><body>";
		tags=tags+"<table border='1'>";
		tags=tags+"<tr><th>��ȣ</th><th>���̵�</th><th>��й�ȣ</th>";
		
		// DataClass.members ���ο��� ObjectClass ��ü���� ����Ǿ� ����..
		for(ObjectClass oc : DataClass.members) {
			tags=tags+"<tr>";
			tags=tags+"<td>"+oc.getNo()+"</td>";
			tags=tags+"<td>"+oc.getId()+"</td>";
			tags=tags+"<td>"+oc.getPw()+"</td>";
			tags=tags+"<tr>";
		}
		
		tags=tags+"</table></body></html>";
		return tags;
	}//makeTags() END

} //class END
