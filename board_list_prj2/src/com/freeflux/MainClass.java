package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		
		// 데이터 객체 생성 메서드 호출
		MethodClass.createObject();
		
		// 합 구하는 메서드 호출
		int totalHit=MethodClass.sum();
		
		// 평균값 구하는 메서드 호출
		double avgHit=MethodClass.mean(totalHit);
		
		// 결과 출력하는 메서드 호출
		MethodClass.printResult(avgHit);
		

		
	}  // main() END
	
}  // MainClass END
