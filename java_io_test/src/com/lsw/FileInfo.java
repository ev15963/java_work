package com.lsw;

import java.io.File;
import java.sql.Date;

public class FileInfo {
	public static void main(String[] args) {
		//읽을 파일 이름 지정
		String fname="src/com/lsw/FileInfo.java";
		//File 객체 생성
		File f = new File(fname);
		System.out.println("파일"+f.getName()+"정보:"); //파일명
		System.err.println();
		System.out.println("\t패스:"+f.getPath()); //상대경로 웹쪽에 주로 사용
		System.out.println("\t절대패스:"+f.getAbsolutePath()); //절대경로 : 드라이브명:\ 
		System.out.println("\t부모:"+f.getParent()); //지정한 파일의 부모주소
		System.out.println("\t쓰기여부:"+f.canWrite()); // 쓸 수 있는 상태인지 boolean값으로 반환
		System.out.println("\t읽기여부:"+f.canRead());	//읽을 수 있는 상태인지 boolean값으로 반환
		System.out.println("\t파일여부:"+f.isFile()); //지정한 파일 boolean 값으로 반환 
		System.out.println("\t폴더여부:"+f.isDirectory()); //폴더여부 boolean 값으로 반환
		System.out.println("\t수정일:"+new Date(f.lastModified())); // 최종 날짜값을 숫자로 반환
		System.out.println("\t파일크기:"+f.length()); // 파일의 크기 byte 단위
		
		//new Date() : 정수를 날짜로 바꿔주는 내용
	}
	
}
