package section1_3;

public class A132_MyTime_version1 {
	
public static void main(String[] args) {
		
		int currentHour = 19;
		
		int currentMinute = 42;
		
		int hoursInDay = 24;
		
		int minutesInHour = 60;
		
		int totalMinutesInADay = hoursInDay * 60;
		
		int remainingTimeInSeconds = 258 * 60;
		
		int currentHoursConvertedToMinutes = currentHour * 60;
				
		
		
		
		int hoursLeft = 23 - currentHour;
		
		int minutesLeft = minutesInHour - currentMinute;
		
		int totalMinutesLeft = hoursLeft * 60 + minutesLeft;
				
		int totalSecondsLeft = totalMinutesLeft * 60; 
		
				System.out.println("There are " + hoursLeft + " hours and " + minutesLeft + " minutes or " + totalMinutesLeft + " minutes or " + totalSecondsLeft + " seconds left until the end of the day." );
		
				
	}

}
