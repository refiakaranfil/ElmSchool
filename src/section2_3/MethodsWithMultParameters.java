package section2_3;

public class MethodsWithMultParameters {
	
	public static void main(String [] args ) {
		
		printThis ("Day of the week: ", 3);
		
		String month = "July ";
		int day = 31;
		printThis (month, day);
		
		char degreeAbbr = 'F';
		String str = "Temperature is: ";
		int degrees = 88;
		printThis(str + degreeAbbr, degrees);
		
		printThis("Magnificent " , 8);
		
	}

	public static void printThis (String str, int x) {
	//	String arg1 = str;
	//	int arg2 = x;
		
		System.out.println( str + x );
	}
}
