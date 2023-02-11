package section7_4;

public class AutoboxingUnboxing { 
	
	public static void main(String[] args) {
		
		// Classname objectName = new Classname()
		
		int i = 5;
		
		Integer num = Integer.valueOf(5);  // Integer num = new Integer (5);
		
		Integer number = i;  // Autoboxing (automatically putting something in a 'box')
		
		
		int n = num;  // Unboxing (automatically take out something from a 'box')
		
	}

}
