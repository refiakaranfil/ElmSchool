package section2_3;

import java.util.Scanner;

public class A231_MaximusMinimus {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		int num1 = input.nextInt();
		
		System.out.println("Please enter your second number: ");
		int num2 = input.nextInt();
		
		System.out.println("Please enter your third number: ");
		int num3 = input.nextInt();
		
		maximus(num1, num2, num3);
		minimus(num1, num2, num3);
		
	}

	public static void maximus(int num1, int num2, int num3) {
				
		int max = Math.max(num1, Math.max(num2, num3));
		
		System.out.println("Your biggest number is: " + max);
	
	}
	
	public static void minimus(int num1, int num2, int num3) {
		
		int min = Math.min(num1, Math.max(num2, num3));
		
		System.out.println("Your smallest number is: " + min);
	
}
}