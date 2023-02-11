package section2_1;

import java.util.Scanner;

public class ScannerExercise {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your current balance?");
		
		double balance = scan.nextDouble();
		
		System.out.print("What is your withdraw amount?");
		
		double withdraw = scan.nextDouble();
		
		System.out.print("Remaining balance :"+( balance - withdraw ));
		//int number = scan.nextInt();

}

}
