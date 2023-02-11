package section3_1;

public class ReliationalAndLogicalOps {
	
	public static void main(String[] args) {
		
	positiveNegativeZero(-5);
	evenOrOdd(3);
	}
	
	public static void evenOrOdd (int num) {
	
		if (num > 0 && num < 101) {		
		if (num % 2 == 0) {		
			System.out.println("Number is even.");		
		} else {		
			System.out.println("Number is odd.");
		}
		} else {
			System.out.println("Number is out of the range.");
		}
		
	}	
	
		
	public static void positiveNegativeZero(int num) {
		
		if (num == 0) {
			System.out.println("zero");
		} else if  (num > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
			
		}
		
	}
	
	}
