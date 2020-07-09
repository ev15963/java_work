package com.freeflux;
/** 작업 메서드들만 보유하는 클래스 **/
public class MethodClass {
	public static DataClass dc=null; //객체변수 초기값 null 선언
	
	public MethodClass() {
	} // 생성자 END

	/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 선언 **/
	public static void createObject() {
		dc= new DataClass();
	} // createObject() END
	
	/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
	// DataClass객체의 takes배열 데이터 중  take 변수 값을 비교하며 검색
	public static void searchStudentID(String t) {

	}
	
	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static void searchStudentInfo() {
		
	}
	/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
	public static void convertDepartmentID() {
		
	}
	/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
	public static void printResult() {
		
	}
}  // MethodClass END








