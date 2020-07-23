package com.lsw;

public class MeClass extends Thread {
	public MeClass() {
	} //todtjdwk
	
	public void run() {
		MainClass.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000):"+MainClass.myBank.getMoney());
	}
	

}
