package section4_3;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your word: ");
		
		String str = input.nextLine();
		
		int index = 0;
		
		while (index < str.length()) {
			
			System.out.println(str.charAt(index));
			
			index++;
		}
		
	//	System.out.println(str.charAt(0));
	//	System.out.println(str.charAt(1));
	//	System.out.println(str.charAt(2));
	//	System.out.println(str.charAt(3));
	}

}
