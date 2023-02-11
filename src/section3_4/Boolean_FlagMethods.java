package section3_4;

public class Boolean_FlagMethods {
	
	public static void main (String [] args) {
	
		System.out.println( isSingleDigit(2) ); 	// returns and has the println() display 'true' or 'false'
		boolean bigFlag = !isSingleDigit(17); 		// returns and assigns 'true' or 'false' to bigFlag
		                                        	// pay attention to ! that inverts the return value of the method
		System.out.println(bigFlag);
	
	}
	
	// testing (checking for) whether a given int is a single digit numeric value
	// returns 'true' if the int value is between -10 and 10
	// e.g. 9, -9, 1, 0 are single digits, but 10, -10, 12, 4343 are not
	
	public static boolean isSingleDigit(int x) {
		return (x > -10 && x < 10); // this condition can be either 'true' or 'false' which will the be returned
	}

}
