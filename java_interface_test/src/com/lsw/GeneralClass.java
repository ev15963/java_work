package com.lsw;

//interface�� �Ϲ� Ŭ�������� ��ӵ� �� ����..
//public class GeneralClass extends InterfaceClass{

//interface�� �Ϲ� Ŭ�������� ���� ����
//�Ϲ� Ŭ������ interface�� �������� ���
//interface ���ο� ����� �޼��带 ���� ������ �ؾ� �Ѵ�.
public class GeneralClass implements InterfaceClass, InterfaceClass2,InterfaceClass3 {
	//��� (�ν��Ͻ�) ���� ����
	
	//������ ����
	public GeneralClass() {
		int test=InterfaceClass.A;
		int test2=InterfaceClass2.A;
		int test3=InterfaceClass3.A;
//		A=100;
//		InterfaceClass.A=1000;
//		A=100;		//����
	}
	//@ ������̼�
	// Override : ������̼� �̸� ******** �����߿� ~~~ Spring
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void avg(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int avg(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//�޼��� ����

}
