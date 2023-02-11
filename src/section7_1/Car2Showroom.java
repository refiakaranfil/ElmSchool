package section7_1;

public class Car2Showroom {
	
	// we can't call non static fields in static method
	// only way is calling non static fields through objects
	
	public static void main(String[] args) {
		
		Car2 car1 =  new Car2();
		Car2 car2 =  new Car2();
		Car2 car3 =  new Car2();
		
		car1.insertData(160, "Mercedes", "White", 7000, 10000004);
		car1.printCar();
		
		Car2 car4 =  new Car2();
		car4.printCar();
		
		
		System.out.println(car4.origin);
		
		car4.origin = "Turkey";
		System.out.println(car1.origin);
		System.out.println(car2.origin);
		System.out.println(car3.origin);
		System.out.println(car4.origin);
		
		
		car1.maxSpeed = 150;
		car2.maxSpeed = 165;
		car3.maxSpeed = 200;
		System.out.println(car1.maxSpeed);
		System.out.println(car2.maxSpeed);
		System.out.println(car3.maxSpeed);
		
		Car2.printSpeedAndOrigin();
		
	}

}
