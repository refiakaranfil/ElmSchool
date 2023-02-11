package section7_1;

public class TestStudent1 {
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.insertRecord(309, "John");
		s2.insertRecord(336, "Jane");
		
		s1.displayInformation();
		s2.displayInformation();
	}

}
