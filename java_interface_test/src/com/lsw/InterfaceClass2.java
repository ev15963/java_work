package com.lsw;

//interface�� ��ü�� �����Ұ���(���(�Ϲ� Ŭ����)�� �Ұ���)
//interface ������ �ѹݿ� ���߻�� ����
//�Ϲ� Ŭ������  interface�� ����(implements)���� �� �ִ�.
//�Ϲ� Ŭ������ interface���� �ѹ��� ������ ���� ���� �� �ִ�.
public interface InterfaceClass2 {
	//����� ���� ����
	int A=100;		// static final int A=100;
	
	// ������ ������ �� ����
//	public InterfaceClass() {
		// TODO Auto-generated constructor stub
//	}

	//�޼��� ����θ� ����({} ��� �Ұ���)
	public void prm();
	public void avg(int n1, int n2);
	public int avg(float f1, float f2);
}
