package com.freeflux;

/** �л����� Ŭ���� **/
public class Student {
	public String stu_id="";		// �й�
	public String resident_id="";	// �ֹι�ȣ
	public String name="";		// �̸�
	public int year=0; 				// �г�
	public String address="";		// �ּ�
	public String dept_id=""; 		// �а���ȣ
	
	public int age=0;					// ����
	public char gender='0';		// ����
	
	//("1292001", "900424-1825409", "�豤��", 3, "����", "920");
	public Student(String s, String r, String n, int y, String a, String d) {
		this.stu_id=s;
		this.resident_id=r;
		this.name=n;
		this.year=y;
		this.address=a;
		this.dept_id=d;
		
		/** ���̿� ������ ���ϴ� �޼��忡�� ���� �����ϱ� ���� �и� �۾� **/
		// �ֹι�ȣ �и� : "900424-1825409" => "900424" "1825409"
		String[] residents=this.resident_id.split("-");
		String residentFront=residents[0].substring(0,2);	// "900424"=>"90"
		String residentBack=residents[1].substring(0,1);	// "1825409"=>"1"
		
		this.ageMethod(residentFront, residentBack);		// ���� �޼��� ȣ��
		this.genderMethod(residentBack);						// ���� �޼��� ȣ��
	} // ������ END

	/** �ֹι�ȣ�� �̿��Ͽ� ���̸� ���ϴ� �޼��� **/
	public void ageMethod(String rFront, String rBack) {
		if(rBack.equals("1") || rBack.equals("2") ) {
			this.age=2020-(Integer.parseInt(rFront)+1900);
		}else {
			this.age=2020-(Integer.parseInt(rFront)+2000);
		}
	} // ageMethod() END
	
	/** �ֹι�ȣ�� �̿��Ͽ� ������ ���ϴ� �޼��� **/
	public void genderMethod(String rBack) {
		if(rBack.equals("1") || rBack.equals("3") ) {
			this.gender='M';
		}else {
			this.gender='F';
		}
	} // genderMethod() END
	
} // class END




