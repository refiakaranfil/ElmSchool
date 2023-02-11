package section2_1;

import java.util.Scanner;

public class ScannerIntroduction {
	
	public static void main(String[] args) {
		
		//declare a Scanner object/instance
//		Scanner input;
		
		//instantiate/assign value to input object
//		input = new Scanner(System.in);
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter your name: ");
		
		String name;
		String lastname;
		
		name = input.nextLine();
		
		System.out.println("You entered " + "\"" + name + "\"" + " as name");
		
		System.out.print("Enter your last name: ");
		
		lastname = input.nextLine();
		
		System.out.println("You entered " + "\"" + lastname + "\"" + " as last name");
		
		
		
		
	}

}
