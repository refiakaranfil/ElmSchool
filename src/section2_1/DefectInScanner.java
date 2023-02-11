package section2_1;

import java.util.Scanner;

public class DefectInScanner {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your age? "); 
		int age = in.nextInt(); 

		// adding an extra line for the Scanner to read the newline
		// no need to assign it to any variable
		// this simply tells the Scanner to 'be ready to scan the next line'
		in.nextLine();

		System.out.print("What is your name? "); 
		String name = in.nextLine(); 

		System.out.println("Hello " + name + ", age " + age);
	}

}
