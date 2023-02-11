package section7_2;

public class Teacher {
	
	String name;
	int id;
	static String school;
	
	// 1. It gets executed before anything else
	// 2. It only get executed once	
	static {
		
		System.out.println("This is static block");
		school = "ELM";
	}
	
	// non static block
	// non static block get executed every time we create an object of class
	{
		System.out.println("This is non-static block");
		name = "default name";
		id = 0;
		school = "ajshk";
	}
	
	public Teacher() {
		
		System.out.println("No-ar Constructor");
		
	}
	
	// this.fieldName - instance variable
	// this.methodName - methods of class
	// this(parameter, parameter) - constructor
	public Teacher(String name, int id) {
		
		this.name = name;
		this.id = id;
		this.print();
		
	}
	
	public Teacher(String name, int id, String school) {
	
		this.name = name;
		this.id = id;
		this.school = school;
		
	}
	
	public static void print() {
		
		System.out.println("This is static print method");
	}

}
