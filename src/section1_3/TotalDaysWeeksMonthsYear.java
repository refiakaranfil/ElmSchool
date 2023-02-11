package section1_3;

public class TotalDaysWeeksMonthsYear {
	
public static void main(String[] args) {
		
		int totalDays= 439;

		int year = totalDays/365;

		int months = (totalDays - year*365) / 30;

		int weeks = (totalDays - year*365 -months*30) / 7;

		int days = (totalDays - year*365 - months*30 - weeks*7);

		System.out.println(year + " year " + months + " months " + weeks + " weeks " + days + " days");
			
	}

}
