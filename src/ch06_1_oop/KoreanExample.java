package ch06_1_oop;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("������","940814-1000000");
		System.out.println("�̸�:"+k1.name);
		System.out.println("�ֹι�ȣ:"+k1.ssn);
		
		Korean k2 = new Korean("������","000309-2000000");
		System.out.println("�̸�:"+k2.name);
		System.out.println("�ֹι�ȣ"+k2.ssn);

	}

}
