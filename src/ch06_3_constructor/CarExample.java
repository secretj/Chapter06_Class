package ch06_3_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company:"+ car1.company);
		System.out.println();
		
		Car car2 =new Car("자가용");
		System.out.println("car2.company:"+car2.company);
		System.out.println("car2.model:"+ car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		

	}

}


class Car{
	//필드
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car(){
 }
	
	Car(String model){
		this(model, "회색", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
	
		this.model =model;
		this.color=color;
		this.maxSpeed =maxSpeed;
	}
	
	int add(int x) {
		return 0;
	}
	
	int add(int x, int y) {
		
		return 0;
	}
	
	int add(int x, int y, int z) {
		
		return 0;
		
	
	}
	
}