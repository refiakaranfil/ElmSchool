package section4_2;

import java.util.Scanner;

public class PasswordCheck {
	
	public static void main(String[] args) {
		
		/* Write a code which will as from user:
		 * Please enter your password
		 * User will enter his/her password
		 * If password is true it will print You've logged in
		 * Else if should ask to "Please enter your password"
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String password = "A.12345";		
		String guessPassword;
		do {
			System.out.println("Please enter your password: ");
			guessPassword = scan.nextLine();
		} while (!guessPassword.equals(password));
			System.out.println("You have logged in succesfully.");
		
	}

}
