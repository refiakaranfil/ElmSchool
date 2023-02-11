package section3_1;

import java.util.Scanner;

public class A312_GuessTimator {
	
	public static void main(String[] args) {
		
		letsPlay();
	}

	public static void letsPlay() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number between 0 and 10: ");
		
		int guessnumber = scan.nextInt();
		
		checker(guessnumber);
	}
	
	public static void checker(int guessnumber) {
		
		int secretnumber = 5;
		
		if (guessnumber == secretnumber) {
			System.out.println("Congratulations! You guessed the right number!");
			System.out.println("The secret number is: " + secretnumber);
			
		} else if (guessnumber < secretnumber) {
			System.out.println("I'm sorry. Your guess is wrong and it is lower than the secret number.");
			System.out.println("The secret number is: " + secretnumber);
			
		} else if (guessnumber > secretnumber) {
			System.out.println("I'm sorry. Your guess is wrong and it is greater than the secret number.");
			System.out.println("The secret number is: " + secretnumber);
		}
		
	}
}
