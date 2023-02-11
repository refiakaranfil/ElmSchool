package section6_2;

public class EqualsIgnoreCaseExample {
	
	public static void main(String[] args) {  
        String str1 = "john doe";  

        String[] names = new String[4];
        names[0] = "Jane Doe";
        names[1] = "John Smith";
        names[2] = "John Doe";
        names[3] = "Alan Turing";

        for (String name : names) {  
            
            if ( name.equalsIgnoreCase( str1 ) ) {  
                System.out.println(str1 + " is present");  
            }  

        }  
    }  

}
