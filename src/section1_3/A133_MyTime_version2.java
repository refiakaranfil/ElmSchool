package section1_3;
	
	public class A133_MyTime_version2 {
		
		public static void main(String [] args) {
						
			int currentTime=12;
			int currentMinute=0;
			int totalMinsInDay = 24 * 60; //1440
			int passedTimeInMins = 12*60; //720
			int remainingMins = totalMinsInDay - passedTimeInMins;
			int passedPercentage = 72000 / 1440;
			int remainingPercentage = 100-passedPercentage;
			int remainingHours= remainingMins/60;
			int remainingSeconds= remainingMins*60;
			

			System.out.println( "Current time is " +currentTime + ":"+currentMinute+"0.");
			System.out.println("There are " +remainingHours +" hours "+remainingMins+" minutes or "+ remainingMins +" minutes or "+remainingSeconds + " seconds left until the end of the day." );
			System.out.println("%" +passedPercentage +" of the day has already passed.");
			System.out.println("You have "+ remainingPercentage +"% of the day remaining.");	    		
				    		
		}

}
