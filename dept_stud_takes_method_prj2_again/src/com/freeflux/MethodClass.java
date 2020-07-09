package com.freeflux;

/** 작업 메서드들만 보유하는 클래스 **/
public class MethodClass {
	public static DataClass dc = null;
	
	public MethodClass() {
		
	}
	/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 선언 **/
	public static void createObject() {
		dc = new DataClass();
	}
// createObject() END

	/**
	 * 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출
	 * @param t 
	 * 
	 * @return
	 **/
	// DataClass객체의 takes배열 데이터 중 take 변수 값을 비교하며 검색(배열로 뽑아라)
	public static void searchStudentID() {
		dc.initTakes();
		for (int i=0;i<dc.tk.length;i++) {
			System.out.println(dc.tk[i].tkGrade);
		}

		

	} // searchStudentID() END : String t / String temp 소멸

	/**학번 중복 제거 메서드 호출**/
	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static void searchStudentInfo() { 
		
	} // searchStudentInfo() END

	/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
	public static void convertDepartmentID() {

	}

	/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
	public static void printResult() {

	}
} // MethodClass END
