package com.lsw;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main() ����");
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
		System.out.println("main() ����");
		//����� 1.
		//Thread�� ��� �ް�, run() { } ���θ� ������
		//��ü����
		//start()�� ȣ�������ν� �����尡 �۵� ����
		
		//����� 2.
		//Runnable�� �����ް�, run(){ } ���θ� ������
		//��ü ����
		//�ݵ�� Thread Ŭ������ ���� ��ü ����
		//��ü ������, Runnable�� �������� ��ü�� �����ڿ� ����,
		//Thread ��ü ������ start() �޼ҵ� ȣ�������ν� �۵� ����!!
		//public interface Runnable { public void run(); }
		
		//public class Thread implements Runnable{
		//> currentThread() : ���� �������� ������ ��ȯ
		//> sleep(): �����带 �Ͻ�(���� �ð�����) ���� �޼���
		//> getName() : ������ �̸� ��ȯ
		//> setName(): ������ �̸� ����
		//> getPriority() : ������ �ڿ� �Ҵ� �޼���
		//> join() : �ٸ� �����尡 ����� ������ ���
		
		//> run() : ���� ������ �޼���(���� ������)
		//-> @Override void run() { } : ���� ������ �޼��� (���� �޼���)
		
		//> start() : �����带 ����(����)��Ű�� �޼���
//		}
	}

}
