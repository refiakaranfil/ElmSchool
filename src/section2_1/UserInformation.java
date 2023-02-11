package section2_1;

import java.util.Scanner;

public class UserInformation {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
							
		
		System.out.print("Your Name:");
		String name = scan.nextLine();
					
		
		System.out.print("Your Age:");
		int age = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Your Fav Color:");
		String color = scan.nextLine();

		
		System.out.print("Hi, my name is " + name + ", I am " + age + " years old, " + "and my favorite color is " + color + ".");
		
}

}
