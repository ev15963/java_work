package com.freeflux;

/** ��ȸ�� �� ���� ������ ��� Ŭ���� **/
public class ObjectClass {

	private int no = 0; // ��ȣ
	private int age = 0; // ����
	private String job = ""; // ����
	private String marital = ""; // ��ȥ���� (��ȥ/��ȥ)
	private String education = ""; // �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�)
	private String housing = ""; // ������ ���� (yes:���� / no:���� / unknown:�˼�����)
	private String loan = ""; // ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����)
	private String contact = ""; // ���� (cellular:����Ʈ�� / telephone:����ȭ)
	private String month = ""; // ���Կ� (jan:1�� / ... / dec:12��)
	private String day_of_week = ""; // ���Կ��� (sun:�Ͽ���~sat:�����)
	private int duration = 0; // �Ⱓ (��¥ �ϼ�)

	/** �⺻ ������ **/
	public ObjectClass() {
	}

	/** �Ʒ��� ���� ���ڿ��� ���޹޾� ������ �����ϴ� ������ **/
	// "1" "18" "student" "single" "unknown" "yes" "no" "cellular" "may" "thu" "183"
	public ObjectClass(String no, String age, String job, String marital, String education, String housing, String loan,
			String contact, String month, String day_of_week, String duration) {
		this.no = Integer.parseInt(no);
		this.age = Integer.parseInt(age);
		this.job = job;
		this.marital = maritalToKor(marital);
		this.education = educationToKor(education);
		this.housing = housingToKor(housing);
		this.loan = loanToKor(loan);
		this.contact = contactToKor(contact);
		this.month = monthToKor(month);
		this.day_of_week = day_of_weekToKor(day_of_week);
		this.duration = Integer.parseInt(duration);
	}

	/** ��ȥ���� (��ȥ/��ȥ) **/
	private String maritalToKor(String marital) {
		
		return "";
	} // maritalToKor() END

	/** �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�) **/
	private String educationToKor(String education) {
		
		return "";
	} // educationToKor() END

	/** ������ ���� (yes:���� / no:���� / unknown:�˼�����) **/
	private String housingToKor(String housing) {
		
		return "";
	} // housingToKor() END

	/** ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����) **/
	private String loanToKor(String loan) {
		
		return "";
	} // loanToKor() END

	/** ���� (cellular:����Ʈ�� / telephone:����ȭ) **/
	private String contactToKor(String contact) {
		
		return "";
	} // contactToKor() END

	/** ���Կ� (jan:1�� / ... / dec:12��) **/
	private String monthToKor(String month) {
		
		return "";
	} // String monthToKor() END

	/** ���Կ��� (sun:�Ͽ���~sat:�����) **/
	private String day_of_weekToKor(String day_of_week) {
		
		return "";
	} // String day_of_weekToKor() END

	/** ��ü ������ Ȯ�� �޼��� **/
	public void variableValues() {
		System.out.println(this.no + "_" + this.age + "_" + this.job + "_" + this.marital + "_" + this.education + "_"
				+ this.housing + "_" + this.loan + "_" + this.contact + "_" + this.month + "_" + this.day_of_week + "_"
				+ this.duration);
	}

	/** �Ʒ� �޼������ private ���� ���� �޼���� **/

	public int getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

	public String getMarital() {
		return marital;
	}

	public String getEducation() {
		return education;
	}

	public String getHousing() {
		return housing;
	}

	public String getLoan() {
		return loan;
	}

	public String getContact() {
		return contact;
	}

	public String getMonth() {
		return month;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public int getDuration() {
		return duration;
	}

}
