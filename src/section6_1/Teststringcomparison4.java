package section6_1;

public class Teststringcomparison4 {
	
	public static void main(String[] args) {
		
		String s1 = "b";  
        String s2 = "a";  
        String s3 = "d";  

        System.out.println( s1.compareTo( s2 ) );  // both Strings are the same, s1.equals(s2) returns 'true'  
        System.out.println( s1.compareTo( s3 ) );  // 'ELM' comes before 'School' when compared lexicographically  
        System.out.println( s3.compareTo( s1 ) );  // 'School' comes after 'ELM' when compared lexicographically
	}

}
