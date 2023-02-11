package section7_1;

public class Car2 {
	
	static int maxSpeed;			// try without static
	String make;
	String color;
	double price;
	long vinNumber;
	static String origin = "USA";   // try without static
	
	public void insertData (int speed, String m, String clr, double p, long vin) {
		maxSpeed = speed;
		make = m;
		color = clr;
		price = p;
		vinNumber = vin;
	}
	
	public void printCar() {
		
		System.out.println("$" + price + " " + color + " " + make + " VIN Number: " + vinNumber + " Max Speed: " + maxSpeed);
	}
	
	public static void printSpeedAndOrigin() {
		
		System.out.println("Origin: " + origin + " Speed: " + maxSpeed);

	}

}
