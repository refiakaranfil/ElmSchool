package section2_2;

import java.util.Scanner;

public class A224_MaximusMinimus2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Please input the second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Please input the third number: ");
		int num3 = input.nextInt();
		
		int max = Math.max(num3,Math.max(num1, num2));
		System.out.println("The bigger number is: " + max );
		
		int min = Math.min(num3,Math.min(num1, num2));
		System.out.print("The smaller number is: " + min );

		
	}
}
