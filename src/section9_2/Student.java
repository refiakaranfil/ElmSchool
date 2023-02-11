package section9_2;

public class Student {
	
	String firstName;
	String lastName;
	int id;
	int age;
	
	public Student() {
		super();
	}
	
	public Student(String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
	
	public String toString() {
		
		return "firstName=" + firstName  + " lastName=" + lastName + " id=" + id + " age=" + age;
	}
	
	public boolean equals(Student s1, Student s2) {
		
		return new StudentComparator().compare(s1, s2) == 0;
		
	}

}
