package section4_3;

import java.util.Scanner;

/**
 * Countdown Timer
	You'll be given time in minutes and seconds.
	Create a program that will start counting down
	from the given minutes and seconds until there is no time left,
	and shows how much time left after each second passes.
	When the program reaches to the end, it'll print
	"Time is up!"
	
		Ex. given 10 seconds, the program will display
			9 seconds
			8 seconds
			7 seconds
			6 seconds
			5 seconds
			4 seconds
			3 seconds
			2 seconds
			1 second
			Time is up!
 */

public class CountdownTimer {
	
	public static void main(String [] args) {
				
				countdown();				
			}	
			
			/**
			 * This method is going to convert the total time
			 * from seconds to minutes and seconds.
			 */
			public static String finalMessage(int timeInSeconds){
				int totalTimeLeft = timeInSeconds;
				int minutesLeft = totalTimeLeft / 60;
				int secondsLeft = totalTimeLeft % 60;


				String finalMessage = "";
				
				if (minutesLeft > 0) {
					finalMessage = minutesLeft + " minutes and " + secondsLeft + " seconds";
				} else {
					finalMessage = secondsLeft + " seconds";
				}
				
				return finalMessage;
			}
			
			/**
			 * This method will internally call the
			 * inputAndConvert() and use its return as a starting point
			 * for our countdown. Then the method will reduce the starting point
			 * by one until it reaches zero.
			 */
			public static void countdown() {
				// starting point -> user input time
				int userInputTime = inputAndConvert();
				userInputTime = userInputTime - 1;
				
				// ending point -> user input time becomes 0 (zero)
				while (userInputTime > 0) {
								
					// execution body -> show the time left
					System.out.println( finalMessage( userInputTime ) );
					
					// update statement -> reduce the starting point by 1 every second
					userInputTime = userInputTime - 1;
					
					// just accept the following line of code AS-IS
					// we will talk about it later, but at this stage
					// all you need to know is that this line
					// will make your program wait 1 second
					try { Thread.sleep(1 * 1000); } catch(Exception e) {}
				}
				
				System.out.println("Time is up!");
			}
			
			
			/**
			 * When invoked, this method will ask user for 
			 * input in minutes and seconds, 
			 * and then will convert it all to seconds.
			 */
			public static int inputAndConvert() {
				// step 1: create Scanner object to accept user input
				Scanner input = new Scanner(System.in);
				System.out.println("Please input the number of minutes: ");
				int minutes = input.nextInt();
				
				System.out.println("Please input the number of seconds: ");
				int seconds = input.nextInt();
				
				// step 2: bring the user input to the same level
				// 		since we'll be given minutes and seconds
				// 		we can bring all to be seconds
				int totalTime = minutes * 60 + seconds;


				return totalTime;
		
				
				/** This was a great practice to demonstrate how you can break your code into small pieces, encapsulate it within method blocks and then easily use those methods in other parts of your code to make your own life easier.
					At the same time, we saw loops (in particular the while loop) in action: we reminded ourselves that each loop should have:
					a beginning point
					an ending point
					an update statement that will get us from the beginning to the ending,
					and an execution statement - what will we do during each iteration.
					
					
					AT HOME: Please consider the following as a practice:
					update the while loop in our version of the Countdown to for loop
					update the lines of code where you see redundancy (for example, we've said variable = variable - value - use shorthand operators or unary operators instead)
					remove 's' from the end of 'minutes' and 'seconds' where the remaining value is '1' (for example, 1 seconds should be 1 second)
					consider a complete rewrite of the program the way you wan to see it, and have fun!
				 * 
				 */
	}

}
