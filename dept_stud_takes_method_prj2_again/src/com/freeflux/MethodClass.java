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
	 * 
	 * @param t
	 * @return
	 * 
	 * @return
	 **/
	// DataClass객체의 takes배열 데이터 중 take 변수 값을 비교하며 검색(배열로 뽑아라)
	public static String searchStudentID(String t) {
		dc.initTakes();
		String temp = "";
		for (int i = 0; i < dc.tk.length; i++) {
			if (dc.tk[i].tkGrade.startsWith("A")) {
				temp += dc.tk[i].tkHakburn + ",";
			}
		}
		return temp;

	} // searchStudentID() END : String t / String temp 소멸

	/** 학번 중복 제거 메서드 호출 **/
	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static String[] searchStudentInfo(String t) {
		dc.initStudent();
		String temp[] = {"",""};
		String ts[]=t.split(",");
		for(int j=0;j<ts.length;j++) {
			for(int i=0;i<dc.stu.length;i++) {
				if(dc.stu[i].stuHakburn.equals(ts[j])) {
//					System.out.println(ts[j]);
					temp[0] = temp[0]+ dc.stu[i].stuName +",";
					temp[1] = temp[1]+ dc.stu[i].stuHakburn +",";
				}
			}
		}
//		System.out.println(temp[0]);
//		System.out.println(temp[1]);
		return temp;
	} // searchStudentInfo() END

	/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
	public static void convertDepartmentID() {

	}

	/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
	public static void printResult() {

	}
} // MethodClass END
