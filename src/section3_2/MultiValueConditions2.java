package section3_2;

public class MultiValueConditions2 {


	public static void main(String[] args) {
		
		int monthNumber = 3;
		String calenderName = "";

		switch (monthNumber) {
		case 1: calenderName = "January"; break;
		case 2: calenderName = "February"; break;
		case 3: calenderName = "March"; break;
		case 4: calenderName = "April"; break;
		case 5: calenderName = "May"; break;
		case 6: calenderName = "June"; break;
		case 7: calenderName = "July"; break;
		case 8: calenderName = "August"; break;
		case 9: calenderName = "September"; break;
		case 10: calenderName = "October"; break;
		case 11: calenderName = "November"; break;
		case 12: calenderName = "December"; break;
		default: calenderName = "Wrong Number"; break;
		}
		System.out.println("Calender name is: " + calenderName);
	}

}
