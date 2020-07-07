package com.lsw;

public class EmpClass {
	public String empNo="";  // 사원 고유번호
	public String empName="";  // 사원이름
	public String job="";  // 직급
	public String mgr="";  // 직급번호
	public String hireDate="";  // 입사일
	public int sale=0;  // 급여
	public int commission=0; // 성과급
	public String deptNo="";  // 부서번호
	
	public EmpClass(String en, String na, String j, String m, String h, int s, int d,
			String b) {
		this.empNo=en;
		this.empName=na;
		this.job=j;
		this.mgr=m;
		this.hireDate=h;
		this.sale=s;
		this.commission=d;
		this.deptNo=b;
		// TODO Auto-generated constructor stub
	}

}
