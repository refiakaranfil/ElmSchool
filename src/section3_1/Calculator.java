package section3_1;

public class Calculator {
	
	public static void main(String[] args) {
	
		calculator(15,'-',3);
		method(5);
		
		
	}

	public static void calculator(double num1, char operator, double num2) {
		
		double result = 0; // number doesn't matter
		if(operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if (num2 == 0) {
				System.out.println("You can't divide by 0.");
				return;
			}						
			result = num1 / num2;
		}
		
		System.out.println(result);
	}
	
	public static void method (int a) {
		
		if (a < 1 || a > 7) {
			System.out.println("Not a weeekday");
			return;
		}
		System.out.println("Weekday.");
	}
}
