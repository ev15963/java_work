package com.lsw;

public class ThreadName1 extends Thread{

	public ThreadName1(String s) {
		super(s);
	}
	public void run() {
		int i =0;
		while(i<20) {
			System.out.println(getName());
			i++;
		}
	}

}
