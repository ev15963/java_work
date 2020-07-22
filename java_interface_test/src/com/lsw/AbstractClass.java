package com.lsw;
//추상클래스=일반클래스+interface
//추상클래스는 상속을 위해 생성자를 보유
//즉, new 연산자로 객체 생성 불가능..
//추상클래스 선언 : abstract class 클래스명
public abstract class AbstractClass {
	//멤버변수 상수 모두 보유 가능
	public AbstractClass() {
	}
	//일반메서드 선언 가능
	public void max() {
		System.out.println("테스트");
	}
	//추상메서드 선언 가능(메서드명만 선언)
	public abstract void avg(); // 상속받는 클래스에서 반드시 강제 재정의!!!
}
