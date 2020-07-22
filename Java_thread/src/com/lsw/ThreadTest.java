package com.lsw;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main() 시작");
//		RunnableClass rc = new RunnableClass();
//		Thread t=new Thread(rc);
//		t.start();
		ThreadName1 mt1 = new ThreadName1("A");
		mt1.setName("aaaa");
		mt1.start();
		ThreadName1 mt2 = new ThreadName1("B");
		mt2.setName("bbbb");
		mt2.start();
		ThreadName1 mt3 = new ThreadName1("C");
		mt3.setName("cccc");
		mt3.start();
		System.out.println("main() 종료");
		//사용방법 1.
		//Thread를 상속 받고, run() { } 내부를 재정의
		//객체생성
		//start()를 호출함으로써 스레드가 작동 시작
		
		//사용방법 2.
		//Runnable을 구현받고, run(){ } 내부를 재정의
		//객체 생성
		//반드시 Thread 클래스에 대한 객체 생성
		//객체 생성시, Runnable을 구현받은 객체를 생성자에 전달,
		//Thread 객체 내부의 start() 메소드 호출함으로써 작동 시작!!
		//public interface Runnable { public void run(); }
		
		//public class Thread implements Runnable{
		//> currentThread() : 현재 구동중인 스레드 반환
		//> sleep(): 스레드를 일시(지정 시간동안) 재우는 메서드
		//> getName() : 스레드 이름 반환
		//> setName(): 스레드 이름 설정
		//> getPriority() : 스레드 자원 할당 메서드
		//> join() : 다른 스레드가 종료될 때까지 대기
		
		//> run() : 강제 재정의 메서드(실제 스레드)
		//-> @Override void run() { } : 강제 재정의 메서드 (실제 메서드)
		
		//> start() : 스레드를 구동(시작)시키는 메서드
//		}
	}

}
