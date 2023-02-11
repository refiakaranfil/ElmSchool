package section9_2;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	int id;
	
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String toString( ) {
		
		return this.name + " " + this.age + " " + this.id;
	}

	
	public int compareTo(Person p) {
		
		return (this.age - p.age == 0) ?
			  (this.name.compareTo(p.name)) :
				  this.age - p.age;
	}

}
