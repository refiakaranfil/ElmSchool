package section3_2;

public class MultiValueConditions {

public static void main(String[] args) {
		
		int monthNumber = 4;
		String calenderName = "";
		
		if(monthNumber == 1) {
			calenderName = "January";
		} else if (monthNumber == 2) {
		    calenderName = "February";
		} else if (monthNumber == 3) {
		    calenderName = "March";
		} else if (monthNumber == 4) {
		    calenderName = "April";
		} else if (monthNumber == 5) {
		    calenderName = "May";
		} else if (monthNumber == 6) {
		    calenderName = "June";
		} else if (monthNumber == 7) {
		    calenderName = "July";
		} else if (monthNumber == 8) {
		    calenderName = "August";
		} else if (monthNumber == 9) {
		    calenderName = "September";
		} else if (monthNumber == 10) {
		    calenderName = "October";
		} else if (monthNumber == 11) {
		    calenderName = "November";
		} else if (monthNumber == 12) {
		    calenderName = "December";
		} else {
		    calenderName = "Wrong Number";
		}
		
//		String formNumber = "IRS-1099";
		
//		String formPurpose;
		
//		switch (formNumber) {
//		case "IRS-1099" : formPurpose = "Submit contractor hours to IRS"; break;
//		case "W-2" : formPurpose = "Submit hourly wages"; break;
//		default: 
//		}
		
		System.out.println("Calender name is: " + calenderName);
	}

}

