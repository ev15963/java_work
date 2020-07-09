package com.freeflux;


public class MainClass {

	public static void main(String[] args) {
		/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출**/
		MethodClass.createObject();
//		System.out.println(MethodClass.dc.takes.length); //출력되는지 확인
		/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/
		/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
//		MethodClass.searchStudentID("A");
		String stu_id=MethodClass.searchStudentID("A");
//		System.out.println(stu_id);
		/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
		MethodClass.searchStudentInfo(stu_id);
		/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
		
		/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
		
		
	} // main() END

} // class END






