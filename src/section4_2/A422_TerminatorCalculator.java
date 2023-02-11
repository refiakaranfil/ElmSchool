package section4_2;

import java.util.Scanner;

public class A422_TerminatorCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		char respond;
		
		do {			
			System.out.print("Input number 1: ");
			
			int num1 =input.nextInt();
			
			System.out.print("Input number 2: ");
			
			int num2 =input.nextInt();
			
			System.out.println("The total is: " + (num1 + num2));
			
			System.out.print("Do you wish to continue (Y/N):");
			
			respond = input.next().charAt(0);
			
						
		}while (respond =='Y');
		
				System.out.println("The calculator is terminated.");
	
	}
}

