package com.lsw;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/** 로또 번호 추출기 **/
		//로또 번호 : 1~45까지..: ArrayList
		//6개: for( =1;  <46;  ){ }
		
		//무작위 추출 번호 갯수 : 6개 (중복값 없음)
		//Random.class => nextInt(ArrayList.size())
		//중복값 없음 : ArrayList.class => remove(index)
		//6개: for( ;  <6;  )
		
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
		
		
		//0.데이터 저장 및 Random 객체 생성
		Random random = new Random();
		ArrayList<Integer> initNo=new ArrayList<Integer>();
		ArrayList<Integer> lottoNo=new ArrayList<Integer>();
		
		//1. 1~45까지 넣어주기
//		for (int i=0;i<46;i++) {
//			initNo.add(i);
//		}
		
		

		
		//2. 임의의(무작의) index 추출(6회)
//		int temp=0; //임의의  index 번호 임시저장
//		for(int t=0; t<6; t++) {
//			temp=random.nextInt(initNo.size()); //0~44 임으의 index 번호
//			lottoNo.add(initNo.remove(temp));
//		}
		
		//1. 1~45까지 넣어주기
		for (int i =0;i<46;i++) {
			initNo.add(i);
		}
		//2. 임의의(무작의) index 추출(6회)
		int temp=0;
		for (int i=0;i<6;i++) {
			temp=random.nextInt(initNo.size());
			System.out.println(temp);
			lottoNo.add(initNo.remove(temp));
//			System.out.println("삭제:"+initNo.remove(temp));
		}
		
		
//		//3. 추출된 로또번호 확인		get
		
		
		for(int i=0;i<6;i++) {
			
			System.out.println(lottoNo.get(i));
		}
		
		
		
		
		
		
		
//		//4. 3번을 편하게 사용		
		
		System.out.println("편하게"+lottoNo.toString());

		
		
		
		
		
		
//		//3. 추출된 로또번호 확인
//		for(int t=0;t<6;t++) {
//			System.out.println(lottoNo.get(t));
//		}
//		
//		//4. 3번을 편하게 사용
//		System.out.print(lottoNo.toString());
//		
	}//main() END
}//클래스  END
