package section4_4;

import java.util.Scanner;

public class ContinueExample {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);         // instantiate a Scanner object called 'in'

		int x = -1;                                  // declare an int 'x' and assign -1 to it
		int sum = 0;                                 // declare an int 'sum' and assign 0 to it

		while (x != 0) {                             // condition to loop as long as 'x' is not equal to 0

		    x = in.nextInt();                        // read and assign the user input to 'x'

		    if (x <= 0) {                            // if 'x' is less than 0 (if 'x' is a negative int)
		        continue;                            // ignore everything else and go to the next iteration
		    }                                        
		                                             // the following is going to be executed only if continue is not executed
		    System.out.println("Adding " + x);     // print out 'Adding ' concatenated with the value of 'x'
		    sum += x;                                // add 'x' with 'sum' and re-assign it to 'sum'
		}
	}

}
