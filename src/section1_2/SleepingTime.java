package section1_2;

public class SleepingTime {
	
	public static void main(String[] args) {
		
		int dailySleepingTime = 8;
		
		int yearBorn = 1993;
		
		int monthBorn = 6;
		
		int dayBorn = 15;
		
		int currentYear = 2022;
		
		int currentMonth = 12;
		
		int currentDay = 15;
		
		int livedYear = currentYear - yearBorn;
		
		int livedMonth = (currentMonth - monthBorn) + livedYear * 12;
		
		int livedDay = (currentDay - dayBorn) + livedMonth * 30;
		
		int sleepHours = dailySleepingTime * livedDay;
		
		
		
		System.out.println(sleepHours);
	}

}
