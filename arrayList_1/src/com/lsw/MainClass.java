package com.lsw;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/** Math.class�� random()�� Random.class�� nextInt() **/
		//������ �� ��, ������ �� ����..
		//Math.class�� random() : 0~1 ������ �Ǽ� (�Ҽ���)
		System.out.println(Math.random());

		Random r=new Random();
		//nextInt() ���� �������� : nextInt(10)=> 0~9
		System.out.println(r.nextInt(10));
		
	}//main() END
}
