package section1_2;

public class CodeofLife {
	
	public static void main(String[] args) {

	////15 June 1993 How many days/hours/minutes/seconds Lived? ////


	int yearBorn = 1993;

	int monthBorn =6;

	int dayBorn =15;

	int currentYear= 2022;

	int currentMonth=12;

	int currentDay= 15;


	int yearLived = currentYear - yearBorn ;

	int monthLived = 12* yearLived + (currentMonth - monthBorn);

	int dayLived = 30* monthLived + (currentDay - dayBorn);

	int hoursLived = dayLived* 24 ;

	int minutesLived= hoursLived* 60;

	int secondsLived= minutesLived *60;

	int moneySpend= dayLived*20;

	System.out.println(yearLived +" years");

	System.out.println(monthLived +" months");

	System.out.println(dayLived +" Days");

	System.out.println(hoursLived+" Hours");

	System.out.println(minutesLived +" Minutes ");

	System.out.println(secondsLived +" Seconds");

	System.out.println(moneySpend +" Dollars Spend on Foods");
		
	}

}
