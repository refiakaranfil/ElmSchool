package section5_1;

import java.util.Arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		int [] numbers = {0, 2, 4, 6, 8, 10, 11, 13, 15, 17, 19};
		
		// Arrays.copyOf(original, index(exluded)) => it copies original array
		int [] copy = Arrays.copyOf(numbers, 8);
		
		// Arrays.copyOfRange(original, fromIdx(included), untilIdx(excluded)) =>
		// it copies original array based on given range
		int [] copyRange = Arrays.copyOfRange(numbers, 2, 7);
		
		int [] values = {8, 1, 15, 28, -9, 55};
		//Arrays.sort(array) => this method sorts the given array in ascending way
		// from smaller to biggers
		
		System.out.println(Arrays.toString(copy));
		
		System.out.println(Arrays.toString(copyRange));
		
		System.out.println(Arrays.toString(values));
		
		Arrays.sort(values);
		
		System.out.println(Arrays.toString(values));
		
		int diff = values[values.length - 1] - values[0];
		
		System.out.println(diff); // differences of number
	}

}
