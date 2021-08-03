package ch06_1_oop;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박진형","940814-1000000");
		System.out.println("이름:"+k1.name);
		System.out.println("주민번호:"+k1.ssn);
		
		Korean k2 = new Korean("고인정","000309-2000000");
		System.out.println("이름:"+k2.name);
		System.out.println("주민번호"+k2.ssn);

	}

}
