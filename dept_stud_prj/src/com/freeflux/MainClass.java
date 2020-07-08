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
		
		/** 2. 학생정보문자열 분리 메서드 **/
		String[] names = MethodClass.stringSplit(result[0]);
		String[] dept_id = MethodClass.stringSplit(result[1]);
		System.out.println(dept_id[1]);
		
		/** 3. 학과 번호를 학과명으로 변경 메서드 **/
		String[] deptNames = MethodClass.convertDept(dept_id, d.depts);
		
		/** 4. 여학생의 평균나이 구하는 메서드 **/
		/** 5. 전체 결과 출력하는 메서드 **/
		
	} // main() END
	

	
} // class END



