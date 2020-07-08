package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		DataClass d=MethodClass.createObject();

		/**여학생의 학과명(Department), 이름, 평균 나이 구하기**/
		// 0. 검색 성별 설정
		char searchGender='F';
		
		/** 1. 학생정보 배열(students)로부터 여학생 검색 메서드 호출**/
		String[] result = MethodClass.searchInfo(searchGender, d.students);
		for(int idx=0;idx<result.length;idx++) {
			System.out.println(result[idx]);
		}
	} // main() END
	
	
	
} // class END



