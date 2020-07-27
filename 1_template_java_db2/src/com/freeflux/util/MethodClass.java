package com.freeflux.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.freeflux.db.DataBaseClass;

public class MethodClass {
	DataBaseClass dbc = new DataBaseClass();

	public MethodClass() {
	}

	private static String tagMethod() {

		String tag = "";
		// tag 만들기
		tag += "<!doctype html><html><head><title>Bank Data List</title></head><body><table border='1'>";

		return tag;
	}

	private static String tagEndMethod() {

		String tag = "";
		tag += "</table></body></html>";

		return tag;

	}

	/** 전달된 필드명 배열로부터 필드명 추출 **/
	private static String makeTitleTags(String[] fN) {
		String tag="";
		tag+="<tr>";
		for (int i=0;i<fN.length;i++) {
			tag+=("<th>"+fN[i]+"</th>");
		}
		tag+="</tr>";
		return tag;
	}
	
	public static String makeTagsQ1(ResultSet rs, String[] fn) {
		String makeTags="";
		
		makeTags+=tagMethod();
		makeTags+=makeTitleTags(fn);
		
		try {
			while(rs.next()) {
				makeTags+="<tr>";
				makeTags+=("<td>"+ChangeEncoding.toLatin(rs.getString(1)));
				makeTags+=("<td>"+rs.getString(2)+"</td>");
				makeTags+=("<td>"+rs.getString(3)+"</td>");
				makeTags+="<tr>";
			}
		} catch (SQLException e) {
			System.out.println("makeTitleTags err"+e.getMessage());
		}
		
		makeTags+=tagEndMethod();
		return makeTags;
	}

	public static String makeTagsQ2(ResultSet rs, String[] fieldNames) {
		String mkTg="";
		
		//기본태그
//		mkTg+=
	}
	
	
}



//
// public static String makeTagsQ1(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+rs.getString(2)+"</td>";
// makeTags=makeTags+"<td>"+rs.getString(3)+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ1() END
//
// public static String makeTagsQ2(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames); //필드명
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ2() END
//
// public static String makeTagsQ3(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// // empNo, empName, sale
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ3() END
//
// public static String makeTagsQ4(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
//
// /** 조회된 레코드의 각 필드 값 추출 **/
// // empNo, empName, sale
// while(rs.next()) {
// System.out.println("test===========>");
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ4() END
//
// public static String makeTagsQ5(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ5() END
//
// public static String makeTagsQ6(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ6() END
//
// public static String makeTagsQ7(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ7() END
//
// public static String makeTagsQ8(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(4))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ8() END
//
// public static String makeTagsQ9(ResultSet rs, String[] fieldNames) {
// String makeTags="";
//
// /** 기본 태그 생성 **/
// makeTags=makeTags+makeTagsBefore();
//
// /** 필드명을 이용한 제목 태그 생성 **/
// makeTags=makeTags+makeTitleTags(fieldNames);
//
// try {
// /** 조회된 레코드의 각 필드 값 추출 **/
// while(rs.next()) {
// makeTags=makeTags+"<tr>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(4))+"</td>";
// makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(5))+"</td>";
// makeTags=makeTags+"</tr>";
// }
//
// } catch (SQLException e) {
// System.out.println("ResultSetMetaData ERR : "+e.getMessage());
// }
//
// /** 최종 태그 생성 **/
// makeTags=makeTags+makeTagsAfter();
//
// return makeTags;
// } // makeTagsQ9() END
// }
