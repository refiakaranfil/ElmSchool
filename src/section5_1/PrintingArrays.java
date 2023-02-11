package section5_1;

import java.util.Arrays;

public class PrintingArrays {
	
	public static void main (String[] args) {
		
		String [] names = {"John", "Fred", "Jane"};
		
		int [] numbers = { 1, 3, 5, -2 };
		
		String str = Arrays.toString(names);
		System.out.println(str);
		System.out.println(Arrays.toString(numbers));		
		printArray(names);
		System.out.println();
		printArray(numbers);
	}
	
	public static void printArray(String[] strArray) {
		
		for (int i = 0; i < strArray.length; i++) {
			
			System.out.print(strArray[i] + " ");
		}
	}
	
	public static void printArray(int[] a) {
	    System.out.print("{" + a[0]);        // print '{' followed by the first element of the array
	    
	    for (int i = 1; i < a.length; i++) { // loop starting from the second element, until the last
	        System.out.print(", " + a[i]);   // concatenate ',' followed by every consecutive element of the array
	    }
	    
	    System.out.println("}");             // print '}' to close the single line print statement and add a newline
	}

}
