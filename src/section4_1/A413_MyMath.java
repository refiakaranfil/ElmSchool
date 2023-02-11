package section4_1;

public class A413_MyMath {
	
	public static void main(String[] args) {
		
		sumAll(3,8);
		sumEven(3,8);
		sumOdd(-1,5);
	}
	
	public static void sumAll( int num1, int num2) {
				
			int sum = 0;
			while (num1 <= num2) {
						
				sum = sum + num1;
				
				num1++;
			}
			System.out.println("Sum = " + sum);
		}
	
	public static void sumEven(int num1, int num2) {
		
		int sum = 0;
		while (num1 <= num2) {
			if (num1 % 2 == 0) {
				sum = sum + num1;
			} else {
				sum = sum + 0;
			}			
			num1++;
		}
		System.out.println("Sum = " + sum);
	}
	
    public static void sumOdd(int num1, int num2) {
		
		int sum = 0;
		while (num1 <= num2) {
			if (!(num1 % 2 == 0)) {
				sum = sum + num1;
			} else {
				sum = sum + 0;
			}			
			num1++;
		}
		System.out.println("Sum = " + sum);
			
	} 
}


