package section4_1;

public class WarmUp {
	
	public static void main(String[] args ) {
		
		System.out.println(factorial(3));
		/**
		 * This method calculates factorial for given number
		 * @param num
		 * @return
		 */	
	}

	public static int factorial(int num) {
		
		int counter = 1;
		int total = 1;
				//2        3
		while (counter <= num) {
			//6
			total *= counter;  //total = total * counter
			
			counter++;
		}
		
		
		return total;
	}
}