package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		//interface는 생성자가 없기 때문에 객체 생성 불가능!!!
//		InterfaceClass ic = new InterfaceClass(); //오류
		
		GeneralClass gc=new GeneralClass();
		gc.avg();	//강제 재정의 메서드 (추상메서드)
		gc.max();	//상속받은 일반메서드
		
		//추상클래스는 생성자를 보유하지만 new로 객체 생성 불가능!
//		AbstractClass ac = new AbstractClass(); 오류
		
		//구현받은 interface 타입을 사용할 경우,
		//각 객체는 해당 interface의 구현메서드만 사용 가능
//		InterfaceClass gc1=new GeneralClass();
//		gc1.
//		InterfaceClass2 gc2=new GeneralClass();
//		
//		InterfaceClass3 gc3=new GeneralClass();
//		gc3.
	}

}
