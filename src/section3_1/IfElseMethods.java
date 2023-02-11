package section3_1;

public class IfElseMethods {
	
	public static void main(String[] args) {
		
		leapYearOrNot(2016);
		
	}

	
	public static void leapYearOrNot(int year) {
		
		
		boolean isLeap = (year % 4 == 0);
		
			System.out.println("Is it leap year?\n" + isLeap);
		

	}
	
	}