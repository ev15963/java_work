package com.lsw;



/**	public class Thread implements Runnable {
*		public Thread() {
*			
*		}
*		@Override //인터페이스를 강제 적용한 직계만 강제 재정의
*		public void run() {
*		}
*	}
*public class MyThread extends Thread {
*	public void run() {~~~~~}
*	public void start() {   }
*}
*/

public class MyThread extends Thread{
	
	public MyThread() {
		System.out.println("MyThread의 생성자");
	}
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("run() 내부, 스레드 시작됨");
			i++;
		}
	}//run() END

}//class END
