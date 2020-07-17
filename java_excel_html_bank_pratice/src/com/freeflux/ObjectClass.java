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


	}

	/**
	 * ���� �ѱ� ����
	 * @return 
	 **/
	public String burnyuk(String eksdj) {
		
	}

	/** ��ȥ���� (��ȥ/��ȥ) **/
	private String maritalToKor(String marital) {
		
	} // maritalToKor() END

	/** �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�) **/
	private String educationToKor(String education) {
		
	} // educationToKor() END

	/** ������ ���� (yes:���� / no:���� / unknown:�˼�����) **/
	private String housingToKor(String housing) {
		
	} // housingToKor() END

	/** ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����) **/
	private String loanToKor(String loan) {
		
	} // loanToKor() END

	/** ���� (cellular:����Ʈ�� / telephone:����ȭ) **/
	private String contactToKor(String contact) {
		
	} // contactToKor() END

	/** ���Կ� (jan:1�� / ... / dec:12��) **/
	private String monthToKor(String month) {
		//
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
		//
		

	} // String day_of_weekToKor() END

	/** ��ü ������ Ȯ�� �޼��� **/
	public void variableValues() {
		
	}

	/** �Ʒ� �޼������ private ���� ���� �޼���� **/
	// ����
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
