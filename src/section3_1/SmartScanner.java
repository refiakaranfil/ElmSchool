package section3_1;

import java.util.Scanner;

public class SmartScanner {
	
	public static void main(String[] args) {
		
		smartScan();
		
	}

	public static void smartScan() {
		
		int number;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		 if ( ! input.hasNextInt() ) {
			 String wrongInput = input.next();
			 System.out.println(wrongInput + " is not a number.");
			 return;			 			 
		 }
		
		 number = input.nextInt();
		 System.out.println(number + " is a valid number.");
	}
}
