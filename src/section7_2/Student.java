package section7_2;

public class Student {
	
	int id;
    String name;
    static String school = "UMS Education";
    
    // Rule 3: constructors do NOT have a return type, and it can NOT be defined
    // Constructors always return an object of the class it belongs to. 
    // And since they always do the same thing, there is no need to define what it returns.
    public Student() {  // Rule 2: constructor name must be the same as the class name
    	
    }
    
    //Java does NOT provide you with a default constructor 
    // when you have defined your own constructor, 
    // you should define the default constructor EXPLICITLY if you know you will need it.
    public Student(int studentID, String studentName) {    // a parameterized constructor
        id = studentID;									   // Rule 1: If you have declared a constructor with parameters, 
        name = studentName;								   // Java compiler will NOT create a default constructor for you any more.       
    }
    
    // Methods should define some kind of a return type or 
    // they should specify that they are not going to return anything (void)
    void printStudent() {
        System.out.println(id + " " + name + " " + school);
    }
    
    static void read() {
    	System.out.println("A student is reading");
    }

}
