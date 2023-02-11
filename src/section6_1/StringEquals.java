package section6_1;

public class StringEquals {
	
	public static void main(String[] args) {
		 
	        String s1 = "ELM";  
	        String s2 = "ELM";  
	        String s3 = new String("ELM");  
	        String s4 = "School";  
	        
	        System.out.println( s1.equals( s2 ) ); // check if s1 is equal to s2
	        System.out.println( s1.equals( s3 ) ); // check if s1 is equal to s3
	        System.out.println( s1.equals( s4 ) ); // check if s1 is equal to s4
	    }  
	}