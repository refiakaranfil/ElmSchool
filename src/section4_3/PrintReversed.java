package section4_3;

import java.util.Scanner;

public class PrintReversed {
	
	public static void main(String [] args) {
	
	//  hello    olleh
		
		Scanner scan = new Scanner (System.in);
		
		String str = scan.next();
		
		for (int i = str.length()-1 ; i >= 0 ; i--) {
			
			System.out.println(str.charAt(i));
			
		}

	}
}