package section6_2;

public class CharAtExample {
	
	public static void main(String[] args) {
		
		String name = "UMSEducation";  

        char ch = name.charAt(3);
        System.out.println(ch); 
              
 //       char chr = name.charAt(12);
 //       System.out.println(chr);
        
        String str = "Welcome to UMSEducation portal";      
        int strLength = str.length();      

        System.out.println("Character at 0 index is: " + str.charAt( 0 ) );      
        System.out.println("Character at last index is: " + str.charAt( strLength - 1 ) );
        
        
        String strr = "Welcome to UMSEducation portal";          

        for (int i = 0; i < strr.length(); i++) {  

            if(i % 2 != 0) {          // if the current index number is NOT 'even' (aka, if it is 'odd')
                System.out.println("Char at " + i + " place " + strr.charAt( i ) );  
            }  

        }  

	}

}
