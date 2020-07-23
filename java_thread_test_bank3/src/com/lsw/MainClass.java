package com.lsw;

public class MainClass {
	public static BankClass myBank = null;
	
	public static void main(String[] args) {
		myBank=new BankClass(); //은행업무개시
		
		System.out.println("현잔액 : " +myBank.getMoney());
		MeClass m = new MeClass();
		WifeClass w =new WifeClass();
		m.start();
		
		try {
			Thread.sleep(200); //입금과 출금은 0.2초 차이..
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		w.start(); //출금나중
	}

}
