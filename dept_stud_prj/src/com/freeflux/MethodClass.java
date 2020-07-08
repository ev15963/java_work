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
	public static String[] searchInfo(char c, Student[] s) {
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
		String[] resultData = { names, dept_id, (ageSum + ""), (count + "") };
		return resultData; // void -> String으로 변환

	}

	/** 2. 학생정보문자열 분리 메서드 **/
	public static String[] stringSplit(String s) {
		return s.split(",");
	}

	/** 3. 학과 번호를 학과며으로 변경 메서드 **/
	// dept_id:"920","923" d.depts
	public static String[] convertDept(String[] d, Department[] dd) { // d : 학과번호들
		String[] dname = new String[d.length]; // 학과 이름
		// "920"
		dname[0] = searchDeptName(dd, d[0]); // 첫번째 학과번호
		dname[1] = searchDeptName(dd, d[1]); // 두번째 학과번호
		return dname;
	}

	// d.depts "920"
	public static String searchDeptName(Department[] depts, String sName) {
		String dName = "";
		for (int idx = 0; idx < depts.length; idx++) {
			if (depts[idx].dept_id.equals(sName)) {
				dName = depts[idx].dept_name;
			}
		}
		return dName;
	}

	/** 4. 여학생의 평균나이 구하는 메서드 **/
	public static double avg(String s, String c) {
		int sum = Integer.parseInt(s);
		int count = Integer.parseInt(c);

		return (float) sum / count;
	}

	/** 5. 전체 결과 출력하는 메서드 **/

	public static void answer(String[] s1, String s2, String[] s3, double s4) {
		for (int idx = 0; idx < s1.length; idx++) {
			System.out.println(s1[idx]);
		}
		System.out.println(s2);
		
		
		//deptNames
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		
	
		
		System.out.println(s4);
	}
	//
	// System.out.println(dept_id[1]);
	//
	// System.out.println(avg);

}
