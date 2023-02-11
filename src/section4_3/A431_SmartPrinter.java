package section4_3;

import java.util.Scanner;

public class A431_SmartPrinter {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your number: ");
		
		int number = input.nextInt();
		
		if ( number == 0 || number < 0) {
			
			System.out.println("This is an invalid entry.");			
		} else {
		
		for (int i = 1 ; i <= number ; i++) {
						
			System.out.println(i);
			
		}
	}

}
}
