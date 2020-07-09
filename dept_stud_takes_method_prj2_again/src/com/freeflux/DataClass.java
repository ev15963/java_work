package com.freeflux;

/**  학과 및 학생정보들을 보유하는 클래스 **/
public class DataClass {
	Department[] dep = new Department[3];
	Student[] stu = new Student[8];
	Takes[] tk = new Takes[12];

	public DataClass() {
	
	}

	/** 학과정보 초기 데이터 메서드 **/
	public void initDepartment() {
		dep[0]=new Department(920, "컴퓨터공학과", "201호");
		dep[1]=new Department(923, "산업공학과", "207호");
		dep[2]=new Department(925, "전자공학과", "308호");
	}

	/** 학생정보 초기 데이터 메서드 **/
	public void initStudent() {
		stu[0]=new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		stu[1]=new Student("1292002", "900305-1730021", "김정현", 3, "서울", 920);
		stu[2]=new Student("1292003", "891021-2308302", "김현정", 4, "대전", 920);
		stu[3]=new Student("1292301", "890902-2704012", "김현정", 2, "대구", 923);
		stu[4]=new Student("1292303", "910715-1524390", "박광수", 3, "광주", 923);
		stu[5]=new Student("1292305", "921011-1809003", "김우주", 4, "부산", 923);
		stu[6]=new Student("1292501", "900825-1506390", "박철수", 3, "대전", 925);
		stu[7]=new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925);
	}

	
	/** 성적정보 초기 데이터 메서드 **/
	public void initTakes() {
		tk[0]=new Takes("1292001", "C101-01", "B+");
		tk[1]=new Takes("1292001", "C103-01", "A+");
		tk[2]=new Takes("1292001", "C301-01", "A");
		tk[3]=new Takes("1292002", "C102-01", "A");
		tk[4]=new Takes("1292002", "C103-01", "B+");
		tk[5]=new Takes("1292002", "C502-01", "C+");
		tk[6]=new Takes("1292003", "C103-02", "B");
		tk[7]=new Takes("1292003", "C501-02", "A+");
		tk[8]=new Takes("1292301", "C102-01", "C+");
		tk[9]=new Takes("1292303", "C102-01", "C");
		tk[10]=new Takes("1292303", "C103-02", "B+");
		tk[11]=new Takes("1292303", "C501-01", "A+");
	}

} // class END
