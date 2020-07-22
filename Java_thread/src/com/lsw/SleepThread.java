package com.lsw;

public class SleepThread extends Thread {

	public SleepThread() {
	}
	public void run() {
		System.out.println("sleep start!");
		try {
			Thread.sleep(2000); //thread를 하는 일을 도중에 막아버림 InterruptedException
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sleep end!");
	}

}
