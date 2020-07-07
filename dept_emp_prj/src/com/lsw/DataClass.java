package com.lsw;
/*부서정보들, 사원정보들 보유 클래스*/
public class DataClass {
	
	

	public static DeptClass[] dept = new DeptClass[4];
	
	public static void initDEPT() {
		dept[0]=new DeptClass("10", "경리부", "서울");
		dept[1]=new DeptClass("20", "인사부", "인천");
		dept[2]=new DeptClass("30", "영업부", "용인");
		dept[3]=new DeptClass("40", "전산부", "수원");
	}

	public static EmpClass[] emps = new EmpClass[14];
	
	public static void initEMP() {
		emps[0]=new EmpClass("1001", "김사랑", "사원", "1013", "2007-03-01", 300, 0, "20");
		emps[1]=new EmpClass("1002", "한예슬", "대리", "1005", "2007-04-02", 250,   80, "30");
		emps[2]=new EmpClass("1003", "오지호", "과장", "1005", "2005-02-10", 500,  100, "30");
		emps[3]=new EmpClass("1004", "이병헌", "부장", "1008", "2003-09-02", 600, 0, "20");
		emps[4]=new EmpClass("1005", "신동엽", "과장", "1005", "2005-04-07", 450,  200, "30");
		emps[5]=new EmpClass("1006", "장동건", "부장", "1008", "2003-10-09", 480, 0, "30");
		emps[6]=new EmpClass("1007", "이문세", "부장", "1008", "2004-01-08", 520, 0, "10");
		emps[7]=new EmpClass("1008", "감우성", "차장", "1003", "2004-03-08", 500,    0, "30");
		emps[8]=new EmpClass("1009", "안성기", "사장", "", "1996-10-04",1000, 0, "20");
		emps[9]=new EmpClass("1010", "이병헌", "과장", "1003", "2005-04-07", 500, 0, "10");
		emps[10]=new EmpClass("1011", "조향기", "사원", "1007", "2007-03-01", 280, 0, "30");
		emps[11]=new EmpClass("1012", "강혜정", "사원", "1006", "2007-08-09", 300, 0, "20");
		emps[12]=new EmpClass("1013", "박중훈", "부장", "1003", "2002-10-09", 560, 0, "20");
		emps[13]=new EmpClass("1014", "조인성", "사원", "1006", "2007-11-09", 250, 0, "10");
	}
}
