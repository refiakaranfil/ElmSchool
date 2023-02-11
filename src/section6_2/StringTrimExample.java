package section6_2;

public class StringTrimExample {
	
	public static void main(String args[]){  
        String s1 = "  hello there   ";  
        
        System.out.println( s1 + "UMSEducation");
        System.out.println( s1.trim() + "UMSEducation");
        
        
        
        
        String s2 ="  hello Java String   ";  

        System.out.println( s2.length() );  
        System.out.println( s2 );   

        String tr = s2.trim();  
        System.out.println( tr.length() );  
        System.out.println( tr ); 
    }

}
