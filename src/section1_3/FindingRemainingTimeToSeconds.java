package section1_3;

public class FindingRemainingTimeToSeconds {
	
public static void main(String[] args) {
		
		
		
		int currentHour = 19;
		
		int currentMinute = 10;
		
		int currentSecond = 45;
		
		
		int totalSecondsInADay = 24 * 3600;
		
		int totalSecondsPassed = (currentHour * 3600) + (currentMinute * 60) + (currentSecond);
		
		int remainingSeconds = totalSecondsInADay - totalSecondsPassed;
		
		
		int remainingHours = remainingSeconds / 3600;
		
		  //int remainingSeconds = remainingSeconds - (remainingHours * 3600);
		
		remainingSeconds = remainingSeconds % 3600;
		
		int remainingMinutes = remainingSeconds / 60;
		
		remainingSeconds = remainingSeconds - (remainingMinutes * 60);
		
		System.out.println( remainingHours + ":" + remainingMinutes + ":" + remainingSeconds);
		
		
		
		
	}


}
