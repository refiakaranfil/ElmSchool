package section1_3;

public class A134_MyTIme_version3 {
	
public static void main(String [] args) {
		
		//I started working on this program at 11:40.
		//Current time is 12:00.
		//There are 12 hours 0 minutes or 720 minutes or 43200 seconds left until the end of the day.
		//50% of the day has already passed.
		//You have 50% of the day remaining.
		//I spent 0 hours and 20 minutes or 20 minutes or 1200 seconds on developing this program.
		//It took 1.39% of my time.
		
		int currentHour = 12;
		int currentMinute = 0;
		int startedTimeHour = 11;
		int startedTimeMinute = 40;
		
		System.out.println("	I started working on this program at " + startedTimeHour + ":" + startedTimeMinute + ".");
		System.out.println("	Current time is " + currentHour + ":" + currentMinute + "0");
		
		int totalMinsInDay = 24 * 60; //1440
		int passedTimeInMins = 12*60; //720
		int remainingMins = totalMinsInDay - passedTimeInMins;
		int passedPercentage = passedTimeInMins * 100 / totalMinsInDay; // 72000 / 1440;
		int remainingPercentage = 100-passedPercentage;
		int remainingHours= remainingMins/60;
		int remainingSeconds= remainingMins*60;
		int remainingMinsWithHours = remainingMins - (remainingHours * 60);
		
		System.out.println("	There are " +remainingHours +" hours "+remainingMinsWithHours+" minutes or "+ remainingMins +" minutes or "+remainingSeconds + " seconds left until the end of the day." );
		System.out.println("	%" +passedPercentage +" of the day has already passed.");
		System.out.println("	You have "+ remainingPercentage +"% of the day remaining.");
		
		int currentHourInSecond = currentHour * 3600;
		int startedTimeHourInSecond = startedTimeHour * 3600;
		int currentMinuteInSecond = currentMinute * 60;
		int startedTimeMinuteInSecond = startedTimeMinute * 60;
		
		int spentTimeInMinute = ((currentHourInSecond + currentMinuteInSecond) - (startedTimeHourInSecond + startedTimeMinuteInSecond)) / 60;
		int spentTimeInSecond = spentTimeInMinute * 60;	
		int spentTimeInHours = spentTimeInSecond / 3600;
		int spentTimeInMinsWithHours = spentTimeInMinute -  (spentTimeInHours * 60);
			
		System.out.println("	I spent " + spentTimeInHours + " hours and " + spentTimeInMinsWithHours + " minutes " + "or " + spentTimeInMinute + " minutes " + "or " + spentTimeInSecond + " seconds " + "on developing this program.");
		
		int totalSecondsInDay = 24 * 3600;
		//int spentTimeInSecond = spentTimeInMinute * 60;
		double tookTimePercentage = (double) (spentTimeInSecond * 100) / totalSecondsInDay;
		
		System.out.println("	It took	" + tookTimePercentage + "% " + "of my time.");    		
	}

}
