package section7_4;

public class SpecialInteger {
	
	public static int CURRENT_YEAR = 2022;
    
    /**
     * Given two int values, a and b,
     * will subtract b from a 
     * and return the absolute value as the difference.
     * @param a as an int
     * @param b as an int
     * @return the absolute value of a minus b
     */
    public static int difference(int a, int b) {
            return Math.abs(a - b);
    }

    /**
     * Given two int values, a and b,
     * will multiply a by b
     * and return the result.
     * If the result is greater than the MAX_VALUE of int,
     * then the MAX_VALUE will be returned.
     * @param a as an int
     * @param b as an int
     * @return a multiplied by b, or MAX_VALUE if the result is higher
     */
    public static int resultOrMax(int a, int b) {
            int result = a * b;
            
            // if result is a negative value, 
            // it means a * b is actually greater than maximum value an int can hold
            // And when we exceed that number, 
            // the Java Virtual Machine automatically gives us 
            // some negative value that is as much higher than the minimum int value 
            // as the difference of the true number from the maximum int value.
            if (result < 0) {
                    result = Integer.MAX_VALUE;
            }
            
            return result;
    }

}
