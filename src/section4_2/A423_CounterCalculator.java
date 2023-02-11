package section4_2;

import java.util.Scanner;

public class A423_CounterCalculator {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		char answer;
		
		do {
			System.out.print("Please input a number: ");
			
			int number = input.nextInt();
			
				if (number > 0) {
					positive +=1;
				} else if (number < 0) {
					negative +=1;
				} else {
					zero +=1;
				}			
			System.out.print("Do you wish to continue (Y/N): ");
			
			answer = input.next().charAt(0);
						
		} while (answer == 'Y' || answer == 'y');
		
		System.out.println("Positive numbers entered: " + positive);
		
		System.out.println("Negative numbers entered: " + negative);
		
		System.out.println("Zeros entered: " + zero);
		
	}

}



