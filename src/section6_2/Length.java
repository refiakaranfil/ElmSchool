package section6_2;

public class Length {
	
	public static void main(String[] args) {
		
		String company = "UMS";                        
		int length = company.length();      

		System.out.println( length );
		
		String department = "Education";
		System.out.println(department.length());
		
		String str = "UMSEducation";  
        
			if (str.length() > 0) {  
				System.out.println("String is not empty and length is: " + str.length() );  
			} 
 
			str = "";  
  
			if (str.length() == 0) {  
				System.out.println("String is empty now: " + str.length() );  
			}  
	}

}
