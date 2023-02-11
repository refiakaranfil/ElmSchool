package section3_4;

public class WarmUp2 {
	
	public static void main (String[] args) {
		
		fizzBuzz(5);
	}
	
	
	public static void fizzBuzz(int num) {
		
	    if (num %3==0)  {
	    	System.out.print("Fizz");
	    }
	    
	    if (num %5==0)  {
	    	System.out.println("Buzz");
	   
	    }
	}
}