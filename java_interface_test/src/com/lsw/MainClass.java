package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		//interface�� �����ڰ� ���� ������ ��ü ���� �Ұ���!!!
//		InterfaceClass ic = new InterfaceClass(); //����
		
		GeneralClass gc=new GeneralClass();
		gc.avg();	//���� ������ �޼��� (�߻�޼���)
		gc.max();	//��ӹ��� �Ϲݸ޼���
		
		//�߻�Ŭ������ �����ڸ� ���������� new�� ��ü ���� �Ұ���!
//		AbstractClass ac = new AbstractClass(); ����
		
		//�������� interface Ÿ���� ����� ���,
		//�� ��ü�� �ش� interface�� �����޼��常 ��� ����
//		InterfaceClass gc1=new GeneralClass();
//		gc1.
//		InterfaceClass2 gc2=new GeneralClass();
//		
//		InterfaceClass3 gc3=new GeneralClass();
//		gc3.
	}

}
