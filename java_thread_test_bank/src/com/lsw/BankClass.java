package com.lsw;

public class BankClass {

	private int money = 10000; // ���� �ܾ�

	public BankClass() {
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) { // ����� ����� ���� �ܾ� ����
		this.money=money;
	} // setMoney() END

	public void saveMoney(int save) { // �Ա�ó�� �޼���
		int m =this.getMoney();
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			this.setMoney(m+save);
	}	// saveMoney() END

	public void minusMoney(int minus) { // ���ó�� �޼���
		int m = this.money;
		try {
			Thread.sleep(200);	//���ó�� �ð��� 0.2��
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(m-minus);	//���ܾ�-��ݾ�=> �ܾ׺���
	}
}
