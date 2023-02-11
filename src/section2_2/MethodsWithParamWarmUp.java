package section2_2;

public class MethodsWithParamWarmUp {
	
	public static void main(String[] args) {
		
		coinMachine(150);
	}

	
	public static void methodWithParam(int num) {
		
		int remainder = num % 10;
		System.out.println(remainder);
	}
	
	public static void coinMachine(double cents) {
				
		int total = (int)cents;
		
		int quarters = total / 25; // 5
		total = total % 25; // total - quarters * 25 = 15
		
		int dimes = total / 10; //1
		total = total % 10;
		
		int nickels = total / 5;
		total = total % 5;
		
		int pennies = total;
		
		System.out.println("We have " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");
	}
}
