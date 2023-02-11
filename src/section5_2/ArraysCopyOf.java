package section5_2;

import java.util.Arrays;

public class ArraysCopyOf {
	
	public static void main(String [] args) {
		
		int[] original = new int[10];

		for(int i=0; i < original.length; i++) {
		    original[i] = i;
		}

		int[] copy = Arrays.copyOf(original, original.length); // create a copy array of the 'original' that has the same size
		
		System.out.println( Arrays.toString(copy));
	}

}
