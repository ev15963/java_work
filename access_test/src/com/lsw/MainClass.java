package com.lsw;

import com.lsw.other.PublicClass;

public class MainClass {

	public static void main(String[] args) {
		TestClass t = new TestClass();
//		t.setP(1000);
		System.out.println(t.getP());
//		t.setP(100);
		//TestClass 내부 변수 p는 private이기 때문에 사용불가!!
//		DefaultClass defaultC = new DefaultClass();
//		System.out.println(defaultC.n);
//		//MainClass와 DefaultClass 같은 패키지
		
//		com.lsw.other.PublicClass pc = new com.lsw.other.PublicClass();
		PublicClass pcc=new PublicClass();
		pcc.b=1000;
	}
}
