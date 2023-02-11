package section8_2;

public class Classroom {
	
	public static void main(String[] args) {
		
        Instructor instructor = new Instructor("John Doe", "Collections in Java", "Java4SDETs by UMS Education");
        
        Instructor.printFields(instructor);
    }

}
