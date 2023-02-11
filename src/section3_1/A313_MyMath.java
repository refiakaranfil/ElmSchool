package section3_1;

import java.util.Scanner;

public class A313_MyMath {
	
	public static void main(String[] args) {
		
		obviousNumbers();
		divider();
		evenOrOdd();
		
	}
	
	public static void obviousNumbers() {
		
		double num;
		Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
		num= input.nextDouble();
			if ( num == 0 ) {
				System.out.print( num + " is zero ");
			} else if (num < 0 && Math.abs(num) < 1) {
				System.out.print( num + " is negative small ");
			} else if (num > 0 && Math.abs(num) < 1) {
				System.out.print( num + " is positive small ");
			} else if (num < 0 && Math.abs(num) > 1000000) {
				System.out.print( num + " is negative large ");
			} else if (num > 0 && Math.abs(num) > 1000000) {
				System.out.print( num + " is positive large ");
			} else if (num < 0 && Math.abs(num) > 1 && Math.abs(num) < 1000000) {
				System.out.print( num + " is negative");
			} else if (num > 0 && Math.abs(num) > 1 && Math.abs(num) < 1000000) {
				System.out.println( num + " is positive");
			}
		}
	
	public static void divider() {
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
			System.out.print("Please Enter a Number: ");
		num1= input.nextInt();
			System.out.print("Please Enter Another Number: ");
		num2= input.nextInt();
			if (num2 == 0) {
				System.out.println("Division by 0 is NOT Allowed.");
			} else {
				System.out.println(num1 + " divided by " + num2 + " is equal to " + num1/num2);
			}
	}
	
	public static void evenOrOdd() {
		int num;
		Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
		num= input.nextInt();
			if (num == 0) {
				System.out.println(num +" is Zero");
			} else if (num % 2 == 0) {
				System.out.println(num +" is Even");
			} else {
				System.out.println(num +" is Odd");
			}

}
}