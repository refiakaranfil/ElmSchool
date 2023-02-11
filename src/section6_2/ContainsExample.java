package section6_2;

public class ContainsExample {
	
	public static void main(String[] args) {  
        String name = "UMSEducation course Java4SDETs";  

        System.out.println( name.contains("UMS") );  
        System.out.println( name.contains("education") );  
        System.out.println( name.contains("Course") );
        
        
        String str = "UMSEducation course Java4SDETs";        

        if ( str.contains("course") && str.contains("Java") ) {  
            System.out.println("This is a Java course.");  
        } else { 
            System.out.println("This is not a Java course.");       
        }
    }  

}
