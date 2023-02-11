package section4_1;

import java.util.Scanner;

public class A414_FooBar {
	
	public static void main(String[] args) {
			
		int num; // This will be the user input.		
		int count = 0; //This will be the beginning number that needs to increase up to the input number.
		
		Scanner input = new Scanner(System.in);
			System.out.print("Please Enter a number: " );
			num = input.nextInt(); // User will input the number of he/she chooses.
				
			while ( count >= 0 && count < num ) { // count will start from 0 and increase until it reaches the input number				
				count++;				
			if (count%5==0 && count%3==0) { // while the number increases up to the input number, if it can be divisible by 5 and 3 it will print FooBar.				
				System.out.println("FooBar");				
			} else if (count%5==0) { // while the number increases up to the input number, if it can be divisible by only 5, it will print Bar. 
				System.out.println("Bar");				
			} else if (count%3==0) { // while the number increases up to the input number, if it can be divisible by only 3, it will print Foo.				
				System.out.println("Foo");				
			} else { // while the number increases up to the input number, if it can neither divisible by 5 nor 3 it will print the increasing number as it increases.				
				System.out.println(count);
		    }
		}
	}
}