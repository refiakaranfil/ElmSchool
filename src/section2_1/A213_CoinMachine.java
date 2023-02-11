package section2_1;

import java.util.Scanner;

public class A213_CoinMachine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many pennies you have: ");
		
		int pennies = scan.nextInt();
		
		System.out.print("How many nickels you have: ");
		
		int nickels = scan.nextInt();
		
		System.out.print("How many dimes you have: ");
		
		int dimes = scan.nextInt();
		
		System.out.print("How many quarters you have: ");
		
		int quarters = scan.nextInt();
		
		
		int total = quarters * 25 + nickels * 5 + dimes * 10 + pennies;
		
		System.out.println("You have a total of " + total + " cents.");
		
		int fee = total * 10 / 100;
		
		System.out.println("The machine charges you 10%, which is " + fee + " cents.");
		
		int centsleft = total - fee;
		
		System.out.println("This leaves you with " + centsleft + " cents.");
		
		
		int dollar1 = centsleft / 100;

		int quarter = (centsleft - (dollar1 * 100)) / 25;

		int dime = (centsleft - (dollar1 * 100) - (quarter * 25)) / 10;

		int nickel = (centsleft - (dollar1 * 100) - (quarter * 25) - (dime * 10)) / 5;

		int cents = (centsleft - (dollar1 * 100) - (quarter * 25) - (dime * 10) - (nickel * 5)) / 1;


		System.out.println("This makes " + dollar1 + " dollars, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, and3 " + cents + " pennies.");
		
		
		
		
		
	}

}
