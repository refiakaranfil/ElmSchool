package section3_2;

public class SwitchWithoutBreaks {

public static void main(String[] args) {
		
		String currentDay = "Sunday";
		String typeOfDay = "";

		switch (currentDay) {
		case "Monday": 
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday": typeOfDay = "WEEKDAY"; break;
		case "Saturday":
		case "Sunday": typeOfDay = "WEEKEND"; break;
				
	}
		System.out.println(currentDay + " is " + typeOfDay + ".");

}
}
