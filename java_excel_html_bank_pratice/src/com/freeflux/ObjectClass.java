package com.freeflux;

/** ��ȸ�� �� ���� ������ ��� Ŭ���� **/
public class ObjectClass {

	private int no = 0;
	private int age = 0;
	private String job = "";
	private String marital = "";
	private String education = "";
	private String housing = "";
	private String loan = "";
	private String contact = "";
	private String month = "";
	private String day_of_week = "";
	private int duration = 0;

	/** �⺻ ������ **/
	public ObjectClass() {
	}

	/** �Ʒ��� ���� ���ڿ��� ���޹޾� ������ �����ϴ� ������ **/
	// "1" "18" "student" "single" "unknown" "yes" "no" "cellular" "may" "thu" "183"
	public ObjectClass(String no, String age, String job, String marital, String education, String housing, String loan,
			String contact, String month, String day_of_week, String duration) {

		this.no = Integer.parseInt(no);
		this.age = Integer.parseInt(age);
		this.job = burnyuk(job);
		this.marital = maritalToKor(marital);
		this.education = educationToKor(education);
		this.housing = housingToKor(housing);
		this.loan = loanToKor(loan);
		this.contact = contactToKor(contact);
		this.month = monthToKor(month);
		this.day_of_week = day_of_weekToKor(day_of_week);
		this.duration = Integer.parseInt(duration);
System.out.println("testtesttesttesttesttesttest");
	}

	/**
	 * ���� �ѱ� ����
	 * 
	 * @return
	 **/
	public String burnyuk(String eksdj) {
		switch (eksdj) {

		case "admin":
			return "������";
		case "blue-collar":
			return "���Į��";
		case "entrepreneur":
			return "�����";
		case "housemaid":
			return "����";
		case "management":
			return "������";
		case "retired":
			return "������";
		case "self-employed":
			return "�ڿ�����";
		case "services":
			return "�繫��";
		case "student":
			return "�л�";
		case "technician":
			return "�����";
		case "unemployed":
			return "���ػ�";
		default:
			return "����";
		}
	}

	/** ��ȥ���� (��ȥ/��ȥ) **/
	private String maritalToKor(String marital) {
		switch (marital) {
		case "single":
			return "��ȥ";
		case "married":
			return "��ȥ";
		default:
			return "��ȥ";
		}
	} // maritalToKor() END

	/** �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�) **/
	private String educationToKor(String education) {
		switch (education) {
		case "unknown" : return "�˼� ����";
		case "grad" : return "���п�";
		case "uiv" : return "����";
		default: return "����б�";
		}
	} // educationToKor() END

	/** ������ ���� (yes:���� / no:���� / unknown:�˼�����) **/

//	case"":return"";

	private String housingToKor(String housing) {
		switch(housing) {
		case "yes" : return "����";
		case "no" : return "����";
		default: return "�˼�����";
		}
	} // housingToKor() END

	/** ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����) **/
	private String loanToKor(String loan) {
		switch(loan) {
		case "yes" : return "����";
		case "no" : return "����";
		default: return "�˼�����";
		}
	} // loanToKor() END

	/** ���� (cellular:����Ʈ�� / telephone:����ȭ) **/
	private String contactToKor(String contact) {
		switch(contact) {
		case "cellular" : return "����Ʈ��";
		default: return "����ȭ";
		}
	} // contactToKor() END

	/** ���Կ� (jan:1�� / ... / dec:12��) **/
	private String monthToKor(String month) {
		switch (month) {
		case "jan":
			return "1��";
		case "feb":
			return "2��";
		case "mar":
			return "3��";
		case "apr":
			return "4��";
		case "may":
			return "5��";
		case "jun":
			return "6��";
		case "jul":
			return "7��";
		case "aug":
			return "8��";
		case "sep":
			return "9��";
		case "oct":
			return "10��";
		case "nov":
			return "11��";
		default:
			return "12��";
		}
	} // String monthToKor() END

	/** ���Կ��� (sun:�Ͽ���~sat:�����) **/
	private String day_of_weekToKor(String day_of_week) {
		switch (day_of_week) {
		case "mon" : return "������";
		case "tue" : return "ȭ����";
		case "wed" : return "������";
		case "thu" : return "�����";
		default : return "�ݿ���";
				
		}

	} // String day_of_weekToKor() END

//	this.no = no;
//	this.age = age;
//	this.job = burnyuk(job);
//	this.marital = maritalToKor(marital);
//	this.education = educationToKor(education);
//	this.housing = housingToKor(housing);
//	this.loan = loanToKor(loan);
//	this.contact = contactToKor(contact);
//	this.month = monthToKor(month);
//	this.day_of_week = day_of_weekToKor(day_of_week);
//	this.duration = Integer.parseInt(duration);
	
	/** ��ü ������ Ȯ�� �޼��� **/
	public void variableValues() {
		System.out.println(this.no+"_"+this.age);
	}

	/** �Ʒ� �޼������ private ���� ���� �޼���� **/
	// ����
//	private String no = "";
//	private String age = "";
//	private String job = "";
//	private String marital = "";
//	private String education = "";
//	private String housing = "";
//	private String loan = "";
//	private String contact = "";
//	private String month = "";
//	private String day_of_week = "";
//	private int duration = 0;
	
	public int getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	public String getMarial() {
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
