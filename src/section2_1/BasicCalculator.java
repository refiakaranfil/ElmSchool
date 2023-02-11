package section2_1;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String [] args) {
		
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// declare variables that we will assign values from the Scanner
		int number1;
		int number2;
		
		// ask the user to type a number
		System.out.print("Please type a number: ");
		
		// store this number in 'number1' (assign user input to 'number1')
		// we do this by calling the 'nextInt()' method from the Scanner class
		number1 = input.nextInt();
		
		// verify the user's input by printing to the console the number s/he input
		System.out.println("The first number you entered is: " + number1);
		
		// ask the user to type another number
		System.out.print("Please type another number: ");
		
		// store this number in 'number2' (assign user input to 'number2')
		number2 = input.nextInt();
		
		// verify the user's input by printing to the console the number s/he input
		System.out.println("The second number you entered is: " + number2);
		
		// add the numbers and assign the sum to result
		int result = number1 + number2;

		// print out the result of these two numbers when we add them
		System.out.println("The result of these two numbers added is: " + result);


		// subtract the number2 from the number 1 and re-assign it to result
		result = number1 - number2;

		// print out the result of these two numbers when we subtract them
		System.out.println("The result of these two numbers subtracted is: " + result);
		
		
	}

}
