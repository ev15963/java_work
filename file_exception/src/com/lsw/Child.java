package com.lsw;

public class Child extends Parent {
	int child=100;
	
	public Child() {
		System.out.println("PrintChild() 내부");
	}
	public Child(int n) {
		this.child=n;
	}
	
	public void prn() {
		System.out.println("Child의 prn()의 실행");
		
	}
	
	
}
