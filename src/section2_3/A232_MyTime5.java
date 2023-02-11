package section2_3;

import java.util.Scanner;

public class A232_MyTime5 {
	
		
		public static void main(String [] args) {
		
			startTheMagic();
		}
		
		public static void startTheMagic() {
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("What time do you started working :");
				
				int startTime = scan.nextInt();
				
		        System.out.print("What is your current time :");
				
				int currentTime = scan.nextInt();
			
			calculateAndPrint(startTime,currentTime);
			
			}
			
			public static void calculateAndPrint(int startTime, int currentTime) {
				
				int result = currentTime - startTime;
				
				System.out.println("Your working time is : " + result);
				
			}
			
	}
