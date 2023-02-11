package section7_4;

public class PrimiVars {
	
	public static void main(String[] args) {
		
        int year = 2022;
        double gpa = 3.87;
        char grade = 'A';
        
        System.out.println("For the academic year ending in: " + year);
        System.out.println("The GPA for the student is: " + gpa);
        System.out.println("The latest exam result is: " + grade);
        
        String correctedYearMessage = "For the academic year ending in 2023";
        
        // utilize substring to pull the year value from the original String above
        String yearValue = correctedYearMessage.substring(correctedYearMessage.length() - 4);
        
        // convert the yearValue from String to Integer and store it in 'year' variable
        year = Integer.valueOf(yearValue);
        
        System.out.println("The academic year is corrected in the records!");
        System.out.println("For the academic year ending in: " + year);
}

}
