package com.lsw;

public class BankClass {

	private int money = 10000; // 예금 잔액

	public BankClass() {
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) { // 입출금 결과에 따른 잔액 변경
		this.money=money;
	} // setMoney() END

	public void saveMoney(int save) { // 입금처리 메서드
		int m =this.getMoney();
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			this.setMoney(m+save);
	}	// saveMoney() END

	public void minusMoney(int minus) { // 출금처리 메서드
		int m = this.money;
		try {
			Thread.sleep(200);	//출금처리 시간은 0.2초
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(m-minus);	//현잔액-출금액=> 잔액변경
	}
}
