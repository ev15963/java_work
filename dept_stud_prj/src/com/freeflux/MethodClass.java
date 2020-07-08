package com.freeflux;

public class MethodClass {
	public MethodClass() {

	}

	/** 0. 학과 및 학생정보들을 보유하는 클래스 객체 생성 메서드 호출 **/
	public static DataClass createObject() {
		DataClass dc = new DataClass();
		dc.initDepartments(); // 학과정보 배열에 초기 데이터 대입
		dc.initStudents(); // 학생정보 배열에 초기 데이터 대입
		return dc;
	}

	/** 1. 학생정보 배열(students)로부터 여학생 검색 메서드 **/
	public static String searchInfo(char c, Student[] s) {
		String names = ""; // 검색 학생이름들 : "이름,이름...."
		String dept_id = ""; // 검색 학생 학과번호들 : "학과번호,학과번호...."
		int ageSum = 0; // 나이 합
		int count = 0; // 검색 인원수
		for (int idx = 0; idx < s.length; idx++) {
			if (s[idx].gender == c) {
				names = names + s[idx].name + ","; // 학생 이름 누적
				dept_id = dept_id + s[idx].dept_id + ","; // 학생 학과번호 누적
				ageSum = ageSum + s[idx].age; // 학생 나이 누적
				count = count + 1; // count++ 와 동일 // 인원수 증가
			}
		}
		String[] resultData= {names, dept_id, (ageSum+""), (count+"") };
		return resultData; //void -> String으로 변환
	}
}
