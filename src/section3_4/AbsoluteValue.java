package section3_4;

public class AbsoluteValue {
	
	public static void main (String[] args ) {
		
		System.out.println(absoluteValue(-2.0));
	}

	public static double absoluteValue (double x) {
		
		if (x < 0) {
			return -x;
		} else { 
			return x;
		}
//		System.out.println("This line is dead."); // compiler error on this line
			
	}
}
