package section3_4;

public class FlagMethodsDemo {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		if (isPositive(num)) {
			System.out.println("Number is positive");
		} else { 
			System.out.println("Number is NOT positive");
		}
	}

			public static boolean isPositive (int num) {
				
				boolean result = false;
				
				result = (num > 0);
				
				return result;
				
				
		}
	}

