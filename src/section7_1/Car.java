package section7_1;

public class Car {

	 // Class can contain: Fields, Methods, Constructors, Blocks, Nested Classes and Interfaces
	 	
	String color;
	String make;
	int maxSpeed;
	long vinNumber;
	
	public void insertData(String col, String makeName, int speed, long vin) {
		
		color = col;
		make= makeName;
		maxSpeed = speed;
		vinNumber = vin;
		
	}
	

}
