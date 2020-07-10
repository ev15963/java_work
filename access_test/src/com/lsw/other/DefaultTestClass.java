package com.lsw.other;

public class DefaultTestClass {
	
	public DefaultTestClass() {
//		DefaultClass defaultD = new DefaultClass();
		//DefaultTestClass와 DefaultClass 다른 패키지..
		//DefaultClass의 클래스 선언부가 default..
		//다른 패키지에서 클래스는 찾지 못함
		
//		DefaultClass defaultD = new DefaultClass();
		//클래스 선언부는 public이지만, 생성자는 default.
		//다른 패키지에서 클래스는 로드되지만
		//객체생성은 불가
		
		DefaultClass defaultD = new DefaultClass();
//		defaultD.n=100;
		//클래스 선언부, 생성자는  public이지만
		//n변수는 default
		//객체는 생성되지만 객체 내부변수 사용불가
	}
}
