package section7_4;

public class TestingSpecialInteger {
	
	public static void main(String[] args) {
        System.out.println("Testing for the current year field.");
        System.out.println("The current year is: " + SpecialInteger.CURRENT_YEAR);
                
        System.out.println("Testing for the difference.");
        int a = 3;
        int b = 12;
        System.out.println("Difference is: " + SpecialInteger.difference(a, b));
                
        System.out.println("Testing for the result or MAX_VALUE generation method.");
        a = 88545858;
        b = 583858;
        System.out.println("We know that a multiplied by b would return more than an int can hold.");
        System.out.println("So instead of multiplying it blindly and getting a negative value ");
        System.out.println("we can use our 'smart' new method to get a better result: ");
        System.out.println(SpecialInteger.resultOrMax(88545858, 583858));
        System.out.println("Since we're getting a number above 2 billion, ");
        System.out.println("we can assume that a * b is greater than max int value.");
    }

}
