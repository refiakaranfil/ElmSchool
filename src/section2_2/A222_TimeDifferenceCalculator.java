package section2_2;

import java.util.Scanner;

public class A222_TimeDifferenceCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the time zone of city A in GMT: ");		
		int A = scan.nextInt();
		
		System.out.print("What is the time zone of city B in GMT: ");
		int B = scan.nextInt();
		
		int result = Math.abs(A - B);
		System.out.print("The time difference between city A and B is " + result + " hours.");
		
		
		
	}

}
