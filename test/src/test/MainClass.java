package test;

public class MainClass {

	public static void main(String[] args) {
		// 변수 : 이름 (영문 소문자로 시작..)
		// 선언 : 데이터 타입 변수명;
		//	  : 데이터 변수명=초기값;
		// 데이터타입 : 숫자 : int(정수) / float(소수점)
		//			문자 : char
		//			논리 : boolean
		//			문자열 : String
		int n;
//		int n = 10; 중복선언 오류
		n=10;	//변수사용
//		m=100; //변수 사용전 반드시 선언
		int m=100;
		//float -> 4byte
		//double -> 8byte
		float f1=10;
		float f2=m;
//		int n2=f1;
		char c1='a';
		char c2='ㅋ';
		char c3='갈';
		char c4='1';
		String s1 ="1234";	//string ""로 감싸준다.
		System.out.print(s1);
		System.out.println(); //syso CTRL+SPACE
		System.out.printf("갯수는 %d 개 입니다.", n);
		//메서드(메소드:method)
		System.out.print("aaa");
	}

}
