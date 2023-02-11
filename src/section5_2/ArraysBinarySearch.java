package section5_2;

import java.util.Arrays;

public class ArraysBinarySearch {
	
	public static void main(String [] args) {
		
		int[] numbers = {0, 2, 4, 6, 8, 10};        			     // initialize an array called 'numbers'
        														     // elements inside the 'numbers' already have values in ascending order
		int index = Arrays.binarySearch(numbers, 6); 			     // search whether the 'numbers' has an element with a value of '6'
        														     // assign the index number of the element with the value '6' to 'index'
			System.out.println( index );                 			 // display the 'index'
		
		
		int index2 = Arrays.binarySearch(numbers, 7); 			     // the number 7 should have been after the number 6 (at index 3) and before 8 (at index 4)
																	 // and would've taken position at index number 4
			System.out.println( index2 );							 // Therefore binarySearch() returns -4 - 1 = -5 
	    
		
		int index3 = Arrays.binarySearch(numbers, 12);				 // number 12 should have been after the number 10 (at index 6)
																	 // (-6) - 1 = 7
			System.out.println( index3 );
			
			
		int index4 = Arrays.binarySearch(numbers, 0, 3, 4); 		 // from between the array elements at index 0 and up to index 4,
																	 // search for an element with a value of '2'
			System.out.println(index4); 
	}

}
