package section4_3;

public class A432_MyMath {
	
	public static void main(String[] args) {
		
		sumAll(1,3);
		sumEven(1,5);
		sumOdd(1,5);
		multiplicationTable(5);
	}
		
		public static void sumAll( int num1, int num2) {
			
			int sum = 0;					
			for ( ; num1 <= num2 ; num1++ ) {
						
				sum = sum + num1;							
			}
			System.out.println("Sum = " + sum);
		}
		
		public static void sumEven(int num1, int num2) {
			
			int sum = 0;
			for (; num1 <= num2 ; num1++ ) {
				if (num1 % 2 == 0) {
					sum = sum + num1;
				} else {
					sum = sum + 0;
				}			
			}
			System.out.println("Sum = " + sum);
		}
		
		public static void sumOdd (int num1, int num2) {
			
			int sum = 0;
			for (; num1 <= num2 ; num1++) {
				if (!(num1 % 2 == 0)) {
					sum = sum + num1;
				} else {
					sum = sum + 0;
				}			
			}
			System.out.println("Sum = " + sum);
				
		} 
		
		public static void multiplicationLine(int number, int columns) {
			
			int multiplier = 1;
			
			for ( multiplier = 1 ; multiplier <= 10 ; multiplier++ ) {
				
				int result = number * multiplier;
				
				System.out.print(result + " ");
			}
			
			System.out.println();
		}
		
		public static void multiplicationTable(int rows) {
			
			int multiplier = 1;
			for (; multiplier <= rows ; multiplier++ ) {
			    multiplicationLine( multiplier, rows );
			    
		}

}
}
