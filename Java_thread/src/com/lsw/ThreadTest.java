package com.lsw;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main() ����");
		RunnableClass rc = new RunnableClass();
		Thread t=new Thread(rc);
		t.start();
//		FakeThread mt1 = new FakeThread("A");
//		mt1.start();
//		FakeThread mt2 = new FakeThread("B");
//		mt2.start();
//		FakeThread mt3 = new FakeThread("C");
//		mt3.start();
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
