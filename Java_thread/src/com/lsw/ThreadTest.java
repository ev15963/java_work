package com.lsw;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main() ����");
		MyThread mt1 = new MyThread();
		mt1.start();
		MyThread mt2 = new MyThread();
		mt2.start();
		MyThread mt3 = new MyThread();
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
