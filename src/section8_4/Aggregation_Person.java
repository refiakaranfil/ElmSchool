package section8_4;

public class Aggregation_Person {
	
	//Aggregation
	//Person HAS-A Mercedes
	String name;
	long phoneNumber;
	Aggregation_Mercedes mercedes;


	public Aggregation_Person (String name, long phoneNumber, Aggregation_Mercedes mercedes) {

	this.name = name;
	this.phoneNumber = phoneNumber;
	this.mercedes = mercedes;

	}

	public String toString() {

	return this.name +"\n"+
	"Phone: " + this.phoneNumber+"\n"+
	"Car: " + mercedes.toString();
	}

}
