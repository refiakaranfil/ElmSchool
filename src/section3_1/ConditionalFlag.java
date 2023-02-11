package section3_1;

public class ConditionalFlag {
	
	public static void main(String[] args) {
		
		int x = -30;
		
		boolean isEven = (x % 2 == 0);

		if (isEven) {
		    System.out.println("x is an even number");
		} else {
		    System.out.println("x is an odd number");
		}
	}

}
