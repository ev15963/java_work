package com.freeflux;

/** ������ �ϴ� �޼��鸸 �����ϴ� Ŭ����
	@param dc : ��ü �����͵� ���� ��ü
**/
public class MethodClass {
	public static DataClass dc=null;
	
	public MethodClass() {	//�⺻ ������
	}	// ������ END
	
	/** ��ü �����͸� �����ϴ� ��ü ���� �޼��� ���� **/
	public static void createObject() {
		dc=new DataClass();
	}

	/** ���� ���ϰ� ��ȯ�ϴ� �޼��� ���� 
	 * @return 
	 * @return : ��ȸ�� �� ��ȯ
	 **/
	public static int sum() {
		dc.initBoards();
		int temp=0; //�� ���� ����
		for(int i=0;i<dc.boardList.length;i++) {
			temp=temp+dc.boardList[i].hit;
		}
		return temp;
	}
	
	/** ��ձ��ϰ� ��ȯ�ϴ� �޼��� ���� 
	 * @param totalHit :��ȸ�� ��**/
	public static double mean(int totalHit) {
		return (float) totalHit /dc.boardList.length;
	}
	
	/** ����ϴ� �޼��� ���� 
	 * @param avgHit :��ȸ�����**/
	public static void printResult(double avgHit) {
		String t="��ȸ��";
		int n=10;
		System.out.printf("���%s: %.1f => %d",t,avgHit, n);
	}
	
	/** �ߺ����� �����Ͽ� ��ȯ�ϴ� �޼��� ���� **/
	public static void unique() {
		
	}
}
