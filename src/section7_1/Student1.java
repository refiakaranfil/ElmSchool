package section7_1;

public class Student1 {
	
	int id;
	String name;
	
	void insertRecord(int i, String s) {		
		id = i;
		name = s;
	}
	
	void displayInformation() {
		System.out.println(id + " " + name);
	}

}
