package section3_1;

import java.util.Scanner;

public class AddingLogicToOurCode {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the time zone of city A in GMT: ");		
		int A = scan.nextInt();
		
		System.out.print("What is the time zone of city B in GMT: ");
		int B = scan.nextInt();
		
		int result = (A - B);
		if (result < 0 ) {	
			result = result * -1;
		
		}
		System.out.print("The time difference between city A and B is " + result + " hours.");
	}

	
}
