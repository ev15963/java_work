package com.lsw;

public class MainClass {

	public static void main(String[] args) {

		DataClass.initDEPT();
		DataClass.initSTD();
		
		int count = 0;
		int ageSum = 0;
		String code="";
		for (int i = 0; i < DataClass.std.length; i++) {
			String num[] = DataClass.std[i].stdJuminno.split("-");
			String front = num[0].substring(0, 2);
			int fnum = Integer.parseInt(front);
			if (num[1].startsWith("2") == true) {
				System.out.println(i+"번째 등록된 이름은" + DataClass.std[i].stdName);
				int age = (2020 - (1900 + fnum));
				ageSum += age;
				count++;
				
				//학과
				code = code + DataClass.std[i].stdHakgua + ",";
				System.out.println("code"+code);
			}
			
		}
		
		//for 
		System.out.println("평균나이는 "+ageSum/count);

//		for (int i=0;i<DataClass.dept.length;i++) {
//			String[] codeNum = code.split(",");
//			for (int j=0;j<codeNum.length;j++) {
//				if (DataClass.dept[i].depNo.equals(codeNum[j])) {
//					System.out.println("학과는 "+DataClass.dept[i].depName);
//				}
//			}
//		}
		String dName="";
		for (int i=0; i<DataClass.dept.length)
		

	}


}
