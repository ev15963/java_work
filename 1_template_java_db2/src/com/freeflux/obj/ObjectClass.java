package com.freeflux.obj;

public class ObjectClass {

	
	private int empNo=0;
	private String empName="";
	private String job="";
	private int mgr=0;
	private String hireDate="";
	private int sale=0;
	private int commission=0;
	private int deptNo=0;
	
	
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public ObjectClass() {
	}
	
	public ObjectClass(int i1, String s2, String s3, int i4, String s5, int i6, int i7, int i8) {
		this.empNo=i1;
		this.empName=s2;
		this.job=s3;
		this.mgr=i4;
		this.hireDate=s5;
		this.sale=i6;
		this.commission=i7;
		this.deptNo=i8;
	}

}
