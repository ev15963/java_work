package com.lsw;

public class WifeClass extends Thread{

	public WifeClass() {
	} //생성자
	
	public void run() {
		synchronized (MainClass.myBank) {
			MainClass.myBank.minusMoney(1000); //은행 내부 출금처리 시간 0.2초
		}

		System.out.println("minusMoney(1000):"+MainClass.myBank.getMoney());
	}

}
