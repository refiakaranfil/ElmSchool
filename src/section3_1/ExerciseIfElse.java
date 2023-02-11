package section3_1;

public class ExerciseIfElse {
	
	public static void main(String[] args) {
		
		divisibleOrNotJava(457);
		
	}
	
	public static void divisibleOrNotMath (int num) {
		
		int last = num % 10; 
		num = num / 10;
		int middle = num % 10;
		int first = num / 10;
		
		int result = first + middle + last;
		
		if (num>99 && num<1000) {
			if (num % 3 == 0) {
			    System.out.println("Given number is divisible by 3");
		    } else {
		    	System.out.println("Given number is NOT divisible by 3");
		    }
		    } else {
		    	System.out.println("Given number is not in the range");
		    }
	}

	public static void divisibleOrNotJava(int num) {
		
		if (num>99 && num<1000) {
		if (num % 3 == 0) {
		    System.out.println("Given number is divisible by 3");
	    } else {
	    	System.out.println("Given number is NOT divisible by 3");
		  
	}
		}
	}
		
}