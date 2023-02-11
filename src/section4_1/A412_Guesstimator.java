package section4_1;

import java.util.Random;

import java.util.Scanner;

public class A412_Guesstimator {
			
		public static void main(String[] args) {
						
			Random random = new Random();
			int randomNum = random.nextInt(50);
			
			int guess = 52;
			Scanner scan = new Scanner(System.in);

			while (randomNum != guess) {
				System.out.println("Enter your guess number:");
				guess = scan.nextInt();
				
				if (guess == randomNum) {
					System.out.println("Congratulations!! YOU FOUND THE NUMBER!");
				
				}else if (guess<randomNum) {
					
						System.out.println("Try Higher Number");
				}else {						
						System.out.println("Try Lower Number");
			}	
		}			
	}			
}