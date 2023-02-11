package section6_2;

public class Starts_EndsWithExample {
	
	public static void main(String[] args) {  
        String str = "UMSEducation";  
        
        System.out.println( str.startsWith( "UMS" ) ); 
        System.out.println( str.startsWith( "Education" ) ); 
        System.out.println( str.startsWith("Education", 3) );
        
        
        
        
        String s1 = "Java4SDETs by UMSEducation";  

        System.out.println( s1.endsWith( "t" ) );  
        System.out.println( s1.endsWith( "Education" ) );  
        
        
        
        
        
        String st = "Welcome to UMSEducation";  

        if (st.endsWith("Education")) {  
            System.out.println("Educational institution");  
        } else {
            System.out.println("Non-educational institution");
    }
}
}	
