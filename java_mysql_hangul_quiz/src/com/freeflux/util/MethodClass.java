package com.freeflux.util;

import java.sql.ResultSet;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.freeflux.db.DataBaseClass;

public class MethodClass {

	public MethodClass() {
	}

	private static String makeTagsBefore() {
		String tags="";
		tags=tags+"<!doctype html><html><head><title>";
		tags=tags+"</title></head><body><table border='1'>";
		return tags;
	} // makeTagsBefore() END
	
	private static String makeTagsAfter() { //�±� �ݴ� �޼ҵ�
		String tags="";
		tags=tags+"</table></body></html>";
		return tags;
	} // makeTagsAfter() END
	
	
	private static String makeTitleTags(String[] fieldNames) { //����ȣ��
		String tags="";
		/** ���޵� �ʵ�� �迭�κ��� �ʵ�� ���� **/
		tags=tags+"<tr>";
		for(int idx=0; idx<fieldNames.length; idx++) {
			tags=tags+"<th>";
			tags=tags+fieldNames[idx]; //�ʵ��
			tags=tags+"</th>";
		}
		tags=tags+"</tr>";
		return tags;
	}
	
	public static String makeTagsQ1(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);
		
		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+rs.getString(2)+"</td>";
				makeTags=makeTags+"<td>"+rs.getString(3)+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ1() END
	
	public static String makeTagsQ2(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames); //�ʵ��
		
		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ2() END
	
	public static String makeTagsQ3(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);
		
		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			// empNo, empName, sale
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ3() END
	
	public static String makeTagsQ4(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {

			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			// empNo, empName, sale
			while(rs.next()) {
				System.out.println("test===========>");
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ4() END

	public static String makeTagsQ5(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ5() END
	
	public static String makeTagsQ6(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ6() END

	public static String makeTagsQ7(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ7() END

	public static String makeTagsQ8(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(4))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ8() END

	public static String makeTagsQ9(ResultSet rs, String[] fieldNames) {
		String makeTags="";

		/** �⺻ �±� ���� **/
		makeTags=makeTags+makeTagsBefore();

		/** �ʵ���� �̿��� ���� �±� ���� **/
		makeTags=makeTags+makeTitleTags(fieldNames);

		try {
			/** ��ȸ�� ���ڵ��� �� �ʵ� �� ���� **/
			while(rs.next()) {
				makeTags=makeTags+"<tr>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(1))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(2))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(3))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(4))+"</td>";
				makeTags=makeTags+"<td>"+ChangeEncoding.mySQLToJava(rs.getString(5))+"</td>";
				makeTags=makeTags+"</tr>";
			}
	
		} catch (SQLException e) {
			System.out.println("ResultSetMetaData ERR : "+e.getMessage());
		} 
		
		/** ���� �±� ���� **/
		makeTags=makeTags+makeTagsAfter();

		return makeTags;
	} // makeTagsQ9() END
}
