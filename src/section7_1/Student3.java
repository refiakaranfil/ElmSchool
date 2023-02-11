package section7_1;

public class Student3 {
	
	int id;
    String name;
    static String school = "UMS Education";

    void printStudent() {
        System.out.println(id + " " + name + " " + school);
    }
    
    static void read() {   // do not need an object of a class to call its static method
    					   // static method is object-independent
        System.out.println("A student is reading");
      //System.out.println(name + " is reading"); // expecting to see the 'name' of the student who is reading 
        										  // Cannot make a static reference to the non-static field
    }

}
