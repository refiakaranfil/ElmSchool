package section3_1;

import java.util.Scanner;

public class SmartScanner2 {
	
	public static void main(String[] args) {
	
	smartScan();
}
	public static void smartScan() {
		
		double userInput;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a floating point number: ");
		
		if ( !input.hasNextDouble() ) {
			String userIncorrectInput = input.next();
			System.out.println("The value you entered [" + userIncorrectInput + "] is not a floating point number.");
			return;
		}
		
		userInput = input.nextDouble();
		System.out.println(userInput + " is a valid floating point number.");
	}
	
	
	
	
	
}