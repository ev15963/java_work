package com.lsw;

public class EMPMainMethod {

	public static void main(String[] args) {
		int[] age={27,34,28,26,41,28,42,29,29,32};
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		String[] phone={"010-8532-0537","010-9672-5257","010-9932-4536","010-4117-0975","011-8975-7892","010-6251-6976","010-9482-6059","010-4845-0105","010-6283-4849","010-4510-1609"};

		char[] gender={'F','M','F','M','M','F','M','M','F','M'};

		int[] pay={460,200,250,300,300,200,350,200,400,440};

		String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};

		System.out.println("���� ����� ��� ���̴� "+ ManAvgAge()+"�Դϴ�.");
		JPWork();
		System.out.println("���ڻ���� ��� �޿��� "+FeAvgPay()+"�Դϴ�.");
	}
	//���� ����� ��� ���� ���ϱ� (34, 26, 41, 42, 29, 32)
	public static int ManAvgAge() {
		int sum=0; int count =0;
		int[] age={27,34,28,26,41,28,42,29,29,32};
		char[] gender={'F','M','F','M','M','F','M','M','F','M'};
		for (int i=0;i<gender.length;i++) {
			if (gender[i]=='M') {
				sum+=age[i];
				count++;
			}
		}
		return (sum/count);
	}
	
	
	//�Ϻ��� �ٹ��ϴ� ������� �̸��� ����ó
	//��� ����
	//�̸�, ����ó
	//�̸�, ����ó
	//�̸�, ����ó
	public static void JPWork() {
		String[] name={"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		String[] phone={"010-8532-0537","010-9672-5257","010-9932-4536","010-4117-0975","011-8975-7892","010-6251-6976","010-9482-6059","010-4845-0105","010-6283-4849","010-4510-1609"};
		String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};

		for (int i=0;i<code.length;i++) {
			if (code[i].equals("JP")) {
				System.out.println("�̸� : "+ name[i]+ ", ����ó : "+phone[i]);
			}
		}
		
		
	}
	
	
	//���ڻ���� ��� �޿� ���ϱ�
	public static double FeAvgPay() {
		double sum=0; int count =0;
		char[] gender={'F','M','F','M','M','F','M','M','F','M'};
		int[] pay={460,200,250,300,300,200,350,200,400,440};
		for (int i=0;i<gender.length;i++) {
			if (gender[i]=='F') {
				sum+=pay[i];
				count++;
			}
		}
		return (sum/count);
	}

}
