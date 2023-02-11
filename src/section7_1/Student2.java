package section7_1;

public class Student2 {
	
	String name;
	String lastName;
	static String school = "ELM";
	
	public Student2() {    //also known as the default constructor,  
						   //also known as no-arg constructor is added for us by the compiler.
	}                      //This is the reason why we are able to call the new Student() method in our Classroom class.
	
	public Student2(String schoolName) {
		school = schoolName;
		
	}
	
	public Student2(String n, String l) {
		name = n;
		lastName = l;
	}
	
	public void insertData(String n, String l) {
		name = n;
		lastName = l;
		
	}

}
