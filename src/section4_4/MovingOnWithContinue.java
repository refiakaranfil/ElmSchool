package section4_4;

import java.util.Scanner;

/*
 * We are asked to write a program that 'll
 * ask the user for the range and
 * print all odd numbers.
 * We are asked to use 'continue'
 * in order to skip even numbers.
 * Eg. given 1 and 5, print 1,3,5
 */
public class MovingOnWithContinue {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the first number: ");
		int start = input.nextInt(); //1
		
		System.out.println("Please input the second number: ");
		int end = input.nextInt(); //5
		
		for (int i = start; i < end; i++) {
			
			if ( i % 2 == 0 ) {
				continue; //skip
			}
			
			System.out.println("Current value: " + i);
			
			
		}
	}

}
