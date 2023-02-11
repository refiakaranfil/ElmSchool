package section4_1;

public class IsPrime {
	
	public static void main(String[] args ) {
		
		System.out.println(isPrime(5));		
	}
	
	public static boolean isPrime(int num) {
		
		if(num == 1) {return false;}
		
		int counter = 2;
		
		  while (counter <= num/2) {
			
			if (num % counter == 0) {
				
				return false;
			}			
			counter++;
		}
		return true;
	}

}
