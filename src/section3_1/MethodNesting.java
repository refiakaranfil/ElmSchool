package section3_1;

public class MethodNesting {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		if (x > 0) {                                
		    System.out.println("x is positive");
		} else {
		    if (x == 0) {
		        System.out.println("x is zero");
		    } else {
		        System.out.println("x is negative");
		    }
		}
	}

}
