package section3_1;

import java.util.Scanner;

public class A314_LeapYearCalculator {
	
	public static void main(String[] args) {
		LeapOrNot();
	}
	
	public static void LeapOrNot() {
		int year;
		Scanner input = new Scanner(System.in);
			System.out.print("Please Enter a Number: ");
			if ( ! input.hasNextInt() ) {
		String wrongInput = input.next();
			System.out.println(wrongInput + " is NOT a Year");
			return;
		}
		year= input.nextInt();
			if (year < 0) {
				System.out.println("Year Cannot be Negative");
			} else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println(year + " is a leap year.");
			} else {
				System.out.println(year + " is NOT a leap year.");
			}
	}
}
