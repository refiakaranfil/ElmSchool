package section2_1;

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter your first number:");
		
		 num1 = scan.nextInt();
		
		System.out.print("Enter your second number:");
		 num2 = scan.nextInt();
		 
		 int result = num1* num2;
		 
		 System.out.println("Multiplied of  numbers will be:" +" " +result);
		
		
		
		
		
	}

}
