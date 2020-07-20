package com.lsw.util;

import com.lsw.obj.DataClass;
import com.lsw.obj.ObjectClass;

public class MethodClass {

	public MethodClass() {
		
	}
	
	/** 데이터를 이용하영 HTML 태그를 생성하는 메서드 선언
	 * @return **/
	public static String makeTags() {
		String tags=""; //누적연산이 필요하기 때문에 ""/null은 연산 불가!!!
		tags=tags+"<!doctype html><head><title>List</title></head><body>";
		tags=tags+"<table border='1'>";
		tags=tags+"<tr><th>번호</th><th>아이디</th><th>비밀번호</th>";
		
		// DataClass.members 내부에는 ObjectClass 객체들이 저장되어 있음..
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
