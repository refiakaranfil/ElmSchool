package section6_1;

public class TestImmutableString {
	
	public static void main(String args[]){  

        String s = "Welcome";       // initialize 's' to a new String object "Welcome"       
        s.concat(" home");          // concat() concatenates the new String " home" to the original        
        System.out.println( s );    // display the String object of 's'  
        
        
        
        String a = "Welcome";      // initialize 's' to a new String object "Welcome"       
        a = a.concat(" home");     // after concat(), re-assign the new value to 's'      
        System.out.println( a );   // will print 'Welcome home' because of the re-assignment

    }

}
