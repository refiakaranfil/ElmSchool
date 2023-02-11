package section8_4;

public class F_Classroom {
	
	public static void main(String[] args) {
		
        F_Address address = new F_Address(2917, " Muir Field", "Madison", "WI", "53719");
        
    //    System.out.println( address.toString() );
        
        
        
        F_Faculty facultyMember = new F_Faculty("Sample Member", "UMS Education", address);
        
        System.out.println( facultyMember.toString() );
    }

}
