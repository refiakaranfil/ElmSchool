package section8_4;

public class F_Faculty {
	
	protected String name;
	private static String school;
	public F_Address address; //Faculty HAS-A Address
	
	public F_Faculty(String name, String school, F_Address address) {
		// super();
		
		this.name = name;
        this.school = school;
        this.address = address;
        
	}
        
    public String toString() {    // again the 'green triangle'???
        return "Name: " + this.name + "\n"
                        + "School: " + this.school + "\n"
                        + "Address: " + this.address.toString();
	}

}
