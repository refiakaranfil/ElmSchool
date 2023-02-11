package section7_1;

public class Classrom_Student2 {
	
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();		
		s1.insertData("Fred", "Mercury");
		System.out.println(s1.name + " " + s1.lastName);
		
		Student2 s2 = new Student2("Refia", "Karanfil");
		System.out.println(s2.name + " " + s2.lastName);
		
		Student2 s3 = new Student2();
		System.out.println(s3.name + " " + s3.lastName);
	}

}
