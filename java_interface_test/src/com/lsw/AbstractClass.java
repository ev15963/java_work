package com.lsw;
//�߻�Ŭ����=�Ϲ�Ŭ����+interface
//�߻�Ŭ������ ����� ���� �����ڸ� ����
//��, new �����ڷ� ��ü ���� �Ұ���..
//�߻�Ŭ���� ���� : abstract class Ŭ������
public abstract class AbstractClass {
	//������� ��� ��� ���� ����
	public AbstractClass() {
	}
	//�Ϲݸ޼��� ���� ����
	public void max() {
		System.out.println("�׽�Ʈ");
	}
	//�߻�޼��� ���� ����(�޼���� ����)
	public abstract void avg(); // ��ӹ޴� Ŭ�������� �ݵ�� ���� ������!!!
}
