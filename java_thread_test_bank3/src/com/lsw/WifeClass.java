package com.lsw;

public class WifeClass extends Thread{

	public WifeClass() {
	} //������
	
	public void run() {
		synchronized (MainClass.myBank) {
			MainClass.myBank.minusMoney(1000); //���� ���� ���ó�� �ð� 0.2��
		}

		System.out.println("minusMoney(1000):"+MainClass.myBank.getMoney());
	}

}
