package section4_4;

public class NestedForExample {
	
	public static void main (String[] args) {
		
		// loop of i, the OUTER loop
        // loops for all values of i from 1 to 3
		for ( int i = 1; i <= 3; i++) {
			
			// loop of j, the INNER loop  
            // loops for all values of j from 1 to 3
			for ( int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			} //end of i
		} //end of j
	}

}
