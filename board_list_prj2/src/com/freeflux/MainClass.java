package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		
		// ������ ��ü ���� �޼��� ȣ��
		MethodClass.createObject();
		
		// �� ���ϴ� �޼��� ȣ��
		int totalHit=MethodClass.sum();
		
		// ��հ� ���ϴ� �޼��� ȣ��
		double avgHit=MethodClass.mean(totalHit);
		
		// ��� ����ϴ� �޼��� ȣ��
		MethodClass.printResult(avgHit);
		

		
	}  // main() END
	
}  // MainClass END
