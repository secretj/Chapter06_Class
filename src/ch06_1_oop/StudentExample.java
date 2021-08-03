package ch06_1_oop;


	public class StudentExample{
		public static void main(String[] args) {
			
			Student s1 = new Student();		//생성자 호출 Student클래스안에 생성자를 불러옴
			System.out.println(s1.num);
			s1.setNum(1);
			
			System.out.println("s1 변수가 Student 객체를 참조합니다.");

			Student s2 = new Student();
			s2.setNum(2);
			System.out.println("s2 변수가 Student 객체를 참조합니다.");
		
			
			System.out.println(s1.getNum());
			System.out.println(s2.getNum());
		
		
		}
		
	}
