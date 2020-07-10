package com.freeflux;


public class MainClass {

	public static void main(String[] args) {
		/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출**/
		MethodClass.createObject();
		/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/
//		System.out.println(MethodClass.dc.takes.length); //출력되는지 확인
		/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
//		MethodClass.searchStudentID("A");
		String stu_id=MethodClass.searchStudentID("A");
//		System.out.println(stu_id);
		/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
		String[] infos = MethodClass.searchStudentInfo(stu_id);
		//info[0]:이름들 /infos[1]:학과 번호들
//		System.out.println(infos[1]);
		/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
		String dnames= MethodClass.convertDepartmentID(infos[1]);
//		System.out.println(dnames);
		/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
		MethodClass.printResult(stu_id, infos[1], dnames);
		
	} // main() END

} // class END






