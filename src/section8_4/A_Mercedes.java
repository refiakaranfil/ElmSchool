package section8_4;

public class A_Mercedes extends A_Car {
	
	String model;
	int doors;
	
	{
		System.out.println("non-static Mercedes");
	}
	
	static{
		System.out.println("static Mercedes");
	}
	
	public A_Mercedes() {
		super("", 0, 0);
		super.printAll();
		this.printAll();
		super.move();
	}
	public A_Mercedes(String make, int mileage, int maxSpeed, String model, int doors) {
		
		super(make, mileage, maxSpeed);//super() should come before everything else inside const.
		this.model =  model;
		this.doors = doors;
		System.out.println("Constructor of Mercedes");

	}
	
	
	public void printAll() {
		System.out.println(model + " " + doors);
	}

}
