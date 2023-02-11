package section2_1;

import java.util.Scanner;

public class A212_MyTime_version4 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your starting time(HHMM format): ");
		
		int starttime = scan.nextInt();
		
		int starthour = starttime / 100;
		int startminute = starttime % 100;
		
		System.out.println("You started working at " + starthour + ":" + startminute);
		
		System.out.print("Please enter your current time(HHMM format): ");
		
		int currenttime = scan.nextInt();
		
		int currenthour = currenttime / 100; 
		int currentminute = currenttime % 100;
		
		System.out.println("Your current time is " + currenthour + ":" + currentminute);
		
		int workhour = (currenttime - starttime) / 100;
		int workminute = ((currenthour * 60 + currentminute) - (starthour *60 + startminute)) % 60;
		
		System.out.println("Your total working time is: " + workhour + ":" + workminute);
		
		
	
}
}
