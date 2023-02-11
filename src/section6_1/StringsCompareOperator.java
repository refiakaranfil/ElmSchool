package section6_1;

public class StringsCompareOperator {
	
	public static void main(String[] args) {
		
		
		
	//	  String s1 = "ELM";  
    //    String s2 = "ELM";  
    //    String s3 = new String("ELM");  
    //    String s4 = "School";  
        
    //    System.out.println( s1.equals( s2 ) ); // check if s1 is equal to s2
    //    System.out.println( s1.equals( s3 ) ); // check if s1 is equal to s3
    //    System.out.println( s1.equals( s4 ) ); // check if s1 is equal to s4
		
		String s1 = "ELM";  
        String s2 = "ELM";  
        String s3 = new String("ELM");  
        String s4 = new String("ELM");
        
        System.out.println( s1 == s2 );    // both variables refer to the same object in the String constant pool  
        System.out.println( s1 == s3 );    // s1 refers to the object inside the String pool, but 
                                           //    s3 refers to the object that is outside the String pool, it refers
                                           //    to a String object that is inside the Heap memory
        System.out.println( s3 == s4 );    // s3 and s4 refer to different objects
	}

}
