package section4_2;

import java.util.Scanner;

public class A421_CheckingForUserInput {
	
public static void main(String[] args) {
		
		positivePrime();
	}
		public static void positivePrime() {
			Scanner input = new Scanner(System.in);
			int num;
		do {
			System.out.print("Please input a Positive Integer: ");
			if ( ! input.hasNextInt() ) {
				String wrongInput = input.next();
				System.out.println(wrongInput + " is not a positive integer.");
				
			}
			num = input.nextInt();
			if (num < 0) {
				System.out.println(num + " is not a positive integer.");
			} else  if (num >3 && ( num % 2 == 0 || num % 3 == 0)){
				System.out.println(num + " is a positive integer.");
				System.out.println(num + " is not a prime integer.");
			} else {
				System.out.println(num + " is a positive integer.");
				System.out.println(num + " is a prime integer.");
				return;
			}
		} while(true);
	}
}                      //// yanlis



