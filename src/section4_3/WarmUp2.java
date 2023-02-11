package section4_3;

import java.util.Scanner;

public class WarmUp2 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number =  scan.nextInt();
		int reversed = 0;
		
		while (number !=0) {
			
			int remainder = number % 10; // 3
			reversed = reversed * 10 + remainder; 
			number /= 10;
			
		}
		
		System.out.println(reversed);
	}

}
