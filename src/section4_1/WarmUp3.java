package section4_1;

import java.util.Scanner;

public class WarmUp3 {
	
	public static void main(String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int number = scan.nextInt();
		
		int counter = 1;
		
		while (counter <= number) {
			System.out.print("*");
			counter ++;
	}

	}
}
