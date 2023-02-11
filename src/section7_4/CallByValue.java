package section7_4;

import java.util.Arrays;

public class CallByValue {
	
	// JAVA is call by value language
	
	public static void main(String[] args) {
        int a = 1;
        System.out.println("Value of 'a' before the call: " + a);
                
        add100(a);
        System.out.println("Value of 'a' after the call: " + a);
                
        // now the same behavior with an array object
        int[] array = {1, 2, 3};
        System.out.println("Value of 'array' before the call: " + Arrays.toString(array));
                
        add100(array);
        System.out.println("Value of 'array' after the call: " + Arrays.toString(array));
    }
        
    public static void add100(int a) {
        a = a + 100;
        System.out.println("Value of 'a' inside the method: " + a);
    }
        
    public static void add100(int[] arr) {                     // updating the array object values
        for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + 100;
        }
        System.out.println("Values in 'arr' inside the method: " + Arrays.toString(arr));
    }

}
