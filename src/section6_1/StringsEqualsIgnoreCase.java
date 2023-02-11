package section6_1;

public class StringsEqualsIgnoreCase {
	
	public static void main(String[] args) {
		
		String s1 = "ELM";  
        String s2 = "elm";  
  
        System.out.println( s1.equals( s2 ) );           // check if s1 is equal to s2  
        System.out.println( s1.equalsIgnoreCase( s2 ) ); // check if s1 is equal to s2, but 
                                                         //     don't check if the cases match
    }  
}