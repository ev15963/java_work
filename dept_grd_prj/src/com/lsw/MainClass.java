package com.lsw;

public class MainClass {

	public static void main(String[] args) {

		DataClass dc = new DataClass();
		DataClass.initTakes();
		DataClass.initDepartments();
		DataClass.initStudents();
		//����

		String dNum= "";
		for(int i=0;i<dc.tk.length;i++) {
			if(dc.tk[i].tkGrade.equals("A+")||dc.tk[i].tkGrade.equals("A")) {
			System.out.println(dc.tk[i].tkGrade);
				dNum= dNum + dc.tk[i].tkHakburn+",";
			}
		}

		System.out.println(dNum);
		dNum.split(",");
		System.out.println(dNum);
		
//		String dlfma(String same) {
//			for (int i=0;i<dc.std.length;i++) {
//				if(dc.std[i].stuHakburn.equals(same)) {
//					System.out.println(dc.std[i].stuName);
//				}
//			}
//		}
		
//		for (int i=0;i<dc.std.length;i++) {
//			
//		}
		 
			
	}

	private static void dlfma(String tkHakburn) {
		// TODO Auto-generated method stub
		
	}

}
