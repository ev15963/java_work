package com.lsw;

public class TestClass {
	private int p=10;
	private int p1=10;
	private int p2=10;
	private String p3="10";
	private boolean p4=true;
	
	final int STATUS=0;
	final int TEST;
	final int OUT;
	
	public TestClass() { //final int 때문에 오류날 수 있음
		
	}
	
	public TestClass(int o) {
		
	}
	
	public TestClass(String o) {
		
	}
	
	public TestClass(int o, int p) {
		
	}
	
	public void sum(int n) {
		
	}
	
	public void sum(float n) { //타입이 달라야한다.
		
	}
	
	public void sum(float nn) {
		
	}
	
	public void sum(boolean nn) {
		
	}
	
	public int sum(boolean nn) {
		return 0;
	}
	
	public TestClass(int o) { //생성자
		OUT=o;
		TEST=100;
//		this.setP(1000);
	}

	public int getP() {
		return p;
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public boolean isP4() {
		return p4;
	}

	public void setP4(boolean p4) {
		this.p4 = p4;
	}

//	public void setP(int p) {
//		this.p = p;
//	}
}
