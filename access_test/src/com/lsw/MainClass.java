package com.lsw;

import com.lsw.other.PublicClass;

public class MainClass {

	public static void main(String[] args) {
		TestClass t = new TestClass();
//		t.setP(1000);
		System.out.println(t.getP());
//		t.setP(100);
		//TestClass ���� ���� p�� private�̱� ������ ���Ұ�!!
//		DefaultClass defaultC = new DefaultClass();
//		System.out.println(defaultC.n);
//		//MainClass�� DefaultClass ���� ��Ű��
		
//		com.lsw.other.PublicClass pc = new com.lsw.other.PublicClass();
		PublicClass pcc=new PublicClass();
		pcc.b=1000;
	}
}
