package section4_2;

import java.util.Scanner;

public class DoWhileIntro {
	
	public static void main(String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		int total = 0;
		boolean addMore = false;
		
		do {
			System.out.println("Please enter the number to add: ");
			total += scan.nextInt();
			
			System.out.println("Do you want to add more number? Please say Y or N: ");
			addMore = (scan.next().charAt(0) == 'Y');
			
		} while (addMore);
		System.out.println("Total is: " + total);		
		}
	}
