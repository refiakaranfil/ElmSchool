package section6_2;

public class CharAtExample2 {
	
	public static void main(String[] args) {  
        String str = "Welcome to UMSEducation portal";  

        int count = 0;  
        for (int i = 0; i < str.length(); i++) {  

            if(str.charAt(i) == 't') {                  // if char at the current index is equal to 't'
                count++;  
            }  

        }  

        System.out.println("Frequency of t is: "+count);  
    }  

}
