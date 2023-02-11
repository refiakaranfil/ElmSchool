package section4_1;

import java.util.Scanner;

public class WarmUp2 {
	
	public static void main(String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int number = scan.nextInt();
		
		int total = 0;
		int counter = 1;
		
		while (counter <= number) {
			total += counter;
			counter ++;
		}
			
			System.out.println("Total: " + total);
					
					
		}
	}

