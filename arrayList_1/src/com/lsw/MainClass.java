package com.lsw;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/** �ζ� ��ȣ ����� **/
		//�ζ� ��ȣ : 1~45����..: ArrayList
		//6��: for( =1;  <46;  ){ }
		
		//������ ���� ��ȣ ���� : 6�� (�ߺ��� ����)
		//Random.class => nextInt(ArrayList.size())
		//�ߺ��� ���� : ArrayList.class => remove(index)
		//6��: for( ;  <6;  )
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		Random r = new Random();

		int rn = r.nextInt(46);
		System.out.println(rn);
		int rn2 =r.nextInt(46);
		System.out.println(rn2);
		for (int i=0;i<46;i++) {
			int rne=r.nextInt(46);
			a.add(rne);
			
		}

		System.out.println(a);
		
		
		
	}//main() END
}//Ŭ����  END
