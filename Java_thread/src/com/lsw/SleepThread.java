package com.lsw;

public class SleepThread extends Thread {

	public SleepThread() {
	}
	public void run() {
		System.out.println("sleep start!");
		try {
			Thread.sleep(2000); //thread�� �ϴ� ���� ���߿� ���ƹ��� InterruptedException
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sleep end!");
	}

}
