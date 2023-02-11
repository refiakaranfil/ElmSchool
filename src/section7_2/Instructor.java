package section7_2;

public class Instructor {
	
	String name;
    String specialty;
    static String school = "UMS Education";

    public Instructor() {
    	
    	System.out.println( "We are setting up Miss Jane to be our default instructor.");
        name = "Jane Doe";
        specialty = "The greatest instructor";
        school = "School of Success";  //  static variables can be updated, NOT initialized
    }
    
    public Instructor(String instructor, String specialization) {    // parameterized constructor
        name = instructor;          // our String parameter called 'instructor' is being assigned to 'name'
        specialty = specialization; // our String parameter called 'specialization' is being assigned to 'specialty'
    }
    
    
//		Our new constructor is in conflict with our third constructor: 
//		both have the same parameters - 2 Strings. From Java's perspective, 
//		the name of parameter variables do not matter (specialization vs schoolName), 
//		their types matter. Therefore, when you will call the Instructor() in the future, 
//		Java will not know which Instructor() you are invoking, 
//		the third one or the new one, and thus Java will not allow you such overloading. 
    
//    public Instructor(String instructor, String schoolName) {    // new constructor, will NOT compile
//        name = instructor;          
//        school = schoolName; 
//    }
    
    public Instructor(String instructor, String specialization, String schoolName) {    // another parameterized constructor
        name = instructor;          
        specialty = specialization; 
        school = schoolName;
    }

}
