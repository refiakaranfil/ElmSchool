package section8_4;

public class A_Car {
	
	private String make;
	private int mileage;
	private int maxSpeed;
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	{
		System.out.println("non-static Car");
	}
	
	static{
		System.out.println("static Car");
	}
	
	public void move() {
		
		System.out.println("Car is moving");
		
	}
	

	public A_Car(String make, int mileage, int maxSpeed) {
		
		setMake(make);
		setMileage(mileage);
		setMaxSpeed(maxSpeed);
		
		System.out.println("Constructor of Car");
		
	}
	
	public void printAll() {
		System.out.println(getMake()+"\n"+getMileage()+"\n"+getMaxSpeed());
	}

}
