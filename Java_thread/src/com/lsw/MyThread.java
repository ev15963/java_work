package com.lsw;



/**	public class Thread implements Runnable {
*		public Thread() {
*			
*		}
*		@Override //�������̽��� ���� ������ ���踸 ���� ������
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
		System.out.println("MyThread�� ������");
	}
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("run() ����, ������ ���۵�");
			i++;
		}
	}//run() END

}//class END
