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
}//클래스  END
