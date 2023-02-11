package section8_4;

public class Z_Animal {
	
	String name;
	int numLegs;
	
	static String staticField;
	
	public Z_Animal(String name, int numLegs) {
		System.out.println("This is non-arg constructor of Animal");
	}
	
//	public Z_Animal(String name) {
//		this.name=name;
//	}
	
//	public Z_Animal(String name, int numLegs) {
	//	this();  // invokes constructor within same class
//		this(name);
		//this.name=name;
//		this.numLegs=numLegs;
//	}

}
