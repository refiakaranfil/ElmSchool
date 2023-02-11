package section4_4;

public class PyramidExample {
	
	public static void main(String [] args) {
		
		// entering the outer i loop that will loop from 1 to 5, both inclusive
		for (int i = 1; i <= 5; i++) {
			// entering the inner j loop that will loop from 1 to the value of j, both inclusive
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* ");
			}
		System.out.println(); //adding a new line	
		}
	}

}
