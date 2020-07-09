package com.lsw;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		/** Math.class의 random()과 Random.class의 nextInt() **/
		//임의의 수 즉, 무작위 수 추출..
		//Math.class의 random() : 0~1 사이의 실수 (소숫점)
		System.out.println(Math.random());

		Random r=new Random();
		//nextInt() 정수 범위지정 : nextInt(10)=> 0~9
		System.out.println(r.nextInt(10));
		
	}//main() END
}
