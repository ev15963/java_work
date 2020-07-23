package com.lsw;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIO {
	public static void main(String[] args) throws IOException{
		int c;
		byte b[]= {'a', 'b', 'c', 'd'};
		
		//배열 b를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		
		//배열 b를 소문자를 대문자로 출력하는 ByteArrayOutputSteam 객체를 생성
		ByteArrayOutputStream bOutput= new ByteArrayOutputStream();
		
		System.out.println("문자를 읽어 대문자로 출력");
		while ((c=bInput.read()) !=-1) {
			System.out.println((char)c);
			
			bOutput.write(Character.toUpperCase((char)c));
		}
		
		System.out.println();
		//객체 ByteArrayOutputStream을 출력하면  출력된 자료가 그래도 출력
		System.out.println(bOutput);
		
		//배열 Arrays 메소드 toString() 사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(bOutput.toByteArray()));
	}

}
