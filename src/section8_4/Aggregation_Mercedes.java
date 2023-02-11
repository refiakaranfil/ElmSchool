package section8_4;

public class Aggregation_Mercedes extends Aggregation_Car {
	
	//Aggregation_Mercedes IS-A Car
	String model;
	int doors;


	public Aggregation_Mercedes(String make, int mileage, int maxSpeed, String model, int doors) {

	super(make, mileage, maxSpeed);//super() should come before everything else inside const.
	this.model = model;
	this.doors = doors;


	}


	public String toString() {

	return super.getMake() + " " + this.model +"\n"+
	"Milage: "+ super.getMileage()+"\n"+
	"Max Speed: " + super.getMaxSpeed() +"\n"+
	"Door Numbers: " + this.doors;
	}

}
