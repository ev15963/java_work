package com.freeflux;

public class MethodClass {
	public MethodClass() {
		
	}
	
	/**0. 학과 및 학생정보들을 보유하는 클래스 객체 생성 메서드 호출**/
	public static DataClass createObject() {
		DataClass dc=new DataClass(); 
		dc.initDepartments();	// 학과정보 배열에 초기 데이터 대입
		dc.initStudents();	// 학생정보 배열에 초기 데이터 대입
		return dc;
	}
	
	/**1. */
	
	
	
	
}
