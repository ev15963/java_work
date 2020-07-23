package com.lsw;

public class WifeClass extends Thread {

	public WifeClass() {
	}
	
	public void run() {
		MainClass.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000):"+MainClass.myBank.getMoney());
	}

}
