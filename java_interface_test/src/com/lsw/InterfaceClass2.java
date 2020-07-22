package com.lsw;

//interface는 객체로 생성불가능(상속(일반 클래스)도 불가능)
//interface 끼리는 한반에 다중상속 가능
//일반 클래스는  interface를 구현(implements)받을 수 있다.
//일반 클래스는 interface들을 한번에 여러개 구현 받을 수 있다.
public interface InterfaceClass2 {
	//상수만 선언 가능
	int A=100;		// static final int A=100;
	
	// 생성자 보유할 수 없음
//	public InterfaceClass() {
		// TODO Auto-generated constructor stub
//	}

	//메서드 선언부만 가능({} 사용 불가능)
	public void prm();
	public void avg(int n1, int n2);
	public int avg(float f1, float f2);
}
