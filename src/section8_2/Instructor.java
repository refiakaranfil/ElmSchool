package section8_2;

public class Instructor {
	
		public String name;
	    protected String specialty;
	    static String school;                  

	    public Instructor() {
	        createAutomatedInstructorCredentials();
	    }

	    public Instructor(String name) {
	        this.name = name;
	    }

	    public Instructor(String name, String specialty) {
	        this(name);          
	        this.specialty = specialty; 
	    }

	    public Instructor(String name, String specialty, String school) {
	        this(name, specialty);
	        this.school = school;
	        printFields( this );
	    }

	    public static void print() {
	        System.out.println("Printing from within the static print method of Instructor class");
	    }
	    
	    public static void printFields(Instructor instructor) {
	        System.out.println( instructor.name );       // printing out instructor's name
	        System.out.println( instructor.specialty );  // printing out instructor's specialty
	        System.out.println( instructor.school );     // printing out instructor's school
	    }
	    
	    public Instructor createAutomatedInstructorCredentials() {
	        this.name = "AUTO-101";
	        this.specialty = "Automated System";
	        this.school = "UMS Education";
	        
	        return this;
	    }
	    
	    public String getName() {
            return name;
	    }
	
	    public void setName(String name) {
	            this.name = name;
	    }
	
	    public String getSpecialty() {
	            return specialty;
	    }
	
	    public void setSpecialty(String specialty) {
	            this.specialty = specialty;
	    }
	
	    public static String getSchool() {
	        return school;
	    }
	
	    public static void setSchool(String school) {
	        Instructor.school = school;
	    }

}
