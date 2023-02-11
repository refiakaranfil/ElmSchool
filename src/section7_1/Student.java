package section7_1;

class Student {
	
	// fields, members, instance variables
	long id;
	String name;
	
	public static void main(String[] args) {
		
		//this is object creation of student class(by the helo of 'new' keyword)		
		Student student1 = new Student();
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		
		student1.id = 237864;
		student1.name = "Refia";
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		
	}

}
