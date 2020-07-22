package com.lsw;

//interface는 일반 클래스에게 상속될 수 없다..
//public class GeneralClass extends InterfaceClass{

//interface는 일반 클래스에게 구현 가능
//일반 클래스가 interface를 구현받을 경우
//interface 내부에 선언된 메서드를 강제 재정의 해야 한다.
public class GeneralClass implements InterfaceClass, InterfaceClass2,InterfaceClass3 {
	//멤버 (인스턴스) 변수 보유
	
	//생성자 보유
	public GeneralClass() {
		int test=InterfaceClass.A;
		int test2=InterfaceClass2.A;
		int test3=InterfaceClass3.A;
//		A=100;
//		InterfaceClass.A=1000;
//		A=100;		//오류
	}
	//@ 어노테이션
	// Override : 어노테이션 이름 ******** 아주중요 ~~~ Spring
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void avg(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int avg(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//메서드 보유

}
