package ch06_1_oop;


	public class StudentExample{
		public static void main(String[] args) {
			
			Student s1 = new Student();		//������ ȣ�� StudentŬ�����ȿ� �����ڸ� �ҷ���
			System.out.println(s1.num);
			s1.setNum(1);
			
			System.out.println("s1 ������ Student ��ü�� �����մϴ�.");

			Student s2 = new Student();
			s2.setNum(2);
			System.out.println("s2 ������ Student ��ü�� �����մϴ�.");
		
			
			System.out.println(s1.getNum());
			System.out.println(s2.getNum());
		
		
		}
		
	}
