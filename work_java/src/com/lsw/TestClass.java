package com.lsw;

public class TestClass {
	public int n1, n2, m;
	
	public TestClass(int n1, int n2) {
		//System.out.println(n1+"_"+n2);
		this.n1=n1;
		this.n2=n2;
		this.minus();
		//System.out.println(this.n1+"_"+this.n2);
	}
	public void minus() {
		System.out.println("minus() 시작");
		this.m=this.n1-this.n2;
		System.out.println("minus() 종료");
	}
	public void sum() {
		System.out.println(this.n1+this.n2);
	}
}
