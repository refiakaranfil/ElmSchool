package section2_1;

import java.util.Scanner;

public class FindEach {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
        System.out.print("Please enter any 3 digits number: ");
		
		int number = scan.nextInt();
		
		int hundreds = number/100;
		
		int tens = (number - hundreds*100)/10;
		
		int ones = number - hundreds*100 - tens*10;
		
		
		System.out.print("There are " + hundreds +" hundreds " + tens + " tens and " + ones + " ones.");
		
		
	}

}
