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
		
//		ArrayList<Integer> a= new ArrayList<Integer>();
//		Random r = new Random();
//
//		int rn = r.nextInt(46);
//		System.out.println(rn);
//		int rn2 =r.nextInt(46);
//		System.out.println(rn2);
//		for (int i=0;i<46;i++) {
//			int rne=r.nextInt(46);
//			a.add(rne);
//			
//		}
//
//		System.out.println(a);
		
		
		//0.������ ���� �� Random ��ü ����
		Random random = new Random();
		ArrayList<Integer> initNo=new ArrayList<Integer>();
		ArrayList<Integer> lottoNo=new ArrayList<Integer>();
		
		//1. 1~45���� �־��ֱ�
//		for (int i=0;i<46;i++) {
//			initNo.add(i);
//		}
		
		

		
		//2. ������(������) index ����(6ȸ)
//		int temp=0; //������  index ��ȣ �ӽ�����
//		for(int t=0; t<6; t++) {
//			temp=random.nextInt(initNo.size()); //0~44 ������ index ��ȣ
//			lottoNo.add(initNo.remove(temp));
//		}
		
		//1. 1~45���� �־��ֱ�
		for (int i =0;i<46;i++) {
			initNo.add(i);
		}
		//2. ������(������) index ����(6ȸ)
		int temp=0;
		for (int i=0;i<6;i++) {
			temp=random.nextInt(initNo.size());
			System.out.println(temp);
			lottoNo.add(initNo.remove(temp));
//			System.out.println("����:"+initNo.remove(temp));
		}
		
		
//		//3. ����� �ζǹ�ȣ Ȯ��		get
		
		
		for(int i=0;i<6;i++) {
			
			System.out.println(lottoNo.get(i));
		}
		
		
		
		
		
		
		
//		//4. 3���� ���ϰ� ���		
		
		System.out.println("���ϰ�"+lottoNo.toString());

		
		
		
		
		
		
//		//3. ����� �ζǹ�ȣ Ȯ��
//		for(int t=0;t<6;t++) {
//			System.out.println(lottoNo.get(t));
//		}
//		
//		//4. 3���� ���ϰ� ���
//		System.out.print(lottoNo.toString());
//		
	}//main() END
}//Ŭ����  END
