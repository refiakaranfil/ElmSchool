package section7_2;

public class Test_Instructor {
	
	public static void main(String[] args) {
        Instructor instructor = new Instructor();
        
        System.out.println( instructor.name );      // printing out instructor's name
        System.out.println( instructor.specialty ); // printing out instructor's specialty
        System.out.println( instructor.school );    // printing out instructor's school
                                                    // in this program when we invoked the 
											        // Instructor class the very first thing that 
											        // happened was the static school variable was initialized to 
											        // "UMS Education" and only after the constructor was invoked, 
											        // this value was updated to "School of Success"
        Instructor instructor2 = new Instructor("Robert Dylan", "Java Best Practices");
        
        System.out.println( instructor2.name );      // printing out instructor's name
        System.out.println( instructor2.specialty ); // printing out instructor's specialty
        System.out.println( instructor2.school );    // printing out instructor's school   
        
        
        
        Instructor instructor3 = new Instructor("Adam Smith", "IT in Construction", "Java4SDETs");
        
        System.out.println( instructor3.name );      // printing out instructor's name
        System.out.println( instructor3.specialty ); // printing out instructor's specialty
        System.out.println( instructor3.school );    // printing out instructor's school  
    }

}
