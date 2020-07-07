package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		// DataClass dc = new DataClass();

		// DataClass.initDept();
		// System.out.println(DataTestClass.n2);
		// DataTestClass dtc=new DataTestClass();
		// System.out.println(dtc.n2);
		// DataTestClass dtc2=new DataTestClass();
		// dtc.n2=1000;
		// System.out.println(dtc2.n2);
		// System.out.println(dtc.n2);
		// System.out.println(DataTestClass.n2[0]);
		// System.out.println(DataTestClass.n2[0]);

		// 특정부서에 근무하는 사람의 이름 출력
		
		DataClass.initDEPT();
		DataClass.initEMP();
		String dName = "경리부";
		String dNo="";
		for (int i=0;i<DataClass.dept[i].deptName.length();i++) {
			if(DataClass.dept[i].deptName.equals(dName)) {
				dNo=DataClass.dept[i].deptNo;
			//	System.out.println(i); //0
			}
		}
		
		for (int i=0;i<DataClass.emps[i].deptNo.length();i++) {
			if(DataClass.emps[i].deptNo.equals(dNo)) {
				System.out.println(DataClass.emps[i].empName);
			}
		}

		//System.out.println(DataClass.emps[0].empName); //20
	}
	

}
